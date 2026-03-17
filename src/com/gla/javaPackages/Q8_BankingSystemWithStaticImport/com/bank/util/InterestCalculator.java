package com.gla.javaPackages.Q8_BankingSystemWithStaticImport.com.bank.util;

import static java.lang.Math.*;

public class InterestCalculator {
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * pow((1 + rate / 100), time) - principal;
    }
}
