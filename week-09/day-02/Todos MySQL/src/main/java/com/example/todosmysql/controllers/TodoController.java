package com.example.todosmysql.controllers;

import com.example.todosmysql.models.Todo;
import com.example.todosmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    public TodoRepository repository;

    @Autowired
    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(required = false) String isActive) {
        if (isActive == null) model.addAttribute("todoList", repository.findAll());
        else if (isActive.equals("true"))
            model.addAttribute("todoList", repository.findAllByDone(true));
        else if (isActive.equals("false"))
            model.addAttribute("todoList", repository.findAllByDone(false));
        else model.addAttribute("todoList", repository.findAll());
        return "todolist";
    }

    @GetMapping("/add")
    public String addForm() {
        return "add";
    }

    @PostMapping("/add")
    public String addSubmit(@RequestParam String title) {
        repository.save(new Todo(title));
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteById(@PathVariable("id") Long id) {
        repository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("todo", repository.findById(id).get());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editSubmit(@ModelAttribute Todo todo) {
        repository.save(todo);
        return "redirect:/todo/list";
    }
}