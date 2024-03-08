package com.oops.basics;

public class Employee {
    String employeeName;

    int employeeId;
    double salary;


    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    boolean getDetails() {
        System.out.println("Name " + employeeName);
        System.out.println("Id " + employeeId);
        System.out.println("Id " + salary);
        return false;
    }
}
