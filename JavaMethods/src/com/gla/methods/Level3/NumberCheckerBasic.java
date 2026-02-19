
package com.gla.methods.Level3;
public class NumberCheckerBasic {
    static int countDigits(int n){ int c=0; while(n>0){c++;n/=10;} return c; }
    static int[] digits(int n){
        int c=countDigits(n);
        int[] a=new int[c];
        for(int i=c-1;i>=0;i--){a[i]=n%10;n/=10;}
        return a;
    }
    static boolean isDuck(int[] a){
        for(int x:a) if(x==0) return true;
        return false;
    }
    static boolean isArmstrong(int n){
        int[] a=digits(n);
        int p=a.length,sum=0;
        for(int x:a) sum+=Math.pow(x,p);
        return sum==n;
    }
    public static void main(String[] args){
        int n=153;
        System.out.println(isDuck(digits(n)));
        System.out.println(isArmstrong(n));
    }
}
