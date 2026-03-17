package com.gla.objectclasses.Level1;

public class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : $" + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 55000.00);
        emp.displayDetails();
    }
}