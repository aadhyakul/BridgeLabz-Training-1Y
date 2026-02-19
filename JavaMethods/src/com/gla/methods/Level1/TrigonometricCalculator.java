
package com.gla.methods.Level1;
import java.util.Scanner;
public class TrigonometricCalculator {
    static double[] calculate(double angle){
        double r=Math.toRadians(angle);
        return new double[]{Math.sin(r),Math.cos(r),Math.tan(r)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double[] r=calculate(a);
        System.out.println(r[0]+" "+r[1]+" "+r[2]);
    }
}
