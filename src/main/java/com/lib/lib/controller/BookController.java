package com.lib.lib.controller;

import com.lib.lib.model.Book;
import com.lib.lib.repository.BookRepository;
import com.lib.lib.repository.ImageRepository;
import com.lib.lib.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    ImageRepository imageRepository;
    @Autowired
    PersonRepository personRepository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("book", new Book());
        return "index";
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String listBooks(@ModelAttribute("book") Book book, Model model) throws IOException {
        model.addAttribute("book", new Book());
        model.addAttribute("listBooks", this.bookRepository.findAll());
        return "books";
    }
}







