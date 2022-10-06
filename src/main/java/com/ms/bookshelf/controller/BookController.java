package com.ms.bookshelf.controller;

import com.ms.bookshelf.api.BookRequest;
import com.ms.bookshelf.model.Book;
import com.ms.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("/addBook")
    public ResponseEntity<?> addBook(@RequestBody BookRequest bookRequest) {
        //return new ResponseEntity<>("Hello world from bookshelf controller", HttpStatus.OK);
        return new ResponseEntity<>(bookService.addBook(bookRequest), HttpStatus.OK);
    }
}

