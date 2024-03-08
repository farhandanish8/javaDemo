package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FruitMain {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("pineapple");
        fruitList.add("strawberry");
        fruitList.add("banana");
        fruitList.add("mango");
        System.out.println(fruitList);

        List<String> newfruits = new ArrayList<>();
        for (String fruits : fruitList) {
            if (fruits.equals("a")) {
                newfruits.add(fruits);
            }
        }
        Iterator iterator = newfruits.listIterator();
    }
}
