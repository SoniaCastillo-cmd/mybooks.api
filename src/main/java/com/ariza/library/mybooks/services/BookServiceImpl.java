package com.ariza.library.mybooks.services;


import com.ariza.library.mybooks.entities.Book;
import com.ariza.library.mybooks.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.service.spi.ServiceException;//preguntar a Maria
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
            log.error("ERROR: Fetch books failed", e);
            throw new ServiceException("Error retrieving books");//Error al recuperar libros
        }
    }

    @Override
    public Book searchBook(String title) throws ServiceException {
        log.info("[searchBook]");
        log.debug("[title:{}]", title);
        try {
            return repository.findByTitle(title.trim().toUpperCase());
        } catch (Exception e) {
            log.error("BookNotFoundExeption", e);
            throw new ServiceException("Error BookNotFound");
        }
    }
    @Override
    public List<Book> findByAuthor(String author) throws ServiceException{
        log.info("[findByAuthor]");
        log.debug("[author:{}]", author);
        try {
            return  repository.findByAuthor(author.trim().toUpperCase());
        } catch (Exception e){
            log.error("AuthorNotFoundExeption",e);
            throw new ServiceException("Error AuthorNotFound");
        }
    }





}
