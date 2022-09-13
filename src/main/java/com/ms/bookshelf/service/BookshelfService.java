package com.ms.bookshelf.service;

import com.ms.bookshelf.api.BookshelfRequest;
import com.ms.bookshelf.repository.BookshelfRepository;
import com.ms.bookshelf.api.BookshelfResponse;
import com.ms.bookshelf.model.Bookshelf;


import org.springframework.stereotype.Service;

@Service
public class BookshelfService {
    BookshelfRepository bookshelfRepository;
    public BookshelfResponse addBookshelf(BookshelfRequest bookshelfRequest) {
        Bookshelf bookshelf = new Bookshelf(bookshelfRequest);
        //bookshelfRepository.save(bookshelf);
        return new BookshelfResponse(String.format("%s created bookshelf with id: %s", bookshelf.getUserId(),  bookshelf.getBookshelfId()));
    }
}
