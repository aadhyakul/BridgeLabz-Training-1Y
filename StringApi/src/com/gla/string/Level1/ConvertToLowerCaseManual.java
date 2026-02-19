package com.gla.string.Level1;

import java.util.Scanner;
public class ConvertToLowerCaseManual {
    public static String lower(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z') r+=(char)(c+32);
            else r+=c;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lower(s).equals(s.toLowerCase()));
    }
}