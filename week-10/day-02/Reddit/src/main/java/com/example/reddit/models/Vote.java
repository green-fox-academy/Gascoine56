package com.example.reddit.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int voteValue;

    @ManyToOne
    private User user;

    @ManyToOne
    private Post post;

    public Vote(int voteValue, User user, Post post) {
        this.voteValue = voteValue;
        this.user = user;
        this.post = post;
    }
}