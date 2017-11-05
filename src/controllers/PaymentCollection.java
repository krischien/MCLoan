/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dbconn.DBConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Lancepyro
 */
public class PaymentCollection extends DBConnection {

    private static int id;
    private static String orNum;
    private static int client_id;
    private static String pnNum;
    private static double amount;
    private static String monthPaid;
    private static Date transactionDate;
    private static boolean active;
    private static double change;
    private static int branch_id;
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
     * @return the orNum
     */
    public static String getOrNum() {
        return orNum;
    }

    /**
     * @param aOrNum the orNum to set
     */
    public static void setOrNum(String aOrNum) {
        orNum = aOrNum;
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
     * @return the pnNum
     */
    public static String getPnNum() {
        return pnNum;
    }

    /**
     * @param aPnNum the pnNum to set
     */
    public static void setPnNum(String aPnNum) {
        pnNum = aPnNum;
    }

    /**
     * @return the amount
     */
    public static double getAmount() {
        return amount;
    }

    /**
     * @param aAmount the amount to set
     */
    public static void setAmount(double aAmount) {
        amount = aAmount;
    }

    /**
     * @return the monthPaid
     */
    public static String getMonthPaid() {
        return monthPaid;
    }

    /**
     * @param aMonthPaid the monthPaid to set
     */
    public static void setMonthPaid(String aMonthPaid) {
        monthPaid = aMonthPaid;
    }

    /**
     * @return the transactionDate
     */
    public static Date getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param aTransactionDate the transactionDate to set
     */
    public static void setTransactionDate(Date aTransactionDate) {
        transactionDate = aTransactionDate;
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

    /**
     * @return the change
     */
    public static double getChange() {
        return change;
    }

    /**
     * @param aChange the change to set
     */
    public static void setChange(double aChange) {
        change = aChange;
    }

    /**
     * @return the branch_id
     */
    public static int getBranch_id() {
        return branch_id;
    }

    /**
     * @param aBranch_id the branch_id to set
     */
    public static void setBranch_id(int aBranch_id) {
        branch_id = aBranch_id;
    }

    public void selectAll() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM payment_collection where active = 1 and branch_id = ?");
            stmt.setInt(1, getBranch_id());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String orNuml = rs.getString("orNum");
                String clientIdl = rs.getString("client_id");
                String pnNuml = rs.getString("pnNum");
                double amountl = rs.getDouble("amount");
                double changel = rs.getDouble("change");
                String monthPaidl = rs.getString("monthPaid");
                Date transactionDate = rs.getDate("transactionDate");
                boolean activel = rs.getBoolean("active");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(orNuml);
                rows.add(clientIdl);
                rows.add(pnNuml);
                rows.add(amountl);
                rows.add(changel);
                rows.add(monthPaidl);
                rows.add(transactionDate);
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
            PreparedStatement stmt = conn.prepareStatement("INSERT into payment_collection (orNum, client_id, pnNum, amount, monthPaid, transactionDate,active, change, branch_id) values( ?, ?, ?, ?, ?, NOW(), ?, ?, ?)");
            stmt.setString(1, getOrNum());
            stmt.setInt(2, getClient_id());
            stmt.setString(3, getPnNum());
            stmt.setDouble(4, getAmount());
            stmt.setString(5, getMonthPaid());
            stmt.setBoolean(6, isActive());
            stmt.setDouble(7, getChange());
            stmt.setInt(8, getBranch_id());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE payment_collection set orNum = ?, client_id = ?, pnNum = ?, amount = ?, monthPaid = ?, transactionDate = NOW(), active = ?, change= ?, branch_id = ? WHERE id = ?");
            stmt.setString(1, getOrNum());
            stmt.setInt(2, getClient_id());
            stmt.setString(3, getPnNum());
            stmt.setDouble(4, getAmount());
            stmt.setString(5, getMonthPaid());
            stmt.setBoolean(6, isActive());
            stmt.setDouble(7, getChange());
            stmt.setInt(8, getBranch_id());
            stmt.setInt(9, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE payment_collection set active = ? WHERE id = ?");
            stmt.setBoolean(1, isActive());
            stmt.setInt(2, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
