package com.gla.array.Level1;

import java.util.Scanner;
public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double[] arr=new double[10];
        double sum=0; int index=0;
        while(true){
            System.out.print("Enter number: ");
            double val=sc.nextDouble();
            if(val<=0 || index==10) break;
            arr[index++]=val;
        }
        for(int i=0;i<index;i++) sum+=arr[i];
        System.out.println("Sum = "+sum);

        sc.close();
    }
}
