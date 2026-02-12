package com.gla.array.Level1;

import java.util.Scanner;
public class MeanHeightFootball {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double[] heights=new double[11];
        double sum=0;
        for(int i=0;i<heights.length;i++){
            System.out.print("Enter height: ");
            heights[i]=sc.nextDouble();
            sum+=heights[i];
        }
        System.out.println("Mean height = "+(sum/heights.length));

        sc.close();
    }
}
