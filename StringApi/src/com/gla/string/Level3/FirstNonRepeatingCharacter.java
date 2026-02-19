package com.gla.string.Level3;

import java.util.Scanner;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println("None");
    }
}