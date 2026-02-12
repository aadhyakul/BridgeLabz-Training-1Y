package com.gla.array.Level1;

import java.util.Scanner;
public class FactorsDynamicArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int[] factors=new int[10];
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                if(count==factors.length){
                    int[] temp=new int[factors.length*2];
                    for(int j=0;j<factors.length;j++) temp[j]=factors[j];
                    factors=temp;
                }
                factors[count++]=i;
            }
        }
        for(int i=0;i<count;i++) System.out.print(factors[i]+" ");

        sc.close();
    }
}
