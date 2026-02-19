
package com.gla.methods.Level3;
public class PalindromeNumberChecker {
    static int[] digits(int n){
        String s=n+"";
        int[] a=new int[s.length()];
        for(int i=0;i<s.length();i++) a[i]=s.charAt(i)-'0';
        return a;
    }
    static int[] reverse(int[] a){
        int[] r=new int[a.length];
        for(int i=0;i<a.length;i++) r[i]=a[a.length-1-i];
        return r;
    }
    static boolean equal(int[] a,int[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return false;
        return true;
    }
    public static void main(String[] args){
        int n=121;
        System.out.println(equal(digits(n),reverse(digits(n))));
    }
}
