
package com.gla.methods.Level1;
import java.util.Scanner;
public class NumberSignChecker {
    static int checkSign(int n){
        if(n>0) return 1;
        if(n<0) return -1;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkSign(n));
    }
}
