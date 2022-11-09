package com.ms.bookshelf.service;

import com.ms.bookshelf.api.BookRequest;
import com.ms.bookshelf.api.BookResponse;
import com.ms.bookshelf.model.Book;
import com.ms.bookshelf.repository.BookRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public BookResponse addBook(BookRequest bookRequest) {
        Book book = new Book(bookRequest);
        bookRepository.save(book);
        return new BookResponse(String.format("book with name %s created with Id: %s",book.getTitle(), book.getBookId()));
    }
    public Optional<List<Book>> getBooksByBookshelfId(int bookshelfId){
        return bookRepository.getBooksByBookshelfId(bookshelfId);
    }

    public Optional<Book> getBookByBookId(int bookId){
        return bookRepository.getBookByBookId(bookId);
    }
}