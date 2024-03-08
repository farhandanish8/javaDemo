package com.threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo {
    public static void main(String[] args) {
        ExecutorService executeService = Executors.newFixedThreadPool(10);
        
        for (int i = 0; i<=10; i++){
            executeService.execute(()->{
                        System.out.println("Doing Task");
                        executeService.shutdown();
                    });
        }
    }
    }
