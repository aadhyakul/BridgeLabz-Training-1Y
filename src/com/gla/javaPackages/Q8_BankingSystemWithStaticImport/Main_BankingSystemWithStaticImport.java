package com.gla.javaPackages.Q8_BankingSystemWithStaticImport;

import static java.lang.Math.*;
import com.gla.javaPackages.Q8_BankingSystemWithStaticImport.com.bank.util.InterestCalculator;

public class Main_BankingSystemWithStaticImport {
    public static void main(String[] args) {
        InterestCalculator calc = new InterestCalculator();

        double principal = 10000;
        double rate = 5;
        double time = 3;

        double si = calc.calculateSimpleInterest(principal, rate, time);
        double ci = calc.calculateCompoundInterest(principal, rate, time);

        System.out.println("Principal         : $" + principal);
        System.out.println("Rate              : " + rate + "%");
        System.out.println("Time              : " + time + " years");
        System.out.println("Simple Interest   : $" + si);
        System.out.println("Compound Interest : $" + ci);
        System.out.println("pow(1.05, 3)      : " + pow(1.05, 3));
    }
}
