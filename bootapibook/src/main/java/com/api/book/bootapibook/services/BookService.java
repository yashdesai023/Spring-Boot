package com.api.book.bootapibook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootapibook.dao.BookRepository;
import com.api.book.bootapibook.entities.Book;

@Component
public class BookService {
    // private static List<Book> list = new ArrayList<>();

    // static{
    //     list.add(new Book(112, "Complete Python", "CampusX"));
    //     list.add(new Book(113, "Indian Polity", "M. Laxmikant")); 
    //     list.add(new Book(114, "English Competetive Examination", "Wren & Martin")); 
    //     list.add(new Book(115, "CDS Topic wise PYQs", "Disha Publication")); 
    //     list.add(new Book(116, "Modern India", "Bipin Chandra")); 
    // }
    @Autowired
    private BookRepository bookRepository;

    //Get all Books
    public List<Book> getAllBooks(){
            List<Book> list = (List<Book>) this.bookRepository.findAll();
            return list;
    }

    //Get single book ID
    public Book getBookbyID(int id){
        Book book = null;
        try {
              
            // book = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
            book = this.bookRepository.findById(id);
                
        } catch (Exception e) {
            System.out.println("Book Not Found: Book ID is Invalid.");
        }
        return book;
    }

    //Add Book
    public Book addBook(Book newbook){
        // list.add(newbook);
        Book newbook = bookRepository.save(book);
        return newbook;
    }

    //Delete Book
    public Book removeBook(int id){
        Book book = null;
        try{
            book = list.stream().filter(e->e.getId()==id).findFirst().orElse(null);
            list.remove(book);
        }catch(Exception e){
            System.out.println("Book Not Found: Book ID is Invalid");
        }
        return book;
    }

    
}
