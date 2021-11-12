package com.example.reddit;

import com.example.reddit.models.Post;
import com.example.reddit.models.User;
import com.example.reddit.repositories.PostRepository;
import com.example.reddit.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    PostRepository postRepository;
    UserRepository userRepository;

    public RedditApplication(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Palo", "123");
        User user2 = new User("Zoltan", "234");
        userRepository.save(user);
        userRepository.save(user2);

        postRepository.save(new Post("post1", "www.www.www", user));
        postRepository.save(new Post("Text", "url.www.www", user));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("Katatonia", "www.wow.www", user2));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("Rishloo", "www.wow.www", user));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("10", "www.wow.www", user));
        postRepository.save(new Post("Tool", "www.wow.www", user2));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("Riverside", "www.wow.www", user));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("Puscifer", "www.wow.www", user2));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("Slipknot", "www.wow.www", user));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("Katatonia", "www.wow.www", user));
        postRepository.save(new Post("lastPost", "www.wow.www", user2));
    }
}