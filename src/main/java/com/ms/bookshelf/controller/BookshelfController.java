package com.ms.bookshelf.controller;

import com.ms.bookshelf.api.BookshelfRequest;
import com.ms.bookshelf.model.Bookshelf;
import com.ms.bookshelf.service.BookshelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
public class BookshelfController {
    @Autowired
    BookshelfService bookshelfService;
    @PostMapping("/addBookshelf")
    public ResponseEntity<?> addBookshelf(@RequestBody BookshelfRequest request) {
        return new ResponseEntity<>(bookshelfService.addBookshelf(request), HttpStatus.OK);
    }

    //TODO: takes userToken and needs to get userId based off that then call that back
    @GetMapping("/git BookList")
    public void getBookshelfBySessionToken(@RequestBody String sessionToken) {
        bookshelfService.getBookshelfBySessionToken(sessionToken);
    }

}
