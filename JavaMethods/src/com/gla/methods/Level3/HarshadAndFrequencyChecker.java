
package com.gla.methods.Level3;
public class HarshadAndFrequencyChecker {
    static int[] digits(int n){
        String s=n+"";
        int[] a=new int[s.length()];
        for(int i=0;i<s.length();i++) a[i]=s.charAt(i)-'0';
        return a;
    }
    static int sum(int[] a){ int s=0; for(int x:a)s+=x; return s; }
    static boolean isHarshad(int n){
        int[] a=digits(n);
        return n%sum(a)==0;
    }
    static int[][] frequency(int[] a){
        int[][] f=new int[10][2];
        for(int i=0;i<10;i++) f[i][0]=i;
        for(int x:a) f[x][1]++;
        return f;
    }
    public static void main(String[] args){
        int n=21;
        System.out.println(isHarshad(n));
    }
}
