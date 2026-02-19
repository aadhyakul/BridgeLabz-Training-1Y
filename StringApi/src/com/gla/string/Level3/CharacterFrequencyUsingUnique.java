package com.gla.string.Level3;

import java.util.Scanner;
public class CharacterFrequencyUsingUnique {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String unique="";
        for(int i=0;i<s.length();i++)
            if(unique.indexOf(s.charAt(i))==-1)
                unique+=s.charAt(i);
        for(int i=0;i<unique.length();i++){
            char c=unique.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++)
                if(s.charAt(j)==c) count++;
            System.out.println(c+" "+count);
        }
    }
}