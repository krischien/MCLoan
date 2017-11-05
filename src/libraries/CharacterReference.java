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
public class CharacterReference extends DBConnection {

    private static int id;
    private static int clientId;
    private static String name;
    private static String contactNo;
    private static String address;
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
     * @return the contactNo
     */
    public static String getContactNo() {
        return contactNo;
    }

    /**
     * @param aContactNo the contactNo to set
     */
    public static void setContactNo(String aContactNo) {
        contactNo = aContactNo;
    }

    /**
     * @return the address
     */
    public static String getAddress() {
        return address;
    }

    /**
     * @param aAddress the address to set
     */
    public static void setAddress(String aAddress) {
        address = aAddress;
    }

    public void selectAll() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM character_reference");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int clientIdl = rs.getInt("client_id");
                String contactNol = rs.getString("contact_no");
                String namel = rs.getString("name");
                String addressl = rs.getString("address");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(clientIdl);
                rows.add(namel);
                rows.add(contactNol);
                rows.add(addressl);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCharRef() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM character_reference where client_id = ?");
            stmt.setInt(1, getClientId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int clientIdl = rs.getInt("client_id");
                String contactNol = rs.getString("contact_no");
                String namel = rs.getString("name");
                String addressl = rs.getString("address");

                setId(idl);
                setClientId(clientIdl);
                setName(namel);
                setContactNo(contactNol);
                setAddress(addressl);
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
            PreparedStatement stmt = conn.prepareStatement("Select * FROM character_reference where client_id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int clientId = rs.getInt("client_id");
                String namel = rs.getString("name");
                String birthdatel = rs.getString("address");
                String contactNumberl = rs.getString("contact_no");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(clientId);
                rows.add(namel);
                rows.add(birthdatel);
                rows.add(contactNumberl);
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
            PreparedStatement stmt = conn.prepareStatement("INSERT into character_reference (client_id, name, contact_no, address) values(?, ?, ?, ?)");
            stmt.setInt(1, getClientId());
            stmt.setString(2, getName());
            stmt.setString(3, getContactNo());
            stmt.setString(4, getAddress());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE character_reference set client_id = ?, name = ?, contact_no = ?, address = ? WHERE id = ?");
            stmt.setInt(1, getClientId());
            stmt.setString(2, getName());
            stmt.setString(3, getContactNo());
            stmt.setString(4, getAddress());
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
            PreparedStatement stmt = conn.prepareStatement("UPDATE character_reference set client_id = ?, name = ?, contact_no = ?, address = ? WHERE id = ?");
            stmt.setInt(1, getClientId());
            stmt.setString(2, getName());
            stmt.setString(3, getContactNo());
            stmt.setString(4, getAddress());
            stmt.setInt(5, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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

}
