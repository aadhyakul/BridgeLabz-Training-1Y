package com.gla.string.Level1;

import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args){
        int[] a=new int[3];
        try{ System.out.println(a[5]); }
        catch(Exception e){ System.out.println("Handled"); }
    }
}