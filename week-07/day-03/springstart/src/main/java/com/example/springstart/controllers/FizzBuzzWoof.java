package com.example.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FizzBuzzWoof {
    private int counter = 0;

    @RequestMapping("/fizz")
    public String fizzBuzzWoof(Model model) {
        int keys = 0;
        int fontSize = 20;
        counter++;
        StringBuilder str = new StringBuilder();

        if (counter % 3 == 0) {
            keys++;
            str.append("Fizz ");
        }
        if (counter % 5 == 0) {
            keys++;
            str.append("Buzz ");
        }
        if (counter % 7 == 0) {
            keys++;
            str.append("Woof ");
        }

        if (keys == 3) {
            fontSize = 72;
        } else if (keys == 2) {
            fontSize = 48;
        } else if (keys == 1) {
            fontSize = 24;
        } else if (keys == 0) {
            str.append(counter);
        }
        model.addAttribute("text", str);
        model.addAttribute("font", fontSize + "px");
        return "FizzBuzzWoof";
    }
}