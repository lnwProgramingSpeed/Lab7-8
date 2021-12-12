package Example;
public class LoanClass {
    private double annualInterrestRate;
    private int numberOfYears;
    private double loanAmount;
    //private java.util.Date loanDate;

    /** No-arg constructor */
    public LoanClass() {
        this(2.5, 1, 1000);
    }

    /** Consturct a loan with specified annaul */
    public LoanClass(double annualInterrestRate, int numberOfYears, double loanAmount) {
        this.annualInterrestRate = annualInterrestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    /** Get Annual Interrest Rate */
    public double getAnnualInterrestRate() {
        return annualInterrestRate;
    }

    /** Set Annual Interest Rate */
    public void setAnnualInterrestRate(double annualInterrestRate) {
        this.annualInterrestRate = annualInterrestRate;
    }

    /** Get Number Of Years */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /** Set Number Of Years */
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    /** Get Loan Amount */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**Set Loan Amount */
    public void SetLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

}
