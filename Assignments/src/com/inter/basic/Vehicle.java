package com.inter.basic;

public abstract class Vehicle implements IInsurance {
    String Brand;
    String Model;
    double Price;

    @Override
    public void insuranceDetails() {
        System.out.println("Insurance claims");
    }

    void getDetails() {
        System.out.println("brand");
        System.out.println("Model");
        System.out.println("Price");
    }
    abstract void getMileage();
}
