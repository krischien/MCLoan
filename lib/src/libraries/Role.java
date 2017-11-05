/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import dbconn.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Lancepyro
 */
public class Role extends DBConnection {

    private static int id;
    private static String roleName;
    private static String description;
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
     * @return the roleName
     */
    public static String getRoleName() {
        return roleName;
    }

    /**
     * @param aRoleName the roleName to set
     */
    public static void setRoleName(String aRoleName) {
        roleName = aRoleName;
    }

    /**
     * @return the description
     */
    public static String getDescription() {
        return description;
    }

    /**
     * @param aDescription the description to set
     */
    public static void setDescription(String aDescription) {
        description = aDescription;
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
            PreparedStatement stmt = conn.prepareStatement("Select * FROM role where active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String namel = rs.getString("roleName");
                String descrpitionl = rs.getString("description");
                boolean activel = rs.getBoolean("active");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(namel);
                rows.add(descrpitionl);
                rows.add(activel);
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
            PreparedStatement stmt = conn.prepareStatement("INSERT into role (roleName, description, active) values( ?, ?, ?)");
            stmt.setString(1, getRoleName());
            stmt.setString(2, getDescription());
            stmt.setBoolean(3, isActive());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE character_reference set roleName = ?, description = ?, active = ? WHERE id = ?");
            stmt.setString(1, getRoleName());
            stmt.setString(2, getDescription());
            stmt.setBoolean(3, isActive());
            stmt.setInt(4, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE character_reference set roleName = ?, description = ?, active = ? WHERE id = ?");
            stmt.setString(1, getRoleName());
            stmt.setString(2, getDescription());
            stmt.setBoolean(3, isActive());
            stmt.setInt(4, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
