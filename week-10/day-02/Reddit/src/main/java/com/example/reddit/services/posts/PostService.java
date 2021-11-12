package com.example.reddit.services.posts;

import com.example.reddit.models.Post;

import java.util.List;

public interface PostService {

    List<Post> get();
    Post getById(Long postId);
    List<Post> sortedList();
    void addPost(Post post);
    void upvote (Long id);
    void downvote (Long id);
    List<Post> getSortedPage();
    void nextPage();
    void previousPage();
    public int getPage();

}