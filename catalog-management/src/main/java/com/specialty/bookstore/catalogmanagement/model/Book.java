package com.specialty.bookstore.catalogmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;

    private String title;

    private String author;

    private String rarity;

    private String bookCondition;

    public Book() {
    }

    public Book(long bookId, String title, String author, String rarity, String bookCondition) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.rarity = rarity;
        this.bookCondition = bookCondition;
    }
    
    public Book(String title, String author, String rarity, String bookCondition) {
        this.title = title;
        this.author = author;
        this.rarity = rarity;
        this.bookCondition = bookCondition;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getBookCondition() {
        return bookCondition;
    }

    public void setBookCondition(String bookCondition) {
        this.bookCondition = bookCondition;
    }
    
}
