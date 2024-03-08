package com.oops.bean;

public class BeanDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Honda");
        vehicle.setModel("Civic");
        vehicle.setPrice("100000");
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle);
    }
}
