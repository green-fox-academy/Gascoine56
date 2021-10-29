package com.example.exercises.GreenFoxClass.controllers;

import com.example.exercises.GreenFoxClass.repositories.FoxInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class ClassController {
    FoxInterface service;

    @Autowired
    public ClassController(FoxInterface service) {
        this.service = service;
    }

    @GetMapping("/gfa")
    public String index(Model model) throws IOException {
        model.addAttribute("count", service.count());
        return "/gfa/index";
    }

    @GetMapping("/gfa/list")
    public String listAll(Model model) throws IOException {
        model.addAttribute("students", service.findAll());
        return "/gfa/list";
    }

    @GetMapping("/gfa/add")
    public String addForm() {
        return "/gfa/add";
    }

    @PostMapping("/gfa/save")
    public String addStudent(@RequestParam String name) throws IOException {
        service.save(name);
        return "/gfa/studentadded";
    }

    @GetMapping("/gfa/check")
    public String check() {
        return "/gfa/check";
    }

    @PostMapping("/gfa/ispresent")
    @ResponseBody
    public String check(@RequestParam String name) throws IOException {
        if (service.checkByName(name))
            return "The student is in the list";
        else
            return "The student is not in the list";
    }
}
