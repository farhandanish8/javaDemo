package com.threads.basics;

public class RunThread {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        Runner runner1 = new Runner("Ram",greetings);
        Runner runner2 = new Runner("Tom",greetings);
        Runner runner3 = new Runner("Sam",greetings);
        Runner runner4 = new Runner("John",greetings);

        runner1.run();
        runner2.run();
        runner3.run();
        runner4.run();

    }
}
