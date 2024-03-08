package com.threads.basics;

public class Runner implements Runnable {
    String name;
    Greetings greetings;

    public Runner(String name, Greetings greetings) {
        Thread thread = new Thread();
        this.name=name;
        this.greetings = greetings;
        thread.start();
    }

    @Override
    public void run() {
        synchronized (greetings) {
            System.out.println(greetings.sayHello(name));
            System.out.println("done");
        }
    }
}

