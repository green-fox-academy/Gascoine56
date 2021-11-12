package com.example.reddit.services;

import com.example.reddit.models.User;
import com.example.reddit.models.Vote;
import com.example.reddit.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class VoteServiceImpl implements VoteService{
    VoteRepository voteRepository;

    @Autowired
    public VoteServiceImpl(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @Override
    public boolean checkVoteByUserId(Long id) {
        return voteRepository.findAll().stream().anyMatch(x-> Objects.equals(x.getUser().getId(), id));
    }

    @Override
    public boolean checkVoteByPostId(Long postId) {
        return voteRepository.existsByPostId(postId);
    }

    @Override
    public int checkUserVoteValueById(Long id) {
        return voteRepository.findByUser_Id(id).getVoteValue();
    }

    @Override
    public Vote findVoteByUserIdAndPostId(Long userId, Long postId) {
        return voteRepository.findByUser_IdAndPost_Id(userId, postId);
    }

    public void addVote(Vote vote){
        voteRepository.save(vote);
    }

    public List<Vote> getAllByUser_Id(Long userId){
        return voteRepository.findAllByUser_Id(userId);
    }

    @Override
    public Vote findByPostId(Long postId, List<Vote> list) {
        return list.stream().filter(x -> x.getPost().getId() == postId).findFirst().get();
    }

}
