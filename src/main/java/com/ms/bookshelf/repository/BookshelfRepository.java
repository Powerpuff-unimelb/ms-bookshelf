package com.ms.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ms.bookshelf.model.Bookshelf;
import org.springframework.stereotype.Repository;

@Repository
public interface BookshelfRepository extends JpaRepository<Bookshelf, Integer> {
}