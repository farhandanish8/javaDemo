package com.inter.lamb;

public class CalcLambda {
    public static void main(String[] args) {
        IMyCalculator iMyCalculator = (int x, int y)->{
            int sum = x+y;
            return sum;
        };
        //System.out.println(iMyCalculator.calculator("add "+(x+y));
        IMyCalculator iMyCalculator1 = (x,y)->x*y;
        System.out.println(iMyCalculator1.calculator(12, 2));

    }
}
