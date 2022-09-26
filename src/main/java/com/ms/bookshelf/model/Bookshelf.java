package com.ms.bookshelf.model;

import com.ms.bookshelf.api.BookshelfRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bookshelf")
public class Bookshelf {

    public Bookshelf(BookshelfRequest bookshelfRequest){
        this.userId = bookshelfRequest.getUserId();
    }
    @Id
    @Column(name = "bookshelf_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookshelfId;

    @Getter@Setter
    private int userId;

    @OneToMany(mappedBy = "bookshelf", cascade = ALL)
    List<Book> Books;
}



