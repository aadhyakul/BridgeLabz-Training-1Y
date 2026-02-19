package com.gla.string.Level2;

import java.util.Scanner;
public class SplitTextWithLength2D {
    public static String[][] split(String s){
        String[] words=s.split(" ");
        String[][] result=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            result[i][0]=words[i];
            result[i][1]=String.valueOf(words[i].length());
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] r=split(s);
        for(int i=0;i<r.length;i++)
            System.out.println(r[i][0]+" "+r[i][1]);
    }
}