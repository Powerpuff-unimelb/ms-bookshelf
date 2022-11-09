package com.ms.bookshelf.model;

import com.ms.bookshelf.api.BookRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "cover")
    private String cover;

    @Column(name = "isbn")
    private String ISBN;

    @Column(name = "date")
    private String date;

    @Column(name = "tags")
    @ElementCollection(targetClass=String.class)
    private List<String> tags;

    @Column(name = "`group`")
    private String group;

    @Column(name = "description")
    private String description;

    @Column(name = "notes")
    @ElementCollection(targetClass=String.class)
    private List<String> notes;

    @Column(name = "reviews")
    @ElementCollection(targetClass=String.class)
    private List<String> reviews;

    @Column(name = "rating")
    private float rating;

    @Column(name = "status")
    private String status;

    @Column(name = "isPublic")
    private Boolean isPublic;

    @ManyToOne
    @JoinColumn(name="bookshelf_id", referencedColumnName="bookshelf_id")
    private Bookshelf bookshelf;

    public Book(BookRequest bookRequest){
        this.setTitle(bookRequest.getTitle());
        this.setAuthor(bookRequest.getAuthor());
        this.setCover(bookRequest.getCover());
        this.setISBN(bookRequest.getISBN());
        this.setTags(bookRequest.getTags());
        this.setDate(bookRequest.getDate());
        this.setGroup(bookRequest.getGroup());
        this.setDescription(bookRequest.getDescription());
        this.setNotes(bookRequest.getNotes());
        this.setReviews(bookRequest.getReviews());
        this.setRating(bookRequest.getRating());
        this.setRating(bookRequest.getRating());
        this.setStatus(bookRequest.getStatus());
        this.setIsPublic(bookRequest.getIsPublic());
    }
    public int getBookshelfId(){
        return this.getBookshelf().getBookshelfId();
    }
}
