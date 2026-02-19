
package com.gla.methods.Level1;
import java.util.Scanner;
public class ChocolateDistributor {
    static int[] distribute(int c,int s){
        return new int[]{c/s,c%s};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int s=sc.nextInt();
        int[] r=distribute(c,s);
        System.out.println(r[0]+" "+r[1]);
    }
}
