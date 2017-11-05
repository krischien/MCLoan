/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libraries;

import dbconn.DBConnection;
import static dbconn.DBConnection.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Lancepyro
 */
public class Bank extends DBConnection{
    
    private static int id;
    private static String code;
    private static String name;
    private static String address;
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
     * @return the code
     */
    public static String getCode() {
        return code;
    }

    /**
     * @param aCode the code to set
     */
    public static void setCode(String aCode) {
        code = aCode;
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
            PreparedStatement stmt = conn.prepareStatement("Select * FROM banks WHERE active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String codel = rs.getString("code");
                String namel = rs.getString("name");
                String addressl = rs.getString("address");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(namel);
                rows.add(addressl);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void selectClietBank() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM banks WHERE active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String codel = rs.getString("code");
                String namel = rs.getString("name");
                String addressl = rs.getString("address");

                Vector rows = new Vector();
                rows.add(idl);                
                rows.add(codel);
                rows.add(namel);
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
            PreparedStatement stmt = conn.prepareStatement("INSERT into banks (code, name, address, active) values(?, ?, ?, ?)");
            stmt.setString(1, getCode());
            stmt.setString(2, getName());
            stmt.setString(3, getAddress());
            stmt.setBoolean(4, isActive());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE banks set code = ?, name = ?, address = ?, active = ? WHERE id = ?");
            stmt.setString(1, getCode());
            stmt.setString(2, getName());
            stmt.setString(3, getAddress());
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
            PreparedStatement stmt = conn.prepareStatement("UPDATE banks set code = ? ,name = ?, address = ?, active = ? WHERE id = ?");
            stmt.setString(1, getCode());
            stmt.setString(2, getName());
            stmt.setString(3, getAddress());
            stmt.setBoolean(4, isActive());
            stmt.setInt(5, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

