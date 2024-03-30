package com.specialty.bookstore.catalogmanagement.service;

import org.springframework.stereotype.Service;

import com.specialty.bookstore.catalogmanagement.interfaces.IBookService;
import com.specialty.bookstore.catalogmanagement.model.Book;
import com.specialty.bookstore.catalogmanagement.repository.BookRepository;

@Service
public class BookService implements IBookService{

    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book addBook(Book book) {
        return repository.save(book);
    }
    
}
