package com.objects.basics;

public class Book {
    String title;
    String author;
    int price;
    String category;

    public Book(String title, String author, int price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }
    void getDetails(){
        System.out.println("title " + title);
        System.out.println("author " + author);
        System.out.println("price " + price);
        System.out.println("category " + category);
    }

    void checkbookType(){
        if(price > 500)
        {
            System.out.println("Premium book");

        }
        else
        {
            System.out.println("Standard book");
        }


    }
}
