package com.ms.bookshelf.api;

import com.ms.bookshelf.model.Bookshelf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class BookRequest {
    private String title;
    private String author;
    private Bookshelf bookshelf;
}

