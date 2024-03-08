package com.bookapp.client;

import com.bookapp.model.Book;
import com.bookapp.model.BookNotFoundException;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import com.bookapp.util.BookDetails;
import jdk.jfr.Category;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws BookNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String category = scanner.next();

        List<Book> books = BookDetails.showBooks();
        IBookService bookService = new BookServiceImpl(books);
       // List<Book>booksByCategory bookService.getByCategory("Breathe");

        try {

            List<Book>booksByCategory=bookService.getByCategory(category);
            for (Book book:booksByCategory){
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            System.out.println("book not found "+e.getMessage());
        }
    }
}
