
package com.gla.methods.Level2;
import java.util.Scanner;
public class FactorOperations {
    static int[] getFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++) if(n%i==0) count++;
        int[] f=new int[count];
        int idx=0;
        for(int i=1;i<=n;i++) if(n%i==0) f[idx++]=i;
        return f;
    }
    static int sum(int[] a){
        int s=0;
        for(int x:a) s+=x;
        return s;
    }
    static int product(int[] a){
        int p=1;
        for(int x:a) p*=x;
        return p;
    }
    static double sumOfSquares(int[] a){
        double s=0;
        for(int x:a) s+=Math.pow(x,2);
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=getFactors(n);
        System.out.println(sum(f));
        System.out.println(product(f));
        System.out.println(sumOfSquares(f));
    }
}
