package com.example.reddit.controllers;

import com.example.reddit.models.Post;
import com.example.reddit.repositories.UserRepository;
import com.example.reddit.services.PostService;
import com.example.reddit.services.PostServiceImpl;
import com.example.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private final PostService postService;
    private UserService userService;

    @Autowired
    public MainController(PostServiceImpl postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("posts", postService.getSortedPage());
        model.addAttribute("page", postService.getPage());
        return "index";
    }

    @GetMapping("/addPost")
    public String addForm(){
        return "addpost";
    }

    @PostMapping("addPost")
    public String addPost(Post post){
        Post post1 = new Post(post.getText(),post.getUrl());
        postService.addPost(post1);
        return "redirect:/index";
    }

    @GetMapping("/upvote/{id}")
    public String upvote(@PathVariable Long id){
        postService.upvote(id);
        return "redirect:/index";
    }

    @GetMapping("/downvote/{id}")
    public String downvote(@PathVariable Long id){
        postService.downvote(id);
        return "redirect:/index";
    }

    @GetMapping("/next")
    public String nextPage(){
        postService.nextPage();
        return "redirect:/index";
    }

    @GetMapping("/previous")
    public String previousPage(){
        postService.previousPage();
        return "redirect:/index";
    }
}