package com.gla.javaPackages.Q6_EmployeeManagementSystem.com.company.main;

import com.gla.javaPackages.Q6_EmployeeManagementSystem.com.company.hr.Employee;
import com.gla.javaPackages.Q6_EmployeeManagementSystem.com.company.payroll.Payroll;

public class MainApp_EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e = new Employee(501, "Vikram Singh", "IT", 60000.00);
        System.out.println("--- Employee Details ---");
        e.displayDetails();

        System.out.println("\n--- Applying 10% Bonus ---");
        Payroll p = new Payroll();
        p.calculateBonus(e);

        System.out.println("\n--- Updated Employee Details ---");
        e.displayDetails();
    }
}
