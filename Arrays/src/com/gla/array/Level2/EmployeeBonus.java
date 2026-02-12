package com.gla.array.Level2;

import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double[] salary=new double[10];
        double[] years=new double[10];
        double totalBonus=0;
        for(int i=0;i<10;i++){
            System.out.print("Salary: "); salary[i]=sc.nextDouble();
            System.out.print("Years: "); years[i]=sc.nextDouble();
        }
        for(int i=0;i<10;i++){
            double bonus=(years[i]>5)? salary[i]*0.05: salary[i]*0.02;
            totalBonus+=bonus;
            System.out.println("New Salary: "+(salary[i]+bonus));
        }
        System.out.println("Total Bonus: "+totalBonus);

        sc.close();
    }
}
