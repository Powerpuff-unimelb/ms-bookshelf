package com.ms.bookshelf.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class BookRequest {
    private String title;
    private String author;
    private String cover;
    private String ISBN;
    private String date;
    private List<String> tags;
    private String group;
    private String description;
    private List<String> notes;
    private List<String> reviews;
    private float rating;
    private String status;
    private Boolean isPublic;
    private int bookshelfId;
}

