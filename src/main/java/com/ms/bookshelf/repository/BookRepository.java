package com.ms.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ms.bookshelf.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "SELECT * FROM book WHERE book.bookshelfId = :bookshelfId", nativeQuery = true)
    public Optional<List<Book>> getBooksByBookshelfId(@Param("bookshelfId") int bookshelfId);
}