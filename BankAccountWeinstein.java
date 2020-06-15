/**
 The BankAccountWeinstein class uses class field values for balance, deposit and withdraw count, interest rate, and monthly service fee. It uses a constructor with the balance and interest rate for constructors. It includes methods to deposit, withdraw, calculate interest, monthly processing, get withdraw and deposit count, get balance, and display.

 Author: David Weinstein
 Date: 5/10/2020
 Program file: BankAccountWeinstein.java

 Pseudocode:
 1. Set up class field variables
 2. Constructor method with balance and rate for constructors
 3. Create methods to deposit, withdraw, calcinterest, and monthly process.
 4. Create getters for balance and counts
 5. Create display method
 */
import java.text.DecimalFormat;
public class BankAccountWeinstein {

    private double balance;
    private int depositCount, withdrawCount;
    private double intRate;
    protected double monthlyService;

    /**
     * Constructor method
     * @param bal account balance
     * @param rate yearly interest rate
     */
    public BankAccountWeinstein(double bal, double rate) {
        balance = bal;
        intRate = rate;
    }

    /**
     * deposit to balance
     * @param deposit double amount to deposit
     */
    public void deposit(double deposit) {
        balance += deposit;
        depositCount++;
    }

    /**
     * withdraw from balace
     * @param amt double amount to withdraw
     */
    public void withdraw(double amt) {
        balance -= amt;
        withdrawCount++;
    }

    /**
     * calculates interest for month and adds to balance
     */
    public void calcInterest() {
        double monthlyRate = intRate / 12;
        double monthlyInterest = balance * monthlyRate;
        balance += monthlyInterest;
    }

    /**
     * monthlyProcess method subtracts monthly service fee, calculates interest and resets all counts for month
     */
    public void monthlyProcess() {
        balance -= monthlyService;
        calcInterest();
        withdrawCount = 0;
        depositCount = 0;
        monthlyService = 0;
    }

    /**
     * 
     * @return returns withdraw count
     */
    public int getWithdrawCount() {
        return withdrawCount;
    }
    /**
     * 
     * @return returns deposit count
     */
    public int getDepositCount() {
        return depositCount;
    }
    /**
     * returns balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * displays balance and count details
     */
    public void display() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Account balance: " + df.format(getBalance()));
        System.out.println("Number of deposits: " + getDepositCount());
        System.out.println("Number of withdrawls: " + getWithdrawCount() + "\n");
    }
}
