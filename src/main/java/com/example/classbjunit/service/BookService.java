package com.example.classbjunit.service;

import com.example.classbjunit.model.Book;
import com.example.classbjunit.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll() {
        List<Book> books = bookRepository.findAll();

        return books;
    }

    public Book getById(int id) {
        Optional<Book> findById = bookRepository.findById(id);
        if(findById.isPresent()) {
            Book book = findById.get();

            return book;
        }
        return null;
    }

}
