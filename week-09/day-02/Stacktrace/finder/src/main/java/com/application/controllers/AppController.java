package com.application.controllers;

import com.application.services.UserService;
import com.application.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@RequestMapping("/app")
public class AppController {

    UserService service;

    @Autowired
    public AppController(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute User user) {
        service.save(user);
        return "redirect:/app/";
    }
}