package com.gla.threads;

class BankAccount {
    private String holderName;
    private double balance;
    private String accountType;

    public BankAccount(String holderName, double balance, String accountType) {
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getHolderName()  { return holderName; }
    public double getBalance()     { return balance; }
    public String getAccountType() { return accountType; }
}

class BalanceChecker implements Runnable {
    private BankAccount account;

    public BalanceChecker(BankAccount account) {
        this.account = account;
    }

    public void run() {
        int priority = Thread.currentThread().getPriority();
        System.out.println("[" + account.getAccountType() + "] " +
                account.getHolderName() + " connected | Priority: " + priority);

        for (int i = 1; i <= 3; i++) {
            System.out.println("[" + account.getAccountType() + "] " +
                    account.getHolderName() + " - Check #" + i +
                    " | Balance: Rs." + account.getBalance());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[" + account.getAccountType() + "] " +
                account.getHolderName() + " - All checks done.");
    }
}

public class Q1_BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount premium = new BankAccount("Arjun Sharma", 150000.00, "Premium");
        BankAccount regular = new BankAccount("Priya Mehta",   45000.00, "Regular");
        BankAccount basic   = new BankAccount("Rohit Verma",    8000.00, "Basic");

        Thread t1 = new Thread(new BalanceChecker(premium));
        Thread t2 = new Thread(new BalanceChecker(regular));
        Thread t3 = new Thread(new BalanceChecker(basic));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.setName("PremiumUser-Thread");
        t2.setName("RegularUser-Thread");
        t3.setName("BasicUser-Thread");

        System.out.println("=== Bank Balance Check System Started ===");
        t3.start();
        t2.start();
        t1.start();
    }
}