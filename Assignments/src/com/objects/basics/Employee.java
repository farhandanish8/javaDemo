package com.objects.basics;

import java.net.StandardSocketOptions;

public class Employee {
    String name;
    String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    double calcBonus(double basicAllowance) {
        return basicAllowance;
    }

    double calcBonus(double basicAllowance, double houseAllowance, String gift) {
        System.out.println("gift");
        return basicAllowance + houseAllowance;
    }

    double calcBonus(double basicAllowance, String gift, double houseAllowance, double carAllowance) {
        System.out.println("gift");
        return basicAllowance + houseAllowance + carAllowance;
    }
}