package com.example.programmerfoxclub.controllers;

import com.example.programmerfoxclub.models.Fox;
import com.example.programmerfoxclub.models.User;
import com.example.programmerfoxclub.repositories.FoxRepository;
import com.example.programmerfoxclub.repositories.TricksRepository;
import com.example.programmerfoxclub.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    UserRepository userRepository;
    FoxRepository foxRepository;
    TricksRepository tricksRepository;

    public UserController(UserRepository userRepository, FoxRepository foxRepository, TricksRepository tricksRepository) {
        this.userRepository = userRepository;
        this.foxRepository = foxRepository;
        this.tricksRepository = tricksRepository;
    }

    @GetMapping("/registration")
    public String registerForm() {
        return "userlogins/register";
    }

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute User user, @RequestParam("passwordcheck") String pass) {
        if (user.getPassword().equals(pass) && !userRepository.existsByUsername(user.getUsername())) {
            Fox fox = new Fox(user.getUsername());
            foxRepository.save(fox);
            user.setFox(fox);
            userRepository.save(user);
            return "redirect:/";
        } else
            return "userlogins/regpassnotmatch";
    }

    @GetMapping({"/login", "/"})
    public String loginPage() {
        return "userlogins/userlogin";
    }

    @PostMapping("/login")
    public String loginSent(@ModelAttribute User user, Model model) {
        if (userRepository.existsByUsernameAndPassword(user.getUsername(), user.getPassword())) {
            User user1 = userRepository.getUserByUsername(user.getUsername());
            Fox fox = foxRepository.getById(user1.getId());
            model.addAttribute(fox);
            return "index";
        } else return "userlogins/userloginerror";
    }
}