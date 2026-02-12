package com.gla.array.Level1;

import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int n=sc.nextInt();
        String[] result=new String[n+1];
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0) result[i]="FizzBuzz";
            else if(i%3==0) result[i]="Fizz";
            else if(i%5==0) result[i]="Buzz";
            else result[i]=String.valueOf(i);
        }
        for(int i=1;i<=n;i++)
            System.out.println("Position "+i+" = "+result[i]);

        sc.close();
    }
}
