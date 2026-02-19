package com.gla.string.Level3;

import java.util.Scanner;
public class PalindromeChecker {
    public static boolean check(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(check(s));
    }
}