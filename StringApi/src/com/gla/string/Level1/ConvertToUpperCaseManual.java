package com.gla.string.Level1;

import java.util.Scanner;
public class ConvertToUpperCaseManual {
    public static String upper(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z') r+=(char)(c-32);
            else r+=c;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(upper(s).equals(s.toUpperCase()));
    }
}