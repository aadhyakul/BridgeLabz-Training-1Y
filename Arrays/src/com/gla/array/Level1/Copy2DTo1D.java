package com.gla.array.Level1;

import java.util.Scanner;
public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Rows: ");
        int r=sc.nextInt();
        System.out.print("Cols: ");
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                matrix[i][j]=sc.nextInt();
        int[] arr=new int[r*c]; int index=0;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                arr[index++]=matrix[i][j];
        for(int val:arr) System.out.print(val+" ");

        sc.close();
    }
}
