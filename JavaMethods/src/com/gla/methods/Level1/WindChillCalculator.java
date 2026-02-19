
package com.gla.methods.Level1;
import java.util.Scanner;
public class WindChillCalculator {
    static double calculate(double t,double w){
        return 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(w,0.16);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double t=sc.nextDouble();
        double w=sc.nextDouble();
        System.out.println(calculate(t,w));
    }
}
