
package com.gla.methods.Level2;
import java.util.Scanner;
public class NumberAnalyzer {
    static boolean isPositive(int n){ return n>0; }
    static boolean isEven(int n){ return n%2==0; }
    static int compare(int a,int b){ return Integer.compare(a,b); }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            if(isPositive(a[i])) System.out.println(isEven(a[i]));
            else System.out.println(false);
        }
        System.out.println(compare(a[0],a[4]));
    }
}
