package com.gla.constructorAccessmod.Level2.AccessModifiers;
class BankAccountDetails {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccountDetails(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : $" + balance);
    }
}

class PersonalSavingsAccount extends BankAccountDetails {
    double interestRate;

    PersonalSavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : $" + getBalance());
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        BankAccountDetails ba = new BankAccountDetails(101, "Vikram", 5000.00);
        ba.display();
        ba.setBalance(7000.00);
        System.out.println("Updated Balance: $" + ba.getBalance());

        PersonalSavingsAccount sa = new PersonalSavingsAccount(102, "Anjali", 10000.00, 3.5);
        sa.display();
    }
}