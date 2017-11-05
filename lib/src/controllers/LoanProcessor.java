/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import libraries.Client;
import libraries.Loan;
import libraries.Pension;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 *
 * @author Lancepyro
 */
public class LoanProcessor {

    private static String firstDue;
    private static String lastDue;
    private static double desiredLoan;
    private static double monthlyPension;
    private static double desiredAmort;
    private static double changePay;
    private static double monthlyAmort;
    private static int term;
    private static double grossLoan;
    private static double interest;
    private static double principal;
    private static double processingFee;
    private static double otherDeduction;
    private static double netCashOut;

    Pension pensionLib = new Pension();
    Loan loanLib = new Loan();

    /**
     * @return the firstDue
     */
    public static String getFirstDue() {
        return firstDue;
    }

    /**
     * @param aFirstDue the firstDue to set
     */
    public static void setFirstDue(String aFirstDue) {
        firstDue = aFirstDue;
    }

    /**
     * @return the lastDue
     */
    public static String getLastDue() {
        return lastDue;
    }

    /**
     * @param aLastDue the lastDue to set
     */
    public static void setLastDue(String aLastDue) {
        lastDue = aLastDue;
    }

    /**
     * @return the desiredLoan
     */
    public static double getDesiredLoan() {
        return desiredLoan;
    }

    /**
     * @param aDesiredLoan the desiredLoan to set
     */
    public static void setDesiredLoan(double aDesiredLoan) {
        desiredLoan = aDesiredLoan;
    }

    /**
     * @return the monthlyPension
     */
    public static double getMonthlyPension() {
        return monthlyPension;
    }

    /**
     * @param aMonthlyPension the monthlyPension to set
     */
    public static void setMonthlyPension(double aMonthlyPension) {
        monthlyPension = aMonthlyPension;
    }

    /**
     * @return the desiredAmort
     */
    public static double getDesiredAmort() {
        return desiredAmort;
    }

    /**
     * @param aDesiredAmort the desiredAmort to set
     */
    public static void setDesiredAmort(double aDesiredAmort) {
        desiredAmort = aDesiredAmort;
    }

    /**
     * @return the changePay
     */
    public static double getChangePay() {
        return changePay;
    }

    /**
     * @param aChangePay the changePay to set
     */
    public static void setChangePay(double aChangePay) {
        changePay = aChangePay;
    }

    /**
     * @return the monthlyAmort
     */
    public static double getMonthlyAmort() {
        return monthlyAmort;
    }

    /**
     * @param aMonthlyAmort the monthlyAmort to set
     */
    public static void setMonthlyAmort(double aMonthlyAmort) {
        monthlyAmort = aMonthlyAmort;
    }

    /**
     * @return the term
     */
    public static int getTerm() {
        return term;
    }

    /**
     * @param aTerm the term to set
     */
    public static void setTerm(int aTerm) {
        term = aTerm;
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
     * @return the interest
     */
    public static double getInterest() {
        return interest;
    }

    /**
     * @param aInterest the interest to set
     */
    public static void setInterest(double aInterest) {
        interest = aInterest;
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
     * @return the netCashOut
     */
    public static double getNetCashOut() {
        return netCashOut;
    }

    /**
     * @param aNetCashOut the netCashOut to set
     */
    public static void setNetCashOut(double aNetCashOut) {
        netCashOut = aNetCashOut;
    }

    public void processNewLoan(double pension, double amortization, int term, double deduction) {
        double monthlyChangel = pension - amortization;
        double totalDeduction = 0.0;

        setMonthlyAmort(amortization);
        setChangePay(monthlyChangel);
        setFirstDue(LocalDate.now().plusMonths(1) + "");
        setLastDue(LocalDate.now().plusMonths(term) + "");
        setGrossLoan(amortization * term);
        setProcessingFee((amortization * term) * 0.05);
        if (term <= 12) {
            setInterest((amortization * term) * term * 0.03);
            setPrincipal(getGrossLoan() - getInterest());
            totalDeduction = getPrincipal() - getProcessingFee() - deduction;
            setNetCashOut(totalDeduction);
        } else if (term == 18) {
            setInterest((amortization * term) * term * 0.025);
            setPrincipal(getGrossLoan() - getInterest());
            totalDeduction = getPrincipal() - getProcessingFee() - deduction;
            setNetCashOut(totalDeduction);
        }
//       
    }

    public void processAdditionalLoan(double pension, double amortization, int term, double deduction, int id) {
        loanLib.setClientId(id);
        loanLib.selectLastNewLoan();
        double monthlyChangel = pension - amortization;
        double totalDeduction = 0.0;        
        LocalDate firstDue = LocalDate.parse(loanLib.getLastDue().toString());
        int monthDiff = loanLib.getBranchId()+term;
        System.out.println(""+monthDiff);

        setMonthlyAmort(amortization);
        setChangePay(monthlyChangel);
        setFirstDue(firstDue.plusMonths(1) + "");
        setLastDue(firstDue.plusMonths(term) + "");
        setGrossLoan(amortization * term);
        setProcessingFee((amortization * term) * 0.05);
        if (term <= 12) {
            //calculate month dif for interest
            setInterest((amortization * term) * 0.03 * monthDiff);
            setPrincipal(getGrossLoan() - getInterest());
            totalDeduction = getPrincipal() - getProcessingFee() - deduction;
            setNetCashOut(totalDeduction);
        } else if (term == 18) {
            //calculate month dif for interest
            setInterest((amortization * term) * 0.025 * monthDiff);
            setPrincipal(getGrossLoan() - getInterest());
            totalDeduction = getPrincipal() - getProcessingFee() - deduction;
            setNetCashOut(totalDeduction);
        }
//       
    }

    public void process13thMonthLoan(double pension, double amortization, int term, double deduction) {
        double monthlyChangel = pension - amortization;
        double totalDeduction = 0.0;

        setMonthlyAmort(amortization);
        setChangePay(monthlyChangel);
        setFirstDue(LocalDate.now().getYear() + "-12-" + LocalDate.now().getDayOfMonth());
        setLastDue(LocalDate.now().getYear() + "-12-" + LocalDate.now().getDayOfMonth());
        setGrossLoan(amortization);
        setInterest(amortization * 0.15);
        setPrincipal(0.0);
        setProcessingFee(amortization * 0.05);
        totalDeduction = (amortization * 0.15) + (amortization * 0.05) + deduction;
        setNetCashOut(amortization - totalDeduction);
    }
}
