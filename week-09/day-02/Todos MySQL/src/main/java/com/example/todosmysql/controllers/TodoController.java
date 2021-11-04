package com.example.todosmysql.controllers;

import com.example.todosmysql.models.Todo;
import com.example.todosmysql.services.AssigneeService;
import com.example.todosmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService toDoService;
    private AssigneeService assigneeService;

    @Autowired
    public TodoController(TodoService toDoService, AssigneeService assigneeService) {
        this.toDoService = toDoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(required = false) String isActive) {
        model.addAttribute("todoList", toDoService.getAll());
        return "todolist";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("people", assigneeService.getAll());
        return "add";
    }

    @PostMapping("/add")
    public String addSubmit(@ModelAttribute Todo todo) {
        toDoService.addTodo(todo);
        todo.getAssignee().addTodo(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteById(@PathVariable("id") Long id) {
        toDoService.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("todo", toDoService.findById(id));
        model.addAttribute("people", assigneeService.getAll());
        return "edit";
    }

    @PostMapping("/edit")
    public String editSubmit(@ModelAttribute Todo todo, @RequestParam Long wow) {
        todo.setAssignee(assigneeService.getById(wow));
        toDoService.addTodo(todo);
        return "redirect:/todo/list";
    }

    @PostMapping("/search")
    public String searchBar(@RequestParam String query, Model model) {
        model.addAttribute("todoList", toDoService.findByQuery(query));
        return "todolist";
    }

    @PostMapping("/searchByDate")
    public String searchBarDate(@RequestParam String query, Model model) {
        model.addAttribute("todoList", toDoService.findByDate(query));
        return "todolist";
    }

    @GetMapping("/assignee/{id}")
    public String assigneeDetails(@PathVariable("id") Long id, Model model) {
        model.addAttribute("ass", assigneeService.getById(id));
        return "assigneedetail";
    }
}