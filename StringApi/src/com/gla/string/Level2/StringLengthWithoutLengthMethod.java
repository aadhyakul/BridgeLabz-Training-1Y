package com.gla.string.Level2;

import java.util.Scanner;
public class StringLengthWithoutLengthMethod {
    public static int length(String s){
        int count=0;
        try{ while(true){ s.charAt(count); count++; } }
        catch(Exception e){}
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(length(s));
        System.out.println(s.length());
    }
}