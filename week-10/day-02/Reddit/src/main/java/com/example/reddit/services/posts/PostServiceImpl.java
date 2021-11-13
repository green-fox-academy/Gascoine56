package com.example.reddit.services.posts;

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
    public Post getById(Long postId) {
        return postRepository.getById(postId);
    }

    @Override
    public List<Post> sortedList() {
        //generates sorted list of posts
        return postRepository.findAll().stream().sorted(Comparator.comparing(Post::getVotes).reversed()).collect(Collectors.toList());
    }

    @Override
    public List<Post> getSortedPage() {
        //check if first page list is smaller than 10 to prevent out of bound index
        if (sortedList().size() < 10) {
            return sortedList();
        }
        // regular page list
        else if (page * 10 < sortedList().size())
            return sortedList().subList((page - 1) * 10, page * 10);
            //fix last page out of bound
        else
            return sortedList().subList((page - 1) * 10, sortedList().size());
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