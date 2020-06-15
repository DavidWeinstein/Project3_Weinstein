/**
 The SavingsDemoWeinstein class runs the application that includes the main method that demonstrates the SavingsAccountWeinstein and BankAccountWeinstein classes.

 Author: David Weinstein
 Date: 5/10/2020
 Program file: SavingsDemoWeinstein.java

 Pseudocode:
 1. Initialize new BankAccountWeinstein object with a starting balance of 1000 and an interest rate of 10%
 2. Initialize new SavingsAccountWeintein object with a starting balance of 1000 and an interest rate of 10%
 3. Demonstrate BankAccountWeinstein class by using its methods to deposit and withdraw, display the balance and details before the monthly processing, and then display after the monthly process
 4. Demonstrate SavingsAccountWeinstein class by using its methods to deposit and withdraw, display the balance and details before the monthly processing, and then display after the monthly process
 */


public class SavingsDemoWeinstein {

    public static void main(String[] args) {
        // demonstrations
        BankAccountWeinstein bankAccount = new BankAccountWeinstein(1000, .1);
        SavingsAccountWeinstein savingsAccount = new SavingsAccountWeinstein(1000, .1);
        bankAccount.deposit(100);
        bankAccount.withdraw(200);
        bankAccount.display();
        bankAccount.monthlyProcess();
        bankAccount.display();
        savingsAccount.deposit(1000.85);
        savingsAccount.deposit(200.26);
        savingsAccount.withdraw(500.5);
        savingsAccount.display();
        savingsAccount.monthlyProcess();
        savingsAccount.display();
    }
}