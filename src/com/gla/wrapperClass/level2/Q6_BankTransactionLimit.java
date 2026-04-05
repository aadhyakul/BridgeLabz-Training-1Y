package com.gla.wrapperClass.level2;

public class Q6_BankTransactionLimit {
    public static double getRemainingLimit(Double limit, double withdrawn) {
        if (limit == null) {
            return 0.0;
        }
        return limit - withdrawn;
    }

    public static void main(String[] args) {
        Double limit1 = 5000.0;
        Double limit2 = null;
        double withdrawn = 1500.0;
        System.out.println("Remaining limit (valid): " + getRemainingLimit(limit1, withdrawn));
        System.out.println("Remaining limit (null): " + getRemainingLimit(limit2, withdrawn));
    }
}
