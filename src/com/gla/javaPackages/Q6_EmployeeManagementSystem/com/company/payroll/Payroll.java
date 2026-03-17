package com.gla.javaPackages.Q6_EmployeeManagementSystem.com.company.payroll;

import com.gla.javaPackages.Q6_EmployeeManagementSystem.com.company.hr.Employee;

public class Payroll {
    public void calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        double updatedSalary = e.getSalary() + bonus;
        e.setSalary(updatedSalary);
        System.out.println("Bonus Applied  : $" + bonus);
        System.out.println("Updated Salary : $" + updatedSalary);
    }
}
