
package com.gla.methods.Level1;
import java.util.Scanner;
public class SimpleInterestCalculator {
    static double calculateSimpleInterest(double p,double r,double t){
        return p*r*t/100;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        System.out.println("The Simple Interest is "+calculateSimpleInterest(p,r,t));
    }
}
