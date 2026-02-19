
package com.gla.methods.Level1;
import java.util.Scanner;
public class QuotientRemainderCalculator {
    static int[] calculate(int n,int d){
        return new int[]{n/d,n%d};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] r=calculate(n,d);
        System.out.println(r[0]+" "+r[1]);
    }
}
