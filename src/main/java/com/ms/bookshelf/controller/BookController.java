package com.ms.bookshelf.controller;

import com.ms.bookshelf.api.BookRequest;
import com.ms.bookshelf.model.Book;
import com.ms.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("/addBook")
    public ResponseEntity<?> addBook(@RequestBody BookRequest bookRequest) {
        return new ResponseEntity<>(bookService.addBook(bookRequest), HttpStatus.OK);
    }
    @RequestMapping("/Books")
    public List<Book> getBooksByBookshelfId(@RequestBody int bookshelfId) {
        List<Book> books = bookService.getBooksByBookshelfId(bookshelfId).get();
        return books;
    }
    @RequestMapping("Book/{bookId}")
    public Book getBookByBookId(@PathVariable int bookId){
        Book book = bookService.getBookByBookId(bookId).get();
        return book;
    }
}

