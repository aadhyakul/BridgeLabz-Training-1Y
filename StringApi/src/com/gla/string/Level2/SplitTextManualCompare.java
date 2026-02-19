package com.gla.string.Level2;

import java.util.Scanner;
public class SplitTextManualCompare {
    public static String[] split(String s){
        int words=1;
        for(int i=0;i<s.length();i++) if(s.charAt(i)==' ') words++;
        String[] result=new String[words];
        int index=0,start=0;
        for(int i=0;i<=s.length();i++){
            if(i==s.length()||s.charAt(i)==' '){
                result[index++]=s.substring(start,i);
                start=i+1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=split(s);
        String[] b=s.split(" ");
        System.out.println(a.length==b.length);
    }
}