package com.threads.basics;

public class Counter implements Runnable{
    Booking booking;
    String name;
    int noOfTickets;

    public Counter(String name, int noOfTickets,Booking booking) {
        this.name = name;
        this.noOfTickets = noOfTickets;
        this.booking = booking;
        Thread t = new Thread(this,name);
        t.start();
    }

    public void run(){
        synchronized (booking){
            System.out.println("Welcome to ABC Theaters "+name);
            double amount = booking.BookTickets(name, noOfTickets);
            System.out.println("Amount to be paid "+amount);
        }

    }
}
