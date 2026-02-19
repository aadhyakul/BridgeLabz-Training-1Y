
package com.gla.methods.Level2;
import java.util.Scanner;
public class RecursiveNaturalSum {
    static int recursiveSum(int n){
        if(n==0) return 0;
        return n+recursiveSum(n-1);
    }
    static int formulaSum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(recursiveSum(n));
        System.out.println(formulaSum(n));
    }
}
