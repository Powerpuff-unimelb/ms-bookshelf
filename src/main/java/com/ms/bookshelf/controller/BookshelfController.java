package com.ms.bookshelf.controller;

import com.ms.bookshelf.api.BookshelfRequest;
import com.ms.bookshelf.service.BookshelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
public class BookshelfController {
    @Autowired
    BookshelfService bookshelfService;
    @RequestMapping("/addBookshelf")
    public ResponseEntity<?> addBookshelf(@RequestBody BookshelfRequest request) {
        //return new ResponseEntity<>("Hello world from bookshelf controller", HttpStatus.OK);
        return new ResponseEntity<>(bookshelfService.addBookshelf(request), HttpStatus.OK);
    }
}
