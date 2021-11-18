package com.example.chatproject.controllers;

import com.example.chatproject.models.ApiKey;
import com.example.chatproject.models.User;
import com.example.chatproject.services.messages.MessageService;
import com.example.chatproject.services.users.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    UserService userService;
    MessageService messageService;

    public UserRestController(UserService userService, MessageService messageService) {
        this.userService = userService;
        this.messageService = messageService;
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user) {
        if (userService.userExistsByLogin(user.getLogin())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("The login is already in use. please, use another one.");
        } else {
            User newUser = new User(user.getLogin(), user.getPassword());
            userService.createNewUser(newUser);
            return ResponseEntity.status(HttpStatus.OK).body(newUser.toString());
        }
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody User user) {
        if (!userService.userExistsByLogin(user.getLogin())) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User does not exist");
        } else {
            if (!userService.checkPassword(user.getLogin(), user.getPassword())) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong password");
            } else {
                User currentUser = userService.getUserByLogin(user.getLogin());
                return ResponseEntity.status(HttpStatus.OK).body(new ApiKey());
            }
        }
    }


}