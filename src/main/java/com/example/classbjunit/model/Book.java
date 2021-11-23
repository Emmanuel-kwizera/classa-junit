package com.example.classbjunit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    public Book(int bookId, String name, int price, int pages) {
        this.bookId = bookId;
        this.name = name;
        this.price = price;
        this.pages = pages;
    }

    @Id
    private int bookId;

    private String name;

    private int price;

    private int pages;

    public Book() {
        super();
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
