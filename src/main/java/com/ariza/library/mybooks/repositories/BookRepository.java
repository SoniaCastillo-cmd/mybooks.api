package com.ariza.library.mybooks.repositories;

import com.ariza.library.mybooks.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {


    Book findByTitle(String title);
}
