package com.ms.bookshelf.repository;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ms.bookshelf.model.Bookshelf;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookshelfRepository extends JpaRepository<Bookshelf, Integer> {
    @Query(value = "SELECT * FROM Bookshelf WHERE Bookshelf.userId = :userId", nativeQuery = true)
    public Optional<List<Bookshelf>> findByUserId(@Param("userId") int UserId);
}