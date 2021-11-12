package com.example.reddit.repositories;

import com.example.reddit.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

    Vote findByUser_Id(Long userId);
    Vote findByUser_IdAndPost_Id(Long userId, Long postId);
    List<Vote> findAllByUser_Id(Long userId);
    boolean existsByPostId(Long aLong);
}
