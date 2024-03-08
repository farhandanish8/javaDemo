package bookapp.client;


import bookapp.model.Book;
import bookapp.exceptions.BookNotFoundException;
import bookapp.service.BookServiceImpl;
import bookapp.service.IBookService;
import bookapp.util.BookDetails;

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
