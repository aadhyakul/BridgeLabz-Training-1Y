
package com.gla.methods.Level3;
public class SumOfDigits {
    public int get4DigitRandomNumber(){ return (int)(Math.random()*9000)+1000; }
    public int countDigits(int n){ int c=0; while(n>0){c++;n/=10;} return c; }
    public int[] getDigits(int n,int c){ int[] a=new int[c]; for(int i=c-1;i>=0;i--){a[i]=n%10;n/=10;} return a; }
    public int sum(int[] a){ int s=0; for(int x:a)s+=x; return s; }
    public static void main(String[] args){
        SumOfDigits s=new SumOfDigits();
        int n=s.get4DigitRandomNumber();
        int c=s.countDigits(n);
        System.out.println(s.sum(s.getDigits(n,c)));
    }
}
