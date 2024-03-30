package com.specialty.bookstore.catalogmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.specialty.bookstore.catalogmanagement.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
