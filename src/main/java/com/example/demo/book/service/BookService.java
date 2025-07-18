package com.example.demo.book.service;

import com.example.demo.book.db.entity.BookEntity;
import com.example.demo.book.db.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    private final BookRepository bookRepository;

    // @RequiredArgsConstructor 와 같은 역할
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    // create, update
    public BookEntity create(BookEntity book){
        return bookRepository.save(book);
    }

    // all
    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }

    // find one

    // delete


}
