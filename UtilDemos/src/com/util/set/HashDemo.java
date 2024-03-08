package com.util.set;

import java.util.*;

public class HashDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new LinkedHashSet<>();
       // Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Pineapple");
        hashSet.add("Orange");
        hashSet.add("Banana");
        hashSet.add("Kiwi");
        hashSet.add("100");
        hashSet.add(null);
        System.out.println(hashSet);
       // System.out.println(hashSet);
        for (String element : hashSet){
            System.out.println(element);
        }
        List<String> fruits = Arrays.asList("Apple","Orange","Apple");
        Set<String> newfruits = new HashSet<>(fruits);
        System.out.println(newfruits);
    }
}
