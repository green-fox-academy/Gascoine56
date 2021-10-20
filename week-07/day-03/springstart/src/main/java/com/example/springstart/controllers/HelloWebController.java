package com.example.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    public static AtomicLong count = new AtomicLong(0);

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        count.addAndGet(1);
        Greeting greeting = new Greeting(name, count);
        String result;
        model.addAttribute("content", greeting.getContent());
        model.addAttribute("count", greeting.getGreetCounter());
        return "greeting";
    }
}