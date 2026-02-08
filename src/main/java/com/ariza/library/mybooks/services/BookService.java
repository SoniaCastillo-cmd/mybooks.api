package com.ariza.library.mybooks.services;

import com.ariza.library.mybooks.entities.Book;
import org.hibernate.service.spi.ServiceException;

import java.util.List;

public interface BookService {

    public List<Book> findAll() throws ServiceException;

    public Book searchBook(String title) throws  ServiceException;


}
