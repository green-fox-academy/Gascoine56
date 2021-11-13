package com.example.reddit.repositories;

import com.example.reddit.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

    @Query(value = "select sum(vote_value) from vote where post_id = ?1", nativeQuery = true)
    Integer sumVotesByPost(Long postId);

    Vote findByUser_Id(Long userId);

    Optional<Vote> findByUser_IdAndPost_Id(Long userId, Long postId);

    List<Vote> findAllByUser_Id(Long userId);

    boolean existsByPostId(Long aLong);

}