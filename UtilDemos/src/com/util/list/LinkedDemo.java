package com.util.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Spring");
        list.add("node");
        list.add("Angular");
        list.add("maven");
      //  System.out.println(list);
        list.addFirst("Html");
        list.addLast("Css");
        list.set(1,"react");
      //  System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println();

        for (String s:list){
            System.out.println(s);
        }


        System.out.println("------");
        ListIterator<String>itr = list.listIterator(list.size());
        while (itr.hasPrevious()){
            String str = itr.previous();
            System.out.println(str);
        }

        System.out.println("-------");
        System.out.println("sorting list");
        Collections.sort(list);


    }
}
