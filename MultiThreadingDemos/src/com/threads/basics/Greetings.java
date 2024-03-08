package com.threads.basics;

public class Greetings {
    String sayHello(String name){
        String result = null;
        try {
            Thread.sleep(1000);
            result = "Great Day "+name;
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return result;
    }
}
