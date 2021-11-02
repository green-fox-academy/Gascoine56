package com.example.todosexercise.controllers;

import com.example.todosexercise.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoRepository repository;

    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todoList", repository.findAll());
        return "todolist";
    }
}