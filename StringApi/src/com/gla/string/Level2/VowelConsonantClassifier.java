package com.gla.string.Level2;

import java.util.Scanner;
public class VowelConsonantClassifier {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                if("aeiou".indexOf(ch)>=0)
                    System.out.println(ch+" Vowel");
                else
                    System.out.println(ch+" Consonant");
            } else System.out.println(ch+" NotLetter");
        }
    }
}