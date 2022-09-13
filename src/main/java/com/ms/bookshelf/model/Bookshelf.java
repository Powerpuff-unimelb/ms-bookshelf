package com.ms.bookshelf.model;

import com.ms.bookshelf.api.BookshelfRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

import static javax.persistence.CascadeType.ALL;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bookshelves")
public class Bookshelf {

    public Bookshelf(BookshelfRequest bookshelfRequest){
        this.userId = bookshelfRequest.getUserId();
    }
    @Id
    private int bookshelfId;

    private int userId;

    @OneToMany(mappedBy = "bookshelf", cascade = ALL)
    List<Book> Books;
}
