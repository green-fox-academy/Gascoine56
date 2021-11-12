package com.example.reddit.controllers;

import com.example.reddit.models.User;
import com.example.reddit.services.posts.PostService;
import com.example.reddit.services.users.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    UserService userService;
    PostService postService;

    public UserController(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @GetMapping({"/", ""})
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, Model model) {
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        if (userService.existsByName(user.getUserName())) {
            User user1 = userService.getByName(user.getUserName());
            return "redirect:/index/" + user1.getId();
        } else {
            model.addAttribute("userData", user);
            model.addAttribute("error", true);
            return "login";
        }
    }

    @GetMapping("/register")
    public String registerForm() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(Model model, @RequestParam String name, @RequestParam String password1, @RequestParam String password2) {
        if (!password1.equals(password2)) {
            model.addAttribute("userName", name);
            model.addAttribute("error1", true);
            return "register";
        } else if (userService.existsByName(name)) {
            model.addAttribute("userName", name);
            model.addAttribute("error2", true);
            return "register";
        } else {
            User user = new User(name, password1);
            userService.addUser(user);
            return "redirect:/index/" + user.getId();
        }
    }
}
