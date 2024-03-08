package com.inter.lamb;

public class AnonyDemo {
    public static void main(String[] args) {
        IGreeter greeter = new IGreeterimpl();
        greeter.greetMessage("Welcome to Lambda");

        IGreeter greeter1 = new IGreeter() {
            @Override
            public void greetMessage(String message) {
                System.out.println("Hello, how are you");
            }
        };
        greeter1.greetMessage("Great day");
    }
}
