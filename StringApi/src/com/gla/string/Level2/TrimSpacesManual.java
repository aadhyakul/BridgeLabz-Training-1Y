package com.gla.string.Level2;

import java.util.Scanner;
public class TrimSpacesManual {
    public static String trim(String s){
        int start=0,end=s.length()-1;
        while(start<s.length()&&s.charAt(start)==' ') start++;
        while(end>=0&&s.charAt(end)==' ') end--;
        return s.substring(start,end+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(trim(s));
        System.out.println(s.trim());
    }
}