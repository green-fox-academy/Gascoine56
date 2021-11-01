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

import java.util.ArrayList;

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
    public String index(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("fox", currentFox);
        model.addAttribute("actions", foxLair.getRecentActions());
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String name) {
        currentFox = foxLair.findFoxByName(name);
        String action = foxLair.getDateTime() + ": Logged in as " + name;
        foxLair.addAction(action);
        return "redirect:/?name=" + currentFox.getName();
    }

    @GetMapping("/nutritionStore")
    public String nutritionStore(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("food", FOOD.values());
        model.addAttribute("drink", DRINKS.values());
        model.addAttribute("fox", currentFox);
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String nutritionStore(@RequestParam FOOD food, @RequestParam DRINKS drink) {
        String tempFood = currentFox.getFood().toString();
        String tempDrink = currentFox.getDrink().toString();
        currentFox.setFood(food);
        currentFox.setDrink(drink);
        if (!tempFood.equals(food.toString())) {
            String action = foxLair.getDateTime() + ": Food for fox " + currentFox.getName() + " changed from " + tempFood + " to " + currentFox.getFood();
            foxLair.addAction(action);
        }
        if (!tempDrink.equals(drink.toString())) {
            String action = foxLair.getDateTime() + ": Drink for fox " + currentFox.getName() + " changed from " + tempDrink + " to " + currentFox.getDrink();
            foxLair.addAction(action);
        }
        return "redirect:/?name=" + currentFox.getName();
    }

    @GetMapping("/tricks")
    public String tricksCentre(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("tricks", foxLair.unlearntTricksFilter(currentFox));
        model.addAttribute("fox", foxLair.allTricksLearnt(currentFox));
        return "tricks";
    }

    @PostMapping("/tricks")
    public String tricksCentre(@RequestParam String trick) {
        currentFox.getTricks().add(trick);
        String action = foxLair.getDateTime() + ": Fox named " + currentFox.getName() + " learned to " + trick + " !";
        foxLair.addAction(action);
        return "redirect:/?name=" + currentFox.getName();
    }

    @GetMapping("/actions")
    public String actionHistory(Model model) {
        model.addAttribute("actions", foxLair.getFoxLair().getActions());
        return "actionHistory";
    }
}