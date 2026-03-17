package com.gla.interfaceAbstraction;

interface Sensitive {}

class BankDetails implements Sensitive {
    String accountNumber;
    String ifscCode;

    BankDetails(String accountNumber, String ifscCode) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }
}

class UserProfile {
    String name;
    String email;

    UserProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

public class SensitiveDataTagging {
    static void process(Object obj) {
        if (obj instanceof Sensitive) {
            System.out.println(obj.getClass().getSimpleName() + " is sensitive — encryption required");
        } else {
            System.out.println(obj.getClass().getSimpleName() + " is not sensitive — no encryption needed");
        }
    }

    public static void main(String[] args) {
        BankDetails bank = new BankDetails("123456789", "SBIN0001234");
        UserProfile user = new UserProfile("Alice", "alice@email.com");

        process(bank);
        process(user);
    }
}
