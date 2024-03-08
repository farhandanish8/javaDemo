package com.inter.lamb;

public class LambdaDemo {
    public static void main(String[] args) {
        IGreeter greeter = (String message)->{
            System.out.println(message);
        };
        greeter.greetMessage("Great day");

        greeter = message -> System.out.println(message+"!!!!");
        greeter.greetMessage("Wow");
    }
}
