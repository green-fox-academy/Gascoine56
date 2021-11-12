package com.example.reddit.controllers;

import com.example.reddit.models.Post;
import com.example.reddit.models.Vote;
import com.example.reddit.services.posts.PostService;
import com.example.reddit.services.posts.PostServiceImpl;
import com.example.reddit.services.users.UserService;
import com.example.reddit.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private final PostService postService;
    private final UserService userService;
    private final VoteService voteService;

    @Autowired
    public PostController(PostServiceImpl postService, UserService userService, VoteService voteService) {
        this.postService = postService;
        this.userService = userService;
        this.voteService = voteService;
    }

    @GetMapping("/index/{id}")
    public String index(Model model, @PathVariable Long id) {
        model.addAttribute("userName", userService.getById(id).getUserName());
        model.addAttribute("votes", voteService);
        model.addAttribute("id", id);
        model.addAttribute("posts", postService.getSortedPage());
        model.addAttribute("page", postService.getPage());
        return "index";
    }

    @GetMapping("/addPost/{id}")
    public String addForm(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        return "addpost";
    }

    @PostMapping("/addPost/{id}")
    public String addPost(@ModelAttribute Post post, @PathVariable Long id) {
        Post post1 = new Post(post.getText(), post.getUrl(), userService.getById(id));
        postService.addPost(post1);
        return "redirect:/index/" + id;
    }

    @GetMapping("/upvote/{userId}/{id}")
    public String upvote(@PathVariable Long id, @PathVariable Long userId) {
        if (voteService.findVoteByUserIdAndPostId(userId, id) == null) {
            Vote vote = new Vote(1, userService.getById(userId), postService.getById(id));
            voteService.addVote(vote);
            postService.upvote(id);
        } else if (voteService.findVoteByUserIdAndPostId(userId, id) != null && voteService.findVoteByUserIdAndPostId(userId, id).getVoteValue() != 1) {
            Vote vote = (voteService.findVoteByUserIdAndPostId(userId, id));
            vote.setVoteValue(1);
            voteService.addVote(vote);
            postService.upvote(id);
        }
        return "redirect:/index/" + userId;
    }

    @GetMapping("/downvote/{userId}/{id}")
    public String downvote(@PathVariable Long id, @PathVariable Long userId) {
        if (voteService.findVoteByUserIdAndPostId(userId, id) == null) {
            Vote vote = new Vote(-1, userService.getById(userId), postService.getById(id));
            voteService.addVote(vote);
            postService.downvote(id);
        } else if (voteService.findVoteByUserIdAndPostId(userId, id) != null && voteService.findVoteByUserIdAndPostId(userId, id).getVoteValue() != -1) {
            Vote vote = (voteService.findVoteByUserIdAndPostId(userId, id));
            vote.setVoteValue(-1);
            voteService.addVote(vote);
            postService.downvote(id);
        }
        return "redirect:/index/" + userId;
    }

    @GetMapping("/next/{id}")
    public String nextPage(@PathVariable Long id) {
        postService.nextPage();
        return "redirect:/index/" + id;
    }

    @GetMapping("/previous/{id}")
    public String previousPage(@PathVariable Long id) {
        postService.previousPage();
        return "redirect:/index/" + id;
    }
}