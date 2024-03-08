package com.oops.basics;

import java.sql.SQLOutput;

public class EmpMain {
    public static void main(String[] args) {

        Employee employee = new Employee("farhan",  12, 2000);

        Employee employee1 = new Employee("farhan1",12,2000);

        System.out.println(employee.getDetails());
        System.out.println(employee1.getDetails());
        }
    }