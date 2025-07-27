package com.example.memoryDB.book.db.repository;

import com.example.memoryDB.book.db.entity.BookEntity;
import com.example.memoryDB.db.SimpleDataRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}