package com.ms.bookshelf.service;

import com.ms.bookshelf.api.BookshelfRequest;
import com.ms.bookshelf.repository.BookshelfRepository;
import com.ms.bookshelf.api.BookshelfResponse;
import com.ms.bookshelf.model.Bookshelf;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookshelfService {
    @Autowired
    BookshelfRepository bookshelfRepository;
    public BookshelfResponse addBookshelf(BookshelfRequest bookshelfRequest) {
        Bookshelf bookshelf = new Bookshelf(bookshelfRequest);
        System.out.println("Got here 1");
        bookshelfRepository.save(bookshelf);
        return new BookshelfResponse(String.format("%s created bookshelf with id: %s", bookshelf.getUserId(),  bookshelf.getBookshelfId()));
    }
/*    public BookshelfResponse getBookshelfByUserId(int UserId) {
        bookshelfRepository.findById(bookshelf);
        return new BookshelfResponse(String.format("%s created bookshelf with id: %s", bookshelf.getUserId(),  bookshelf.getBookshelfId()));
    }*/
}
