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
public class Pension extends DBConnection {

    private static int id;
    private static int client_id;
    private static String name;
    private static String others;
    private static String type;
    private static String pension_no;
    private static int bank_id;
    private static String bank_account_no;
    private static double monthly_pension;
    private static String date_remittance;
    private static int branchId;
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
     * @return the client_id
     */
    public static int getClient_id() {
        return client_id;
    }

    /**
     * @param aClient_id the client_id to set
     */
    public static void setClient_id(int aClient_id) {
        client_id = aClient_id;
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
     * @return the others
     */
    public static String getOthers() {
        return others;
    }

    /**
     * @param aOthers the others to set
     */
    public static void setOthers(String aOthers) {
        others = aOthers;
    }

    /**
     * @return the type
     */
    public static String getType() {
        return type;
    }

    /**
     * @param aType the type to set
     */
    public static void setType(String aType) {
        type = aType;
    }

    /**
     * @return the pension_no
     */
    public static String getPension_no() {
        return pension_no;
    }

    /**
     * @param aPension_no the pension_no to set
     */
    public static void setPension_no(String aPension_no) {
        pension_no = aPension_no;
    }

    /**
     * @return the bank_id
     */
    public static int getBank_id() {
        return bank_id;
    }

    /**
     * @param aBank_id the bank_id to set
     */
    public static void setBank_id(int aBank_id) {
        bank_id = aBank_id;
    }

    /**
     * @return the bank_account_no
     */
    public static String getBank_account_no() {
        return bank_account_no;
    }

    /**
     * @param aBank_account_no the bank_account_no to set
     */
    public static void setBank_account_no(String aBank_account_no) {
        bank_account_no = aBank_account_no;
    }

    /**
     * @return the monthly_pension
     */
    public static double getMonthly_pension() {
        return monthly_pension;
    }

    /**
     * @param aMonthly_pension the monthly_pension to set
     */
    public static void setMonthly_pension(double aMonthly_pension) {
        monthly_pension = aMonthly_pension;
    }

    /**
     * @return the date_remittance
     */
    public static String getDate_remittance() {
        return date_remittance;
    }

    /**
     * @param aDate_remittance the date_remittance to set
     */
    public static void setDate_remittance(String aDate_remittance) {
        date_remittance = aDate_remittance;
    }

    /**
     * @return the branchId
     */
    public static int getBranchId() {
        return branchId;
    }

    /**
     * @param aBranchId the branchId to set
     */
    public static void setBranchId(int aBranchId) {
        branchId = aBranchId;
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
            PreparedStatement stmt = conn.prepareStatement("Select * FROM pensions where active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int client_idl = rs.getInt("client_id");
                String namel = rs.getString("name");
                String othersl = rs.getString("others");
                String typel = rs.getString("type");
                String pension_nol = rs.getString("pension_no");
                int bank_idl = rs.getInt("bank_id");
                String bank_account_nol = rs.getString("bank_account_no");
                double monthly_pensionl = rs.getDouble("monthly_pension");
                String date_remittancel = rs.getString("date_remittance");
                int branchIdl = rs.getInt("branch_id");
                boolean activel = rs.getBoolean("active");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(client_idl);
                rows.add(namel);
                rows.add(othersl);
                rows.add(typel);
                rows.add(pension_nol);
                rows.add(bank_idl);
                rows.add(bank_account_nol);
                rows.add(monthly_pensionl);
                rows.add(date_remittancel);
                rows.add(branchIdl);
                rows.add(activel);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectClientPension() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM pensions where active = 1 and client_id = ?");
            stmt.setInt(1, getClient_id());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int client_idl = rs.getInt("client_id");
                String namel = rs.getString("name");
                String othersl = rs.getString("others");
                String typel = rs.getString("type");
                String pension_nol = rs.getString("pension_no");
                int bank_idl = rs.getInt("bank_id");
                String bank_account_nol = rs.getString("bank_account_no");
                double monthly_pensionl = rs.getDouble("monthly_pension");
                String date_remittancel = rs.getString("date_remittance");
                int branchIdl = rs.getInt("branch_id");
                boolean activel = rs.getBoolean("active");

                setId(idl);
                setClient_id(client_idl);
                setName(namel);
                setOthers(othersl);
                setType(typel);
                setPension_no(pension_nol);
                setBank_id(bank_idl);
                setBank_account_no(bank_account_nol);
                setMonthly_pension(monthly_pensionl);
                setDate_remittance(date_remittancel);
                setBranchId(branchIdl);
                setActive(activel);
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
            PreparedStatement stmt = conn.prepareStatement("INSERT into pensions (client_id, name, others, type, pension_no, bank_id, bank_account_no, monthly_pension, date_remittance, branch_id, active) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, getClient_id());
            stmt.setString(2, getName());
            stmt.setString(3, getOthers());
            stmt.setString(4, getType());
            stmt.setString(5, getPension_no());
            stmt.setInt(6, getBank_id());
            stmt.setString(7, getBank_account_no());
            stmt.setDouble(8, getMonthly_pension());
            stmt.setString(9, getDate_remittance());
            stmt.setInt(10, getBranchId());
            stmt.setBoolean(11, isActive());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE pensions set client_id = ?, name = ?, others = ?, type = ?, pension_no = ?, bank_id = ?, bank_account_no = ?, monthly_pension = ?, date_remittance = ?, branch_id = ?, active = ? WHERE id = ?");
            stmt.setInt(1, getClient_id());
            stmt.setString(2, getName());
            stmt.setString(3, getOthers());
            stmt.setString(4, getType());
            stmt.setString(5, getPension_no());
            stmt.setInt(6, getBank_id());
            stmt.setString(7, getBank_account_no());
            stmt.setDouble(8, getMonthly_pension());
            stmt.setString(9, getDate_remittance());
            stmt.setInt(10, getBranchId());
            stmt.setBoolean(11, isActive());
            stmt.setInt(12, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE pensions set client_id = ?, name = ?, others = ?, type = ?, pension_no = ?, bank_id = ?, bank_account_no = ?, monthly_pension = ?, date_remittance = ?, branch_id = ?, active = ? WHERE id = ?");
            stmt.setInt(1, getClient_id());
            stmt.setString(2, getName());
            stmt.setString(3, getOthers());
            stmt.setString(4, getType());
            stmt.setString(5, getPension_no());
            stmt.setInt(6, getBank_id());
            stmt.setString(7, getBank_account_no());
            stmt.setDouble(8, getMonthly_pension());
            stmt.setString(9, getDate_remittance());
            stmt.setInt(10, getBranchId());
            stmt.setBoolean(11, isActive());
            stmt.setInt(12, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
