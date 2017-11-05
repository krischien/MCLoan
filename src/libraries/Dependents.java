/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import dbconn.DBConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Lancepyro
 */
public class Dependents extends DBConnection {

    private static int id;
    private static int clientId;
    private static String name;
    private static Date birthdate;
    private static Date dateCreated;
    private static Date dateUpdated;
    private static boolean active;
    private static Vector data;

    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }

    /**
     * @param aId the id to set
     */
    public static void setId(int aId) {
        id = aId;
    }

    /**
     * @return the clientId
     */
    public static int getClientId() {
        return clientId;
    }

    /**
     * @param aClientId the clientId to set
     */
    public static void setClientId(int aClientId) {
        clientId = aClientId;
    }

    /**
     * @return the name
     */
    public static String getName() {
        return name;
    }

    /**
     * @param aName the name to set
     */
    public static void setName(String aName) {
        name = aName;
    }

    /**
     * @return the birthdate
     */
    public static Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param aBirthdate the birthdate to set
     */
    public static void setBirthdate(Date aBirthdate) {
        birthdate = aBirthdate;
    }

    /**
     * @return the dateCreated
     */
    public static Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param aDateCreated the dateCreated to set
     */
    public static void setDateCreated(Date aDateCreated) {
        dateCreated = aDateCreated;
    }

    /**
     * @return the dateUpdated
     */
    public static Date getDateUpdated() {
        return dateUpdated;
    }

    /**
     * @param aDateUpdated the dateUpdated to set
     */
    public static void setDateUpdated(Date aDateUpdated) {
        dateUpdated = aDateUpdated;
    }

    /**
     * @return the active
     */
    public static boolean isActive() {
        return active;
    }

    /**
     * @param aActive the active to set
     */
    public static void setActive(boolean aActive) {
        active = aActive;
    }

    /**
     * @return the data
     */
    public static Vector getData() {
        return data;
    }

    /**
     * @param aData the data to set
     */
    public static void setData(Vector aData) {
        data = aData;
    }

    public void selectAll() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM dependents where active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int clientIdl = rs.getInt("client_id");
                String namel = rs.getString("name");
                Date birthdatel = rs.getDate("birthdate");
                Date dateCreatedl = rs.getDate("date_created");
                Date dateUpdatedl = rs.getDate("date_updated");
                boolean activel = rs.getBoolean("active");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(clientIdl);
                rows.add(namel);
                rows.add(birthdatel);
                rows.add(dateCreatedl);
                rows.add(dateUpdatedl);
                rows.add(activel);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void displayDependent(int id) {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM dependents where active = 1 and client_id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String namel = rs.getString("name");
                Date birthdatel = rs.getDate("birthdate");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(namel);
                rows.add(birthdatel);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("INSERT into dependents (client_id, name, birthdate, date_created, date_updated, active) values(?, ?, ?, NOW(), ? ,?)");
            stmt.setInt(1, getClientId());
            stmt.setString(2, getName());
            stmt.setDate(3, getBirthdate());
            stmt.setDate(4, getDateUpdated());
            stmt.setBoolean(5, isActive());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE dependents set date_updated = NOW(), active = ? WHERE id = ?");
            stmt.setInt(1, getClientId());
            stmt.setString(2, getName());
            stmt.setDate(3, getBirthdate());
            stmt.setBoolean(4, isActive());
            stmt.setInt(5, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE dependents set date_updated = NOW(), active = ? WHERE id = ?");
            stmt.setBoolean(1, isActive());
            stmt.setInt(2, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
