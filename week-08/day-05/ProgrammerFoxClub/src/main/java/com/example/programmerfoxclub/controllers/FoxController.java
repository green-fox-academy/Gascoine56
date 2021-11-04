package com.example.programmerfoxclub.controllers;

import com.example.programmerfoxclub.enums.DRINKS;
import com.example.programmerfoxclub.enums.FOOD;
import com.example.programmerfoxclub.models.Action;
import com.example.programmerfoxclub.models.Fox;
import com.example.programmerfoxclub.repositories.ActionRepository;
import com.example.programmerfoxclub.repositories.FoxRepository;
import com.example.programmerfoxclub.repositories.TricksRepository;
import com.example.programmerfoxclub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

@Controller
public class FoxController {

    FoxRepository foxRepository;
    UserRepository userRepository;
    TricksRepository tricksRepository;
    ActionRepository actionRepository;

    @Autowired
    public FoxController(ActionRepository actionRepository, FoxRepository foxRepository, UserRepository userRepository, TricksRepository tricksRepository) {
        this.foxRepository = foxRepository;
        this.userRepository = userRepository;
        this.tricksRepository = tricksRepository;
        this.actionRepository = actionRepository;

    }

    @GetMapping("/nutritionStore/{name}")
    public String nutritionStore(@PathVariable("name") String name, Model model) {
        model.addAttribute("fox", foxRepository.findByName(name));
        model.addAttribute("food", FOOD.values());
        model.addAttribute("drinks", DRINKS.values());
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore/{name}")
    public String nutritionStore(Model model, @PathVariable("name") String name, @RequestParam FOOD food, @RequestParam DRINKS drink) {
        Fox fox = foxRepository.findByName(name);
        fox.setFood(food);
        fox.setDrink(drink);
        Action action = new Action("The food was set to " + fox.getFood() + "and drink to " + fox.getDrink());
        actionRepository.save(action);
        fox.getActions().add(action);
        foxRepository.save(fox);
        model.addAttribute("fox", fox);
        return "index";
    }

    @GetMapping("/tricks/{name}")
    public String tricksCentre(@PathVariable("name") String name, Model model) {
        model.addAttribute("fox", foxRepository.findByName(name));
        model.addAttribute("tricks", tricksRepository.findAll().stream().filter(x -> !foxRepository.findByName(name).getTricks().contains(x)).collect(Collectors.toList()));
        return "tricks";
    }


    @PostMapping("/tricks/{name}")
    public String tricksCentre(@PathVariable("name") String name, @RequestParam String trick) {
        Fox fox = foxRepository.findByName(name);
        Action action = new Action("You learnt new trick: " + trick + "!");
        actionRepository.save(action);
        fox.getTricks().add(tricksRepository.findByName(trick));
        fox.getActions().add(action);
        foxRepository.save(fox);
        foxRepository.save(fox);
        return "redirect:/tricks/" + name;
    }


    @GetMapping("/actions/{name}")
    public String actionHistory(@PathVariable("name") String name, Model model) {
        model.addAttribute("actions", foxRepository.findByName(name).getActions());
        model.addAttribute("fox", foxRepository.findByName(name));
        return "actionHistory";
    }
}