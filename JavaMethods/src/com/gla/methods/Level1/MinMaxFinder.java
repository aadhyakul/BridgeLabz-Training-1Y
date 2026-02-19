
package com.gla.methods.Level1;
import java.util.Scanner;
public class MinMaxFinder {
    static int[] find(int a,int b,int c){
        int min=Math.min(a,Math.min(b,c));
        int max=Math.max(a,Math.max(b,c));
        return new int[]{min,max};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] r=find(a,b,c);
        System.out.println(r[0]+" "+r[1]);
    }
}
