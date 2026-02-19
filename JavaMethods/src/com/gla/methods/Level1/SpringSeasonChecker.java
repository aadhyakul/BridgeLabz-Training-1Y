
package com.gla.methods.Level1;
import java.util.Scanner;
public class SpringSeasonChecker {
    static boolean isSpring(int m,int d){
        return (m==3 && d>=20)||(m==4)||(m==5)||(m==6 && d<=20);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(isSpring(m,d));
    }
}
