package com.inter.extend;

public class BasicCalculator implements ICalculator {
    @Override
    public void product(int x, int y) {
        System.out.println(x+y);

    }

    public void add(int x, int y){
        System.out.println(x+y);

    }
}