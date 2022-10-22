package com.ms.bookshelf.service;

import com.ms.bookshelf.api.BookshelfRequest;
import com.ms.bookshelf.model.Book;
import com.ms.bookshelf.repository.BookshelfRepository;
import com.ms.bookshelf.api.BookshelfResponse;
import com.ms.bookshelf.model.Bookshelf;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

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

    public Optional<List<Bookshelf>> getBookshelfBySessionToken(String sessionToken) {
        String uri = 'path/to/user-ms/getUserIdBysessionToken';
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(uri, String.class);
        int userId = response.UserId();
        return bookshelfRepository.findByUserId(UserId);
    }
}
