package com.ms.bookshelf.api;

import com.ms.bookshelf.model.Book;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToMany;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
@Getter@Setter
public class BookshelfRequest {
    private int userId;
}
