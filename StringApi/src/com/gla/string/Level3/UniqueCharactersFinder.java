package com.gla.string.Level3;

import java.util.Scanner;
public class UniqueCharactersFinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(result.indexOf(c)==-1) result+=c;
        }
        System.out.println(result);
    }
}