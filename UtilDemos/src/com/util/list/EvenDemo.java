package com.util.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11,22,33,44,55,66);
        List<Integer> evennumbers = new ArrayList<>();

        for(Integer numbers : nums){
            if(numbers % 2 == 0){
                evennumbers.add(numbers);
            }
        }
        for (Integer even : evennumbers){
            System.out.println(even);

        }
    }
}
