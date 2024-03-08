package com.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Kawasaki", 500, "Ninja");
        vehicle.getDetails();

        Vehicle vehicle1 = new Vehicle("Yamaha");
        vehicle.getDetails();

        Vehicle vehicle2 = new Vehicle("Suzuki", "R1");
        vehicle.getDetails();

        Vehicle vehicle3 = new Vehicle("Kawasaki",500, "Ninja");
        vehicle.getDetails();

        vehicle.print();
    }
}
