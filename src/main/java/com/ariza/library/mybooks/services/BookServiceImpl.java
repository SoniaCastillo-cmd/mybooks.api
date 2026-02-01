package com.ariza.library.mybooks.services;


import com.ariza.library.mybooks.entities.Book;
import com.ariza.library.mybooks.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    public BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> findAll() throws ServiceException {
        log.info("[findAll]");
        try {
            return repository.findAll();
        } catch (Exception e){
            log.error("JPA_ERROR: Fetch books failed",e);
            throw new ServiceException("Error retrieving books",e);
        }

    }
}
