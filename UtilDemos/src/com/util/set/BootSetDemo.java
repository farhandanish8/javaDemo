package com.util.set;

import com.list.custom.Book;

import java.util.*;

public class BootSetDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java","Kathy",900),
                new Book("Java","Kathy",900),
                new Book("Samclub","Robin",350),
                new Book("Leadership","Robin",900),
                new Book("Spring","Kathy",1900),
                new Book("JSPServlets","Kathy",900));

        System.out.println("List Book");
        for (Book book : books){
            System.out.println(book);
        }
        System.out.println();
        System.out.println("Set Books");
        Set<Book>bookSet = new TreeSet<>(books);
        for (Book book : bookSet ){
            System.out.println(book);
        }

    }
}
