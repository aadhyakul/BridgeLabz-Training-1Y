package com.gla.string.Level3;

import java.util.Scanner;
public class CalendarDisplayProgram {
    public static boolean leap(int y){ return (y%4==0&&y%100!=0)||y%400==0; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int y=sc.nextInt();
        int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(leap(y)) days[2]=29;
        int d=1;
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+31*m0/12)%7;
        for(int i=0;i<d0;i++) System.out.print("   ");
        for(int i=1;i<=days[m];i++){
            System.out.printf("%3d",i);
            if((i+d0)%7==0) System.out.println();
        }
    }
}