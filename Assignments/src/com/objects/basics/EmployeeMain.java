package com.objects.basics;

import javax.swing.*;
import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Raj", "Programmer");
        double bonus = employee.calcBonus(2200);
        System.out.println(bonus);
        Employee employee1 = new Employee("Raj", "Manager");
        double bonus1=employee1.calcBonus(2200, 200, "car");
        System.out.println(bonus1);
        Employee employee2 = new Employee("Raj", "Director");
        double bonus2 = employee2.calcBonus(2200, "Laptop", 200, 200);
        System.out.println(bonus2);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your name");
            String name = scanner.next();
            System.out.println("Enter your designation");
            String designation = scanner.next();
            Employee employeeee = new Employee(name, designation);
            if (designation.equals("Programmer")) {
                employee.calcBonus(2200);}
            else if (designation.equals("Manager")) {
                    employee.calcBonus(2200, 220, "car");


                } else if (designation.equals("DIrector")) {
                    employee.calcBonus(2200, "Laptop", 200, 200);
                }

            }

        }
    }

