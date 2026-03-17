package com.gla.interfaceAbstraction;

interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed via default method");
    }
}

class PayPal implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}

class Razorpay implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Razorpay");
    }

    public void refund(double amount) {
        System.out.println("Razorpay custom refund of " + amount);
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PayPal();
        p1.pay(500);
        p1.refund(500);

        PaymentProcessor p2 = new Razorpay();
        p2.pay(300);
        p2.refund(300);
    }
}