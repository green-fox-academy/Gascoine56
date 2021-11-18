package com.example.chatproject.controllers;

import com.example.chatproject.models.User;
import com.example.chatproject.services.messages.MessageService;
import com.example.chatproject.services.users.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class UserController {

    private final UserService userService;
    private final MessageService messageService;
    private final String urlAddress = System.getenv("apiAddress");

    public UserController(UserService userService, MessageService messageService) {
        this.userService = userService;
        this.messageService = messageService;
    }

    @GetMapping({"", "/"})
    public String loginPage() {
        return "user/loginPage";
    }

    @PostMapping("/login")
    public String login(User user, Model model) throws URISyntaxException, IOException, InterruptedException {

        if (!userService.userExistsByName(user.getUserName())){
            model.addAttribute("userNotExist", true);
            return "user/loginPage";
        }else {
            if(!userService.checkPassword(user.getUserName(), user.getPassword())){
                model.addAttribute("wrongPassword", true);
                model.addAttribute("userName", user.getUserName());
                return "user/loginPage";
            }else{
                User currentUser = userService.getUserByLogin(user.getUserName());
                return "redirect:/home/" + currentUser.getId();
            }
        }
    }

    @GetMapping("/register")
    public String registerPage(){
        return "user/register";
    }

    @PostMapping("/register")
    public String registerPage(User user, @RequestParam String pass2, Model model) {
        if (userService.userExistsByName(user.getUserName())) {
            model.addAttribute("userExistsError", true);
            model.addAttribute("userName", user.getUserName());
            return "user/register";
        } else {
            if (!user.getPassword().equals(pass2)) {
                model.addAttribute("passwordNotMatch", true);
                model.addAttribute("userName", user.getUserName());
                return "user/register";
            } else {
                User newUser = new User(user.getUserName(), user.getPassword());
                userService.createNewUser(newUser);
                model.addAttribute("registerSuccess", true);
                return "user/loginPage";
            }
        }
    }

    @GetMapping ("/home/{userId}")
    public String home(@PathVariable String userId, Model model){
        model.addAttribute("recentMessages", messageService.getRecentMessages());
        return "messages/index";
    }
}