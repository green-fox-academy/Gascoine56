package com.example.exercises.UsefulUtilities.controllers;

import com.example.exercises.UsefulUtilities.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilitiesController {
    UtilityService service;

    public UtilitiesController(UtilityService service) {
        this.service = service;
    }

    @GetMapping("/useful")
    public String useful() {
        return "usefultemplates/useful";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", service.randomColor());
        return "usefultemplates/colored";
    }

    @GetMapping("/useful/email")
    public String email(@RequestParam String email, Model model) {
        if (service.validateEmail(email)) {
            model.addAttribute("color", "green");
            model.addAttribute("mail", email + " is a valid email address");
        } else {
            model.addAttribute("color", "red");
            model.addAttribute("mail", email + " is not a valid email address");
        }
        return "usefultemplates/email";
    }

    @PostMapping("/useful/encode")
    public String encode(@RequestParam String text, @RequestParam int number, Model model) {
        model.addAttribute("result", service.caesar(text, number));
        return "usefultemplates/caesar";
    }

    @PostMapping("/useful/decode")
    public String decode(@RequestParam String text, @RequestParam int number, Model model) {
        model.addAttribute("result", service.caesar(text, -(number)));
        return "usefultemplates/caesar";
    }
}