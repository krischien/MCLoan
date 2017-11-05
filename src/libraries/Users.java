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
public class Users extends DBConnection {
    
    private static int id;
    private static String userName;
    private static String password;
    private static String firstName;
    private static String middleName;
    private static String lastName;
    private static Date birthdate;
    private static String contactNumber;
    private static byte[] picture;
    private static int roleId;
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
     * @return the userName
     */
    public static String getUserName() {
        return userName;
    }

    /**
     * @param aUserName the userName to set
     */
    public static void setUserName(String aUserName) {
        userName = aUserName;
    }

    /**
     * @return the password
     */
    public static String getPassword() {
        return password;
    }

    /**
     * @param aPassword the password to set
     */
    public static void setPassword(String aPassword) {
        password = aPassword;
    }

    /**
     * @return the firstName
     */
    public static String getFirstName() {
        return firstName;
    }

    /**
     * @param aFirstName the firstName to set
     */
    public static void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    /**
     * @return the middleName
     */
    public static String getMiddleName() {
        return middleName;
    }

    /**
     * @param aMiddleName the middleName to set
     */
    public static void setMiddleName(String aMiddleName) {
        middleName = aMiddleName;
    }

    /**
     * @return the lastName
     */
    public static String getLastName() {
        return lastName;
    }

    /**
     * @param aLastName the lastName to set
     */
    public static void setLastName(String aLastName) {
        lastName = aLastName;
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
     * @return the contactNumber
     */
    public static String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param aContactNumber the contactNumber to set
     */
    public static void setContactNumber(String aContactNumber) {
        contactNumber = aContactNumber;
    }

    /**
     * @return the picture
     */
    public static byte[] getPicture() {
        return picture;
    }

    /**
     * @param aPicture the picture to set
     */
    public static void setPicture(byte[] aPicture) {
        picture = aPicture;
    }

    /**
     * @return the roleId
     */
    public static int getRoleId() {
        return roleId;
    }

    /**
     * @param aRoleId the roleId to set
     */
    public static void setRoleId(int aRoleId) {
        roleId = aRoleId;
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
            PreparedStatement stmt = conn.prepareStatement("Select * FROM users where active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String userNamel = rs.getString("username");
                String passwordl = rs.getString("password");
                String firstNamel = rs.getString("firstname");
                String middleNamel = rs.getString("middlename");
                String lastNamel = rs.getString("lastname");
                Date birthdatel = rs.getDate("birthdate");
                String contactNumberl = rs.getString("contactNo");
                byte[] picturel = rs.getBytes("picture");
                int roleIdl = rs.getInt("roleId");
                boolean activel = rs.getBoolean("active");
                
                Vector rows = new Vector();
                rows.add(idl);
                rows.add(userNamel);
                rows.add(passwordl);
                rows.add(firstNamel);
                rows.add(middleNamel);
                rows.add(lastNamel);
                rows.add(birthdatel);
                rows.add(contactNumberl);
                rows.add(picturel);
                rows.add(roleIdl);
                rows.add(activel);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void selectUserLogin() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users where username = ? and password = ?");
            stmt.setString(1, getUserName());
            stmt.setString(2, getPassword());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String usernamel = rs.getString("username");
                String firstnamel =rs.getString("firstname");
                String middlenamel = rs.getString("middlename");
                String lastnamel = rs.getString("lastname");
                int roleIdl = rs.getInt("roleId");
                
                this.setId(idl);
                this.setUserName(usernamel);
                this.setFirstName(firstnamel);
                this.setMiddleName(middlenamel);
                this.setLastName(lastnamel);
                this.setRoleId(roleIdl);
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
            PreparedStatement stmt = conn.prepareStatement("INSERT into users (username, password, firstname, middlename, lastname, birthdate, contactNo, picture, active) values(?, ?, ?, ?,?, ?, ?, ?, ?)");
            stmt.setString(1, getUserName());
            stmt.setString(2, getPassword());
            stmt.setString(3, getFirstName());
            stmt.setString(4, getMiddleName());
            stmt.setString(5, getLastName());
            stmt.setDate(6, getBirthdate());
            stmt.setString(7, getContactNumber());
            stmt.setBytes(8, getPicture());
            stmt.setBoolean(9, isActive());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE users set username = ?, password = ?, firstname = ?, middlename = ?, lastname = ?, birthdate = ?, contactNo = ?, picture = ?, active = ? WHERE id = ?");
            stmt.setString(1, getUserName());
            stmt.setString(2, getPassword());
            stmt.setString(3, getFirstName());
            stmt.setString(4, getMiddleName());
            stmt.setString(5, getLastName());
            stmt.setDate(6, getBirthdate());
            stmt.setString(7, getContactNumber());
            stmt.setBytes(8, getPicture());
            stmt.setBoolean(9, isActive());
            stmt.setInt(10, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE users set username = ?, password = ?, firstname = ?, middlename = ?, lastname = ?, birthdate = ?, contactNo = ?, picture = ?, active = ? WHERE id = ?");
            stmt.setString(1, getUserName());
            stmt.setString(2, getPassword());
            stmt.setString(3, getFirstName());
            stmt.setString(4, getMiddleName());
            stmt.setString(5, getLastName());
            stmt.setDate(6, getBirthdate());
            stmt.setString(7, getContactNumber());
            stmt.setBytes(8, getPicture());
            stmt.setBoolean(9, isActive());
            stmt.setInt(10, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
