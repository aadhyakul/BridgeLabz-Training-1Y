package com.gla.string.Level2;

import java.util.Scanner;
public class ShortestLongestWordFinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        String min=words[0],max=words[0];
        for(String w:words){
            if(w.length()<min.length()) min=w;
            if(w.length()>max.length()) max=w;
        }
        System.out.println("Shortest: "+min);
        System.out.println("Longest: "+max);
    }
}