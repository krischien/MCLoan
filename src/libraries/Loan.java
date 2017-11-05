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
public class Loan extends DBConnection {

    private static int id;
    private static int clientId;
    private static String pnNo;
    private static Date date;
    private static double monthlyAmmortization;
    private static double monthlyChange;
    private static double loanTerm;
    private static double grossLoan;
    private static double interests;
    private static double principal;
    private static double processingFee;
    private static double otherDeduction;
    private static double amoountOfCheck;
    private static Date firstDue;
    private static Date lastDue;
    private static int branchId;
    private static String accountNo;
    private static boolean active;
    private static String fullName;
    private static String loanType;
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
     * @return the pnNo
     */
    public static String getPnNo() {
        return pnNo;
    }

    /**
     * @param aPnNo the pnNo to set
     */
    public static void setPnNo(String aPnNo) {
        pnNo = aPnNo;
    }

    /**
     * @return the date
     */
    public static Date getDate() {
        return date;
    }

    /**
     * @param aDate the date to set
     */
    public static void setDate(Date aDate) {
        date = aDate;
    }

    /**
     * @return the monthlyAmmortization
     */
    public static double getMonthlyAmmortization() {
        return monthlyAmmortization;
    }

    /**
     * @param aMonthlyAmmortization the monthlyAmmortization to set
     */
    public static void setMonthlyAmmortization(double aMonthlyAmmortization) {
        monthlyAmmortization = aMonthlyAmmortization;
    }

    /**
     * @return the monthlyChange
     */
    public static double getMonthlyChange() {
        return monthlyChange;
    }

    /**
     * @param aMonthlyChange the monthlyChange to set
     */
    public static void setMonthlyChange(double aMonthlyChange) {
        monthlyChange = aMonthlyChange;
    }

    /**
     * @return the loanTerm
     */
    public static double getLoanTerm() {
        return loanTerm;
    }

    /**
     * @param aLoanTerm the loanTerm to set
     */
    public static void setLoanTerm(double aLoanTerm) {
        loanTerm = aLoanTerm;
    }

    /**
     * @return the grossLoan
     */
    public static double getGrossLoan() {
        return grossLoan;
    }

    /**
     * @param aGrossLoan the grossLoan to set
     */
    public static void setGrossLoan(double aGrossLoan) {
        grossLoan = aGrossLoan;
    }

    /**
     * @return the interests
     */
    public static double getInterests() {
        return interests;
    }

    /**
     * @param aInterests the interests to set
     */
    public static void setInterests(double aInterests) {
        interests = aInterests;
    }

    /**
     * @return the principal
     */
    public static double getPrincipal() {
        return principal;
    }

    /**
     * @param aPrincipal the principal to set
     */
    public static void setPrincipal(double aPrincipal) {
        principal = aPrincipal;
    }

    /**
     * @return the processingFee
     */
    public static double getProcessingFee() {
        return processingFee;
    }

    /**
     * @param aProcessingFee the processingFee to set
     */
    public static void setProcessingFee(double aProcessingFee) {
        processingFee = aProcessingFee;
    }

    /**
     * @return the otherDeduction
     */
    public static double getOtherDeduction() {
        return otherDeduction;
    }

    /**
     * @param aOtherDeduction the otherDeduction to set
     */
    public static void setOtherDeduction(double aOtherDeduction) {
        otherDeduction = aOtherDeduction;
    }

    /**
     * @return the amoountOfCheck
     */
    public static double getAmoountOfCheck() {
        return amoountOfCheck;
    }

    /**
     * @param aAmoountOfCheck the amoountOfCheck to set
     */
    public static void setAmoountOfCheck(double aAmoountOfCheck) {
        amoountOfCheck = aAmoountOfCheck;
    }

    /**
     * @return the firstDue
     */
    public static Date getFirstDue() {
        return firstDue;
    }

    /**
     * @param aFirstDue the firstDue to set
     */
    public static void setFirstDue(Date aFirstDue) {
        firstDue = aFirstDue;
    }

    /**
     * @return the lastDue
     */
    public static Date getLastDue() {
        return lastDue;
    }

