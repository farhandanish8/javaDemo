package com.api.lang;

public class HashDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("benz","b1","black");
        Vehicle vehicle1 = new Vehicle("BMW","Mseries","white");
        Vehicle vehicle2 = new Vehicle("Lamborghini","Gallardo","Yellow");
        Vehicle vehicle3 = new Vehicle("Hyundai","i20","blue");

        System.out.println(vehicle1.equals(vehicle));
        System.out.println(vehicle2.equals(vehicle));
        System.out.println(vehicle1.equals(vehicle3));
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());

    }
}
