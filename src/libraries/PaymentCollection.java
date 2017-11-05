/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import dbconn.DBConnection;
import static dbconn.DBConnection.conn;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import static libraries.Bank.setData;

/**
 *
 * @author Lancepyro
 */
public class PaymentCollection extends DBConnection {

    private static int id;
    private static String orNum;
    private static int client_id;
    private static String pnNUm;
    private static double amount;
    private static double change;
    private static String monthPaid;
    private static Date transactionDate;
    private static boolean active;
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
     * @return the pnNUm
     */
    public static String getPnNUm() {
        return pnNUm;
    }

    /**
     * @param aPnNUm the pnNUm to set
     */
    public static void setPnNUm(String aPnNUm) {
        pnNUm = aPnNUm;
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
            PreparedStatement stmt = conn.prepareStatement("Select * FROM payment_collection WHERE active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String orNuml = rs.getString("orNum");
                int client_idl = rs.getInt("client_id");
                String pnNUml = rs.getString("pnNum");
                double amountl = rs.getDouble("amount");
                String monthPaidl = rs.getString("monthPaid");
                Date transactionDatel = rs.getDate("transactionDate");
                boolean activel = rs.getBoolean("active");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(orNuml);
                rows.add(client_idl);
                rows.add(pnNUml);
                rows.add(amountl);
                rows.add(monthPaidl);
                rows.add(transactionDatel);
                rows.add(activel);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void countTransactionByPN() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select count(id) as id FROM payment_collection WHERE active = 1 and pnNum = ?");
            stmt.setString(1, getPnNUm());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");

                this.setId(idl);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
       public void showSL() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM payment_collection pc LEFT JOIN clients c ON(pc.client_id=c.id) LEFT JOIN pensions p on(pc.client_id=p.client_id) LEFT JOIN loan l ON(pc.client_id=l.clientId)  WHERE pc.active = 1 and pc.client_id = ? ORDER BY pc.transactionDate ASC");
            stmt.setInt(1, getId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String orNuml = rs.getString("orNum");
                int client_idl = rs.getInt("client_id");
                String pnNUml = rs.getString("pnNum");
                String LoanType = rs.getString("loanType");
                String loanTerm = rs.getString("loanTerm");
                double amountl = rs.getDouble("amount");
                String monthPaidl = rs.getString("monthPaid");
                Date transactionDatel = rs.getDate("transactionDate");
                double changel = rs.getDouble("change");
                boolean activel = rs.getBoolean("active");

                Vector rows = new Vector();
                rows.add(idl);                   
                rows.add(client_idl);
                rows.add(pnNUml);
                rows.add(orNuml);
                rows.add(LoanType);
                rows.add(loanTerm);
                rows.add(amountl);
                rows.add(changel);
                rows.add(transactionDatel);
                rows.add(monthPaidl);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 
       
           
    public void insert() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("INSERT into payment_collection (orNum, client_id, pnNum, amount, monthPaid, transactionDate, branch_id, active) values(?, ?, ?, ?, ?, NOW(), ?, ?)");
            stmt.setString(1, getOrNum());
            stmt.setInt(2, getClient_id());
            stmt.setString(3, getPnNUm());
            stmt.setDouble(4, getAmount());
            stmt.setString(5, getMonthPaid());
            stmt.setInt(6, getBranch_id());
            stmt.setBoolean(7, isActive());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("update payment_collection set orNum = ?, client_id = ?, pnNum = ?, amount = ?, monthPaid = ?, transactionDate = NOW(), branch_id = ?, active = ? where id = ?");
            stmt.setString(1, getOrNum());
            stmt.setInt(2, getClient_id());
            stmt.setString(3, getPnNUm());
            stmt.setDouble(4, getAmount());
            stmt.setString(5, getMonthPaid());
            stmt.setInt(6, getBranch_id());
            stmt.setBoolean(7, isActive());
            stmt.setInt(8, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("update payment_collection set active = ? where id = ?");
            stmt.setBoolean(1, isActive());
            stmt.setInt(2, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
