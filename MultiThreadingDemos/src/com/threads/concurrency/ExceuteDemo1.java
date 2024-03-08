package com.threads.concurrency;

import com.threads.basics.Booking;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceuteDemo1 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> {
            System.out.println("Doing polling");
            Greetings greet = new Greetings();
            greet.message("Priya");
        });
        executorService.execute(() -> {
            System.out.println("Extracting name from url");
            Booking booking = new Booking();
            System.out.println(booking.BookTickets("Sri", 20));
        });
    }
}
