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
    BookshelfService bookCollectionService;
    @PostMapping("/addBookshelf")
    public ResponseEntity<?> addBookCollection(@RequestBody BookshelfRequest request) {
        //return new ResponseEntity<>("Hello world from bookshelf controller", HttpStatus.OK);
        return new ResponseEntity<>(bookCollectionService.addBookshelf(request), HttpStatus.OK);
    }
/*    @RequestMapping("/addBookCollection")
    public ResponseEntity<?> getBookCollectionByUserId(@RequestBody int userId) {
        //return new ResponseEntity<>("Hello world from bookshelf controller", HttpStatus.OK);
        return new ResponseEntity<>(bookshelfService.getBookshelfByUserId(userId), HttpStatus.OK);
    }*/
}
