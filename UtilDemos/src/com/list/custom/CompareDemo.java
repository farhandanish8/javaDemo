package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java","Kathy",900),
                new Book("Samclub","Robin",350),
                new Book("Spring","Kathy",1900),
                new Book("JSP&Servlets","Kathy",900),
                new Book("Leadership","Robin",900));
        System.out.println("Before sorting");
        for(Book nbook : books)
            System.out.println(nbook);

        System.out.println("After Sorting");
        Collections.sort(books);
        for (Book nbook : books)
            System.out.println(nbook);

        System.out.println();
    }
}
