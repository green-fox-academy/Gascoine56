package com.example.reddit.services;

import com.example.reddit.models.Vote;
import com.example.reddit.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class VoteServiceImpl implements VoteService {
    VoteRepository voteRepository;

    @Autowired
    public VoteServiceImpl(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @Override
    public boolean checkVoteByUserId(Long id) {
        return voteRepository.findAll().stream().anyMatch(x -> Objects.equals(x.getUser().getId(), id));
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
    public int findVoteByUserIdAndPostId(Long userId, Long postId) {
        Optional<Vote> vote = voteRepository.findByUser_IdAndPost_Id(userId, postId);
        if (vote.isPresent()) {
            return vote.get().getVoteValue();
        } else return 0;
    }

    @Override
    public Vote getActualVoteByUserIdAndPostId(Long userId, Long postId) {
        Optional<Vote> vote = voteRepository.findByUser_IdAndPost_Id(userId, postId);
        if (vote.isPresent())
            return vote.get();
        else return null;
    }

    public void addVote(Vote vote) {
        voteRepository.save(vote);
    }

    public List<Vote> getAllByUser_Id(Long userId) {
        return voteRepository.findAllByUser_Id(userId);
    }

    @Override
    public Vote findByPostId(Long postId) {
        return voteRepository.findAll().stream().filter(x -> Objects.equals(x.getPost().getId(), postId)).findFirst().get();
    }

    @Override
    public Integer sumVotesbyPostId(Long id) {
        if (voteRepository.sumVotesByPost(id) == null)
            return 0;
        return voteRepository.sumVotesByPost(id);
    }

}