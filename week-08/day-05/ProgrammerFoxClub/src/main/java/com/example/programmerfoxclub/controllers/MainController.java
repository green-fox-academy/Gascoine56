package com.example.programmerfoxclub.controllers;

import com.example.programmerfoxclub.models.Fox;
import com.example.programmerfoxclub.repositories.DRINKS;
import com.example.programmerfoxclub.repositories.FOOD;
import com.example.programmerfoxclub.services.FoxServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    FoxServices foxLair;
    Fox currentFox;

    @Autowired
    public MainController(FoxServices foxLair) {
        this.foxLair = foxLair;
        this.currentFox = foxLair.getFirstFox();
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("fox", currentFox);
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String name) {
        currentFox = foxLair.findFoxByName(name);
        return "redirect:/";
    }

    @GetMapping("/nutritionStore")
    public String nutritionStore(Model model) {
        model.addAttribute("food", FOOD.values());
        model.addAttribute("drink", DRINKS.values());
        model.addAttribute("fox", currentFox);
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String nutritionStore(@RequestParam FOOD food, @RequestParam DRINKS drink) {
        currentFox.setFood(food);
        currentFox.setDrink(drink);
        return "redirect:/";
    }

    @GetMapping("/tricks")
    public String tricksCentre(Model model) {
        model.addAttribute("tricks", foxLair.unlearntTricksFilter(currentFox));
        model.addAttribute("fox", foxLair.allTricksLearnt(currentFox));
        return "tricks";
    }

    @PostMapping("/tricks")
    public String tricksCentre(@RequestParam String trick) {
        currentFox.getTricks().add(trick);
        return "redirect:/";
    }
}