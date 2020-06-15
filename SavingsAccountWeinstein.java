/**
 The SavingsAccountWeinstein class extends the BankAccountWeinstein class and adds a field sub class boolean value which indicates whether or not the account is active, which is a balance > $25.

 Author: David Weinstein
 Date: 5/10/2020
 Program file: SavingsAccountWeinstein.java

 Pseudocode:
 1. Initialize boolean class field value
 2. Set up constructor which calls upon parent class with super() method
 3. If balance is >= 25 set status to true
 4. withdraw() method prints account inactive if status is false, else calls the super class method
 5. deposit() method checks if status is inactive, if it is and the amount will bring status to true, call the superclass method, else state the account is inactive
 6. monthlyProcess() method counts the amount of withdraws and adds $1 per withdraw over the count of 4 to monthly service fee, and then calls the superclass method
 */
public class SavingsAccountWeinstein extends BankAccountWeinstein {

    private boolean status;

    /**
     * constructor method
     * @param bal account balance
     * @param rate yearly interest rate
     */
    public SavingsAccountWeinstein(double bal, double rate) {
        super(bal, rate);
        if(bal>=25) {
            status = true;
        }
    }

    /**
     * withdraw method reduces balance
     */
    public void withdraw(double amt) {
        if(status==false) {
            System.out.println("Account inactive.");
        } else {
            super.withdraw(amt);
        }
    }

    /**
     * deposit method increases balance
     */
    public void deposit(double amt) {
        if(status==false) {
            if(getBalance() + amt >= 25) {
                status = true;
                super.deposit(amt);
            } else {
                System.out.println("Account inactive.");
            }
        }
    }

    /**
     * processes monthly details
     */
    public void monthlyProcess() {
        int withdrawCount = getWithdrawCount();
        if(withdrawCount > 4) {
            monthlyService = (withdrawCount - 4) * 1;
        }
        super.monthlyProcess();
        if(getBalance() < 25) {
            status = false;
        }
    }
}
