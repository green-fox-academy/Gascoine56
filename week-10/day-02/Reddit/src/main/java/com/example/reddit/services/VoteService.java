package com.example.reddit.services;

import com.example.reddit.models.Vote;

import java.util.List;

public interface VoteService {
    boolean checkVoteByUserId(Long id);

    boolean checkVoteByPostId(Long postId);

    int checkUserVoteValueById(Long id);

    int findVoteByUserIdAndPostId(Long userId, Long postId);

    Vote getActualVoteByUserIdAndPostId(Long userId, Long postId);

    void addVote(Vote vote);

    List<Vote> getAllByUser_Id(Long userId);

    Vote findByPostId(Long postId);

    Integer sumVotesbyPostId(Long id);
}