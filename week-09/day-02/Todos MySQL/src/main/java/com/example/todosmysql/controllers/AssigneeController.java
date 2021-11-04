package com.example.todosmysql.controllers;

import com.example.todosmysql.models.Assignee;
import com.example.todosmysql.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/as")
public class AssigneeController {

    AssigneeService assigneeService;

    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/")
    public String assigneeHome(Model model) {
        model.addAttribute("list", assigneeService.getAll());
        return "assignees";
    }

    @GetMapping("/edit/{id}")
    public String editAssignee(@PathVariable("id") Long id, Model model) {
        model.addAttribute("ass", assigneeService.getById(id));
        return "assedit";
    }

    @PostMapping("/edit")
    public String saveEditedAssignee(@ModelAttribute Assignee ass) {
        assigneeService.addAssignee(ass);
        return "redirect:/as/";
    }

    @GetMapping("/remove/{id}")
    public String removeAssignee(@PathVariable("id") Long id) {
        assigneeService.removeById(id);
        return "redirect:/as/";
    }

    @PostMapping("/create")
    public String createAssignee(@RequestParam String name, @RequestParam String email) {
        assigneeService.addAssignee(new Assignee(name, email));
        return "redirect:/as/";
    }
}