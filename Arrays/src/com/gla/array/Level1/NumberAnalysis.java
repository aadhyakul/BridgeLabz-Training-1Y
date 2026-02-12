package com.gla.array.Level1;

import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter number: ");
            arr[i]=sc.nextInt();
        }
        for(int n:arr){
            if(n>0) System.out.println(n%2==0? n+" positive even": n+" positive odd");
            else if(n<0) System.out.println(n+" negative");
            else System.out.println("zero");
        }
        if(arr[0]==arr[arr.length-1]) System.out.println("Equal");
        else if(arr[0]>arr[arr.length-1]) System.out.println("First greater");
        else System.out.println("Last greater");
        sc.close();
    }
}
