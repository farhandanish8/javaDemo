package com.inter.extend;

import com.inter.basics.ICompressor;

public class CalcMain {
    public static void main(String[] args) {
        ICalculator iCalculator = new BasicCalculator();
        iCalculator.add( 10, 20);
        iCalculator.product(10, 20);

        }

    }
