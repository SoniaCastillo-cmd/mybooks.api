package com.ariza.library.mybooks.controllers;


import com.ariza.library.mybooks.entities.Book;
import com.ariza.library.mybooks.services.BookService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping
@Slf4j
public class BookController {

    public BookService service;
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/books")
    public String findAll(Model model) throws ServiceException{
    log.info("[findAll]");
    List<Book> list=service.findAll();
    model.addAttribute("list",list);
    return "bookList";
    }
    @GetMapping("/books/search")
    public String searchBook(@RequestParam String title, Model model) throws ServiceException{
        log.info("[searchBook]");
        log.debug("[title:{}]",title);
        title=title.trim().toUpperCase();
        Book foundBook=service.searchBook(title);
        if(foundBook == null){
            List<Book> list=service.findAll();
            model.addAttribute("lis", list);
            model.addAttribute("Error" + "We're sorry, the book" + title+" is not in our catalog." );
            return "bookList";
        }

        model.addAttribute("book", foundBook);
        return "bookDetails";
    }












}
