package com.specialty.bookstore.catalogmanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.specialty.bookstore.catalogmanagement.interfaces.IBookService;
import com.specialty.bookstore.catalogmanagement.model.Book;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
    
    private IBookService service;

    public BookController(IBookService service) {
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        return new ResponseEntity<Book>(this.service.addBook(book), HttpStatus.OK);
    }
}
