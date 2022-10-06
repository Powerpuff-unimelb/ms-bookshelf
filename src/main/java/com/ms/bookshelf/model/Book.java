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
    private String Author;

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
