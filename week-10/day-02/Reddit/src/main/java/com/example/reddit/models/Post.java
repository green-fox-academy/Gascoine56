package com.example.reddit.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

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

    public Post(String text, String url) {
        this.text = text;
        this.url = url;
        this.date = new Date();
    }

    public void upvote(){
        this.votes += 1;
    }

    public void downvote(){
        this.votes += -1;
    }

}
