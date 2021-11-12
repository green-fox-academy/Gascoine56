package com.example.reddit.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Post{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int votes;
    private String text;
    private String url;
    private Date date;

    @ManyToOne
    private User user;


    public Post(String text, String url, User user) {
        this.text = text;
        this.url = url;
        this.date = new Date();
        this.user = user;
    }

    public void upvote(){
        this.votes += 1;
    }

    public void downvote(){
        this.votes += -1;
    }

}
