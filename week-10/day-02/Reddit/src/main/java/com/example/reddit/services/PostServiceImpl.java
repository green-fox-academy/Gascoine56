package com.example.reddit.services;

import com.example.reddit.models.Post;
import com.example.reddit.repositories.PostRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Getter
@Setter
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    private int page = 1;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> get() {
        return this.postRepository.findAll();
    }

    @Override
    public List<Post> sortedList() {
        return postRepository.findAll().stream().sorted(Comparator.comparing(Post::getVotes).reversed()).collect(Collectors.toList());
    }

    @Override
    public void addPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public void upvote(Long id) {
        Post post = postRepository.findById(id).get();
        post.upvote();
        postRepository.save(post);
    }

    @Override
    public void downvote(Long id) {
        Post post = postRepository.findById(id).get();
        post.downvote();
        postRepository.save(post);
    }

    @Override
    public List<Post> getSortedPage() {
        if (page * 10 <= sortedList().size())
            return sortedList().subList((page - 1) * 10, page * 10);
        else
            return sortedList().subList((page - 2) * 10, sortedList().size());
    }

    @Override
    public void nextPage() {
        this.page += 1;
    }

    @Override
    public void previousPage() {
        this.page -= 1;
    }

    public int getPage() {
        return page;
    }
}