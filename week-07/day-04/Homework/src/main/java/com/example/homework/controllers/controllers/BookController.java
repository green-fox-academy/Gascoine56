package com.example.homework.controllers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BookController {
    private List<Book> library = new ArrayList<Book>();

    public BookController() {
        library.add(new Book("Cat's Cradle", "Kurt Vonnegut", "1963"));
        library.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "1968"));
        library.add(new Book("Sourcery", "Terry Pratchett", "1995"));
        library.add(new Book("Color of magic", "Terry Pratchett", "1991"));

    }

    @GetMapping("/books")
    public String list(@RequestParam(name = "author", required = false) String author, Model model) {
        List<Book> queriedBooks;
        if (author == null) {
            queriedBooks = library;
            model.addAttribute("queriedBooks", queriedBooks);
        } else {
            queriedBooks = filterByAuthor(author);
            model.addAttribute("queriedBooks", queriedBooks);
            model.addAttribute("author", author);
        }
        return "index";
    }

    private List<Book> filterByAuthor(String author) {
        return library.stream().filter(x -> x.getAuthor().equals(author)).collect(Collectors.toList());
    }

    @GetMapping("/books/{id}")
    public String bookById(@PathVariable int id, Model model) {
        if (id < library.size()) {
            model.addAttribute("author", library.get(id).getAuthor());
            model.addAttribute("releaseYear", library.get(id).getReleaseYear());
            model.addAttribute("title", library.get(id).getTitle());
            model.addAttribute("id", library.get(id).getId());
            return "BookById";
        } else {
            model.addAttribute("size", library.size() - 1);
            return "OutOfBounds";
        }
    }

    @GetMapping("/books/add")
    public String addBookForm(Model model, @ModelAttribute(name = "book") Book book) {
        model.addAttribute("book", book);
        return "create";
    }

    @RequestMapping(path = "/books/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute(name = "book") Book book) {
        library.add(book);
        return "redirect:/books";
    }
}