package com.ms.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ms.bookshelf.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}