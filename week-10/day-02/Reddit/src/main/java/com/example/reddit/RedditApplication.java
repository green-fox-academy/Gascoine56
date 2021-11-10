package com.example.reddit;

import com.example.reddit.models.Post;
import com.example.reddit.repositories.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    PostRepository postRepository;

    public RedditApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      /*  postRepository.save(new Post("Description", "www.www.www"));
        postRepository.save(new Post("Text", "url.www.www"));
        postRepository.save(new Post("Katatonia", "www.wow.www"));*/
    }
}