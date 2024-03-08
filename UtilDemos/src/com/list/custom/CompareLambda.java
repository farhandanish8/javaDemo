package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        List<Vehicle> vehicles =
                Arrays.asList(
                        new Vehicle("City", "Honda", 23_90_000),
                        new Vehicle("Hexa", "Tata", 12_90_000),
                        new Vehicle("Santro", "hyundai", 43_90_000),
                        new Vehicle("A100", "Audi", 45_90_000),
                        new Vehicle("X10", "Marutji", 1190000));
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        Collections.sort(vehicles,(o1, o2) ->o1.getBrand().compareTo(o2.getBrand()));

        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
        Collections.sort(vehicles,(o1, o2) -> o1.getModel().compareTo(o2.getModel()));

        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
        Collections.sort(vehicles,(o1, o2)->Double.compare(o1.getPrice(), o2.getPrice()));
    }
}
