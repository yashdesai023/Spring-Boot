package com.api.book.bootapibook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.bootapibook.entities.Book;

@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(112, "Complete Python", "CampusX"));
        list.add(new Book(113, "Indian Polity", "M. Laxmikant")); 
        list.add(new Book(114, "English Competetive Examination", "Wren & Martin")); 
        list.add(new Book(115, "CDS Topic wise PYQs", "Disha Publication")); 
        list.add(new Book(116, "Modern India", "Bipin Chandra")); 
    }

    //Get all Books
    public List<Book> getAllBooks(){
            return list;
    }

    //Get single book ID
    public Book getBookbyID(int id){
        Book book = null;
        try {
              
            book = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
                
        } catch (Exception e) {
            System.out.println("Book Not Found: Book ID is Invalid.");
        }
        return book;
    }
}
