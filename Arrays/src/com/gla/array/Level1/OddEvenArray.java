package com.gla.array.Level1;


import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter natural number: ");
        int n=sc.nextInt();
        if(n<=0){System.out.println("Invalid"); return;}
        int[] odd=new int[n]; int[] even=new int[n];
        int oi=0,ei=0;
        for(int i=1;i<=n;i++){
            if(i%2==0) even[ei++]=i;
            else odd[oi++]=i;
        }
        System.out.println("Odd:");
        for(int i=0;i<oi;i++) System.out.print(odd[i]+" ");
        System.out.println("\nEven:");
        for(int i=0;i<ei;i++) System.out.print(even[i]+" ");

        sc.close();
    }
}
