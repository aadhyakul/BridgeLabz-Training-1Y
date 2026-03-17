package com.gla.constructorAccessmod.Level2.AccessModifiers;
class CompanyEmployeeRecord {
    public int employeeID;
    protected String department;
    private double salary;

    CompanyEmployeeRecord(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : $" + salary);
    }
}

class SeniorDepartmentManager extends CompanyEmployeeRecord {
    String managerLevel;

    SeniorDepartmentManager(int employeeID, String department, double salary, String managerLevel) {
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }

    void display() {
        System.out.println("Employee ID    : " + employeeID);
        System.out.println("Department     : " + department);
        System.out.println("Salary         : $" + getSalary());
        System.out.println("Manager Level  : " + managerLevel);
    }
}

public class CompanyEmployeeManagementSystem {
    public static void main(String[] args) {
        CompanyEmployeeRecord e = new CompanyEmployeeRecord(501, "Finance", 60000.00);
        e.display();
        e.setSalary(70000.00);
        System.out.println("Updated Salary: $" + e.getSalary());

        SeniorDepartmentManager m = new SeniorDepartmentManager(502, "Operations", 90000.00, "Senior");
        m.display();
    }
}