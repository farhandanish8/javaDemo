package com.objects.basics;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Life", "Farhan", 500, "Lifelesson");
        Book book1 = new Book("death ","Death", 600,"DeathLife" );

        book.checkbookType();
        book1.checkbookType();
    }
}
