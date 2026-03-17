package com.gla.encapsulation;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance.");
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName +
                ", Balance: " + balance + ", Interest: " + calculateInterest());
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() { return getBalance() * 0.04; }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of " + amount + " applied for " + getHolderName());
    }

    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() { return getBalance() * 0.02; }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Business loan of " + amount + " applied for " + getHolderName());
    }

    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 50000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("SA001", "Alice", 20000),
                new CurrentAccount("CA001", "Bob", 80000)
        };

        for (BankAccount acc : accounts) {
            acc.displayDetails();
        }
    }
}