    /**
     * @param aLastDue the lastDue to set
     */
    public static void setLastDue(Date aLastDue) {
        lastDue = aLastDue;
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
     * @return the fullName
     */
    public static String getFullName() {
        return fullName;
    }

    /**
     * @param aFullName the fullName to set
     */
    public static void setFullName(String aFullName) {
        fullName = aFullName;
    }

    /**
     * @return the loanType
     */
    public static String getLoanType() {
        return loanType;
    }

    /**
     * @param aLoanType the loanType to set
     */
    public static void setLoanType(String aLoanType) {
        loanType = aLoanType;
    }

    /**
     * @return the accountNo
     */
    public static String getAccountNo() {
        return accountNo;
    }

    /**
     * @param aAccountNo the accountNo to set
     */
    public static void setAccountNo(String aAccountNo) {
        accountNo = aAccountNo;
    }

    public void selectAll() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM loan where active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int clientIdl = rs.getInt("clientId");
                String pnNol = rs.getString("pnNo");
                Date datel = rs.getDate("date");
                String loanTypel = rs.getString("loanType");
                double monthlyAmmortizationl = rs.getDouble("monthlyAmmortization");
                double monthlyChangel = rs.getDouble("monthlyChange");
                double loanTerml = rs.getDouble("loanTerm");
                double grossLoanl = rs.getDouble("grossLoan");
                double interestsl = rs.getDouble("interest");
                double principall = rs.getDouble("principal");
                double processingFeel = rs.getDouble("processingFee");
                double otherDeductionl = rs.getDouble("otherDeduction");
                double amoountOfCheckl = rs.getDouble("amountOfCheck");
                Date firstDuel = rs.getDate("firstDue");
                Date lastDuel = rs.getDate("lastDue");
                int branchIdl = rs.getInt("branch_id");
                boolean activel = rs.getBoolean("active");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(clientIdl);
                rows.add(pnNol);
                rows.add(datel);
                rows.add(loanTypel);
                rows.add(monthlyAmmortizationl);
                rows.add(monthlyChangel);
                rows.add(loanTerml);
                rows.add(grossLoanl);
                rows.add(interestsl);
                rows.add(principall);
                rows.add(processingFeel);
                rows.add(otherDeductionl);
                rows.add(amoountOfCheckl);
                rows.add(firstDuel);
                rows.add(lastDuel);
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

    public void selectLoan() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select * FROM loan l LEFT JOIN clients c ON(l.clientId = c.id)where l.active = 1 and l.id = ?");
            stmt.setInt(1, getId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int clientIdl = rs.getInt("clientId");
                String pnNol = rs.getString("pnNo");
                Date datel = rs.getDate("date");
                String loanTypel = rs.getString("loanType");
                double monthlyAmmortizationl = rs.getDouble("monthlyAmmortization");
                double monthlyChangel = rs.getDouble("monthlyChange");
                double loanTerml = rs.getDouble("loanTerm");
                double grossLoanl = rs.getDouble("grossLoan");
                double interestsl = rs.getDouble("interest");
                double principall = rs.getDouble("principal");
                double processingFeel = rs.getDouble("processingFee");
                double otherDeductionl = rs.getDouble("otherDeduction");
                double amoountOfCheckl = rs.getDouble("amountOfCheck");
                Date firstDuel = rs.getDate("firstDue");
                Date lastDuel = rs.getDate("lastDue");
                int branchIdl = rs.getInt("branch_id");
                boolean activel = rs.getBoolean("active");
                String accountNol = rs.getString("account_no");
                String firstname = rs.getString("firstname");
                String middlename = rs.getString("middlename");
                String lastname = rs.getString("lastname");

                setId(idl);
                setClientId(clientIdl);
                setPnNo(pnNol);
                setDate(datel);
                setLoanType(loanTypel);
                setMonthlyAmmortization(monthlyAmmortizationl);
                setMonthlyChange(monthlyChangel);
                setLoanTerm(loanTerml);
                setGrossLoan(grossLoanl);
                setInterests(interestsl);
                setPrincipal(principall);
                setProcessingFee(processingFeel);
                setOtherDeduction(otherDeductionl);
                setAmoountOfCheck(amoountOfCheckl);
                setFirstDue(firstDuel);
                setLastDue(lastDuel);
                setAccountNo(accountNol);
                setFullName(firstname+" "+middlename+" "+lastname);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectAllLoans() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("SELECT * from loan l LEFT JOIN clients c ON (l.clientId = c.id)");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int clientIdl = rs.getInt("clientId");
                String firstnamel = rs.getString("firstname");
                String middlenamel = rs.getString("middlename");
                String lastnamel = rs.getString("lastname");
                String pnNol = rs.getString("pnNo");
                Date datel = rs.getDate("date");
                String loanTypel = rs.getString("loanType");
                double monthlyAmmortizationl = rs.getDouble("monthlyAmmortization");
                double monthlyChangel = rs.getDouble("monthlyChange");
                double loanTerml = rs.getDouble("loanTerm");
                double grossLoanl = rs.getDouble("grossLoan");
                double interestsl = rs.getDouble("interest");
                double principall = rs.getDouble("principal");
                double processingFeel = rs.getDouble("processingFee");
                double otherDeductionl = rs.getDouble("otherDeduction");
                double amoountOfCheckl = rs.getDouble("amountOfCheck");
                Date firstDuel = rs.getDate("firstDue");
                Date lastDuel = rs.getDate("lastDue");
                int branchIdl = rs.getInt("branch_id");
                boolean activel = rs.getBoolean("active");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(clientIdl);
                rows.add(firstnamel + " " + middlenamel + " " + lastnamel);
                rows.add(pnNol);
                rows.add(datel);
                rows.add(loanTypel);
                rows.add(monthlyAmmortizationl);
                rows.add(monthlyChangel);
                rows.add(loanTerml);
                rows.add(grossLoanl);
                rows.add(interestsl);
                rows.add(principall);
                rows.add(processingFeel);
                rows.add(otherDeductionl);
                rows.add(amoountOfCheckl);
                rows.add(firstDuel);
                rows.add(lastDuel);
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
    
    public void selectPN() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("select * from clients c RIGHT JOIN loan l ON(c.id=l.clientId) where  c.active = 1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                String pnNuml = rs.getString("pnNo");
                int clientIdl = rs.getInt("clientId");
                String firstnamel = rs.getString("firstname");
                String lastnamel = rs.getString("lastname");
                String typel = rs.getString("loantype");
                String birthdatel = rs.getString("birthdate");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(clientIdl);
                rows.add(firstnamel+" "+lastnamel);
                rows.add(pnNuml);
                rows.add(typel);
                this.getData().add(rows);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void countPopulation() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(id) as count from loan");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("count");

                this.setId(idl);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectLastNewLoan() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select *,TIMESTAMPDIFF(MONTH,now(),lastDue) as addDate  FROM loan where active = 1 and clientid = ? and loanType = 'New' order by date DESC");
            stmt.setInt(1, getClientId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int clientIdl = rs.getInt("clientId");
                String pnNol = rs.getString("pnNo");
                Date datel = rs.getDate("date");
                String loanTypel = rs.getString("loanType");
                double monthlyAmmortizationl = rs.getDouble("monthlyAmmortization");
                double monthlyChangel = rs.getDouble("monthlyChange");
                double loanTerml = rs.getDouble("loanTerm");
                double grossLoanl = rs.getDouble("grossLoan");
                double interestsl = rs.getDouble("interest");
                double principall = rs.getDouble("principal");
                double processingFeel = rs.getDouble("processingFee");
                double otherDeductionl = rs.getDouble("otherDeduction");
                double amoountOfCheckl = rs.getDouble("amountOfCheck");
                Date firstDuel = rs.getDate("firstDue");
                Date lastDuel = rs.getDate("lastDue");
                int branchIdl = rs.getInt("addDate");
                boolean activel = rs.getBoolean("active");

                setId(idl);
                setClientId(clientIdl);
                setPnNo(pnNol);
                setDate(datel);
                setLoanType(loanTypel);
                setMonthlyAmmortization(monthlyAmmortizationl);
                setMonthlyChange(monthlyChangel);
                setLoanTerm(loanTerml);
                setGrossLoan(grossLoanl);
                setInterests(interestsl);
                setPrincipal(principall);
                setProcessingFee(processingFeel);
                setOtherDeduction(otherDeductionl);
                setAmoountOfCheck(amoountOfCheckl);
                setFirstDue(firstDuel);
                setLastDue(lastDuel);
                setBranchId(branchIdl);
                setActive(activel);
            }
            rs.clearWarnings();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void selectAllLoanTransactions() {
        setData(new Vector());
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("Select *,TIMESTAMPDIFF(MONTH,now(),lastDue) as addDate  FROM loan where active = 1 and clientid = ? and loanType = 'New' order by date DESC");
            stmt.setInt(1, getClientId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idl = rs.getInt("id");
                int clientIdl = rs.getInt("clientId");
                String pnNol = rs.getString("pnNo");
                Date datel = rs.getDate("date");
                String loanTypel = rs.getString("loanType");
                double monthlyAmmortizationl = rs.getDouble("monthlyAmmortization");
                double monthlyChangel = rs.getDouble("monthlyChange");
                double loanTerml = rs.getDouble("loanTerm");
                double grossLoanl = rs.getDouble("grossLoan");
                double interestsl = rs.getDouble("interest");
                double principall = rs.getDouble("principal");
                double processingFeel = rs.getDouble("processingFee");
                double otherDeductionl = rs.getDouble("otherDeduction");
                double amoountOfCheckl = rs.getDouble("amountOfCheck");
                Date firstDuel = rs.getDate("firstDue");
                Date lastDuel = rs.getDate("lastDue");
                int branchIdl = rs.getInt("addDate");
                boolean activel = rs.getBoolean("active");

                Vector rows = new Vector();
                rows.add(idl);
                rows.add(clientIdl);
                rows.add(pnNol);
                rows.add(datel);
                rows.add(loanTypel);
                rows.add(monthlyAmmortizationl);
                rows.add(monthlyChangel);
                rows.add(loanTerml);
                rows.add(grossLoanl);
                rows.add(interestsl);
                rows.add(principall);
                rows.add(processingFeel);
                rows.add(otherDeductionl);
                rows.add(amoountOfCheckl);
                rows.add(firstDuel);
                rows.add(lastDuel);
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

    public void insert() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("INSERT into loan (clientId, pnNo, date, loanType,monthlyAmmortization, monthlyChange, loanTerm, grossLoan, interest, principal,"
                    + " processingFee, otherDeduction, amountOfCheck, firstDue, lastDue, branch_id, active) values(?, ?, NOW(), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, getClientId());
            stmt.setString(2, getPnNo());
            stmt.setString(3, getLoanType());
            stmt.setDouble(4, getMonthlyAmmortization());
            stmt.setDouble(5, getMonthlyChange());
            stmt.setDouble(6, getLoanTerm());
            stmt.setDouble(7, getGrossLoan());
            stmt.setDouble(8, getInterests());
            stmt.setDouble(9, getPrincipal());
            stmt.setDouble(10, getProcessingFee());
            stmt.setDouble(11, getOtherDeduction());
            stmt.setDouble(12, getAmoountOfCheck());
            stmt.setDate(13, getFirstDue());
            stmt.setDate(14, getLastDue());
            stmt.setInt(15, getBranchId());
            stmt.setBoolean(16, isActive());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE loan set clientId = ?, pnNo = ?, date = NOW(), loanType = ?, monthlyAmmortization = ?, monthlyChange = ?, loanTerm = ?, grossLoan = ?, interest = ?, principal = ?,"
                    + " processingFee = ?, otherDeduction = ?, amountOfCheck = ?, firstDue = ?, lastDue = ?, branch_id = ?, active = ? WHERE id = ?");
            stmt.setInt(1, getClientId());
            stmt.setString(2, getPnNo());
            stmt.setString(3, getLoanType());
            stmt.setDouble(4, getMonthlyAmmortization());
            stmt.setDouble(5, getMonthlyChange());
            stmt.setDouble(6, getLoanTerm());
            stmt.setDouble(7, getGrossLoan());
            stmt.setDouble(8, getInterests());
            stmt.setDouble(9, getPrincipal());
            stmt.setDouble(10, getProcessingFee());
            stmt.setDouble(11, getOtherDeduction());
            stmt.setDouble(12, getAmoountOfCheck());
            stmt.setDate(13, getFirstDue());
            stmt.setDate(14, getLastDue());
            stmt.setInt(15, getBranchId());
            stmt.setBoolean(16, isActive());
            stmt.setInt(17, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try {
            super.getConnectToDbHost();
            PreparedStatement stmt = conn.prepareStatement("UPDATE loan set active = ? WHERE id = ?");
            stmt.setBoolean(1, isActive());
            stmt.setInt(2, getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
