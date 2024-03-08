package com.oops.overloading;

public class Vehicle {
    String brand;
    Double price;

    String model;

    public Vehicle(String kawasaki, int i, String ninja) {
        System.out.println("default");
    }

    public Vehicle(String brand) {
        this("Kawasaki", 500, "Ninja");
        this.brand = brand;
    }

    public Vehicle(String brand, String model) {
        this(brand);
        this.brand = brand;
        this.model = model;
    }

    public Vehicle(String brand, Double price, String model) {
        this(model,brand);
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    void getDetails() {
        System.out.println("brand" + brand);
        System.out.println("price " + price);
        System.out.println("model" + model);
    }
    void print(){
        if (model!=null)
            System.out.println("Brand "+brand );
        if (brand!=null)
            System.out.println("Price "+price);
        if(price>0)
            System.out.println("Model "+model);
    }
}


