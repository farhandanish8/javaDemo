package com.util.list;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer("Farhan",20,"Bangalore");
        customerList.add(customer1);

        Customer customer2 = new Customer("Danish",10,"Tumkur");
        customerList.add(customer2);

        Customer customer3 = new Customer("Nikhil",30,"Dharwad");
        customerList.add(customer3);

        Customer customer4 = new Customer("Dada",25,"Sira");
        customerList.add(customer4);

        for(Customer customer : customerList)
        System.out.println(customer);

        List<Customer> customerCity = new ArrayList<>();
        String city = "Bangalore";
        for(Customer customer: customerList){
            if(customer.getCity().equals("Bangalore")){
                customerCity.add(customer);

            }
        }
        for(Customer customerInBangalore : customerList){
            System.out.println(customerInBangalore);
        }

    }
}
