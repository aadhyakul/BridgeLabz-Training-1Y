package com.gla.array.Level1;

import java.util.Scanner;
public class MultiplicationTable1to10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int[] table=new int[10];
        for(int i=1;i<=10;i++){
            table[i-1]=num*i;
            System.out.println(num+" * "+i+" = "+table[i-1]);
        }

        sc.close();
    }
}
