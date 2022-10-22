package com.ms.bookshelf.model;

import com.ms.bookshelf.api.BookRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
public class Book {
    @Id
    private int bookId;

    private String title;
    private String author;
    private String cover;
    private String ISBN;
    private Date date;
    private List<String> tags;
    private String group;
    private String description;
    private List<String> notes;
    private List<String> reviews;
    private float rating;
    private String status;
    private Boolean isPublic;

    @ManyToOne
    private Bookshelf bookshelf;

    public Book(BookRequest bookRequest){
        this.setTitle(bookRequest.getTitle());
        this.setAuthor(bookRequest.getAuthor());
        this.setBookshelf(bookRequest.getBookshelf());
    }
    public int getBookshelfId(){
        return this.getBookshelf().getBookshelfId();
    }
}
