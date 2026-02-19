package com.gla.string.Level1;

import java.util.Scanner;
public class CreateSubstringUsingCharAt {
    public static String sub(String s,int start,int end){
        String r="";
        for(int i=start;i<end;i++) r+=s.charAt(i);
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println(sub(s,start,end).equals(s.substring(start,end)));
    }
}