package com.api.book.bootapibook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootapibook.entities.Book;
import com.api.book.bootapibook.services.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public List<Book> getBooks(){
        return this.bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
        Book book = bookService.getBookbyID(id);
        return book;
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        Book newbook = this.bookService.addBook(book);
        System.out.println(newbook);
        return newbook;
    }

    @DeleteMapping("/books/{id}")
    public Book removeBook(@PathVariable("id") int id){
        Book book = this.bookService.removeBook(id);
        System.out.println(book);
        return book;
    }
}
