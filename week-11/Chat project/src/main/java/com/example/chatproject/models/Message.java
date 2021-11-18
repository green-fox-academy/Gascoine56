package com.example.chatproject.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private Date creationDate;

    @ManyToOne
    User user;

    public Message(String text, Date creationDate, User user) {
        this.text = text;
        this.creationDate = creationDate;
        this.user = user;
    }
}
