/*
 * File: BankingSystemAdvanced.java
 * Topic: Real-World Banking System using Inheritance
 * Level: Advanced
 * Concepts: Inheritance + super + Method Overriding + Polymorphism
 */

class Account {

    protected String accountHolder;
    protected double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Savings Account inherits Account
class SavingsAccount extends Account {

    private double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);   // calling parent constructor
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest Earned: " + interest);
    }

    // Method overriding
    @Override
    void withdraw(double amount) {
        if (amount > 10000) {
            System.out.println("Withdrawal limit exceeded for Savings Account!");
        } else {
            super.withdraw(amount);   // calling parent withdraw
        }
    }
}

// Current Account inherits Account
class CurrentAccount extends Account {

    private double overdraftLimit;

    CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {

        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn (Overdraft allowed).");
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        System.out.println("----- Savings Account -----");
        SavingsAccount sa = new SavingsAccount("Ravi", 20000, 5);

        sa.deposit(5000);
        sa.withdraw(8000);
        sa.withdraw(15000);  // exceeds limit
        sa.calculateInterest();
        sa.showBalance();

        System.out.println("\n----- Current Account -----");
        CurrentAccount ca = new CurrentAccount("Priya", 10000, 5000);

        ca.withdraw(12000);  // allowed with overdraft
        ca.withdraw(20000);  // exceeds overdraft
        ca.showBalance();
    }
}
