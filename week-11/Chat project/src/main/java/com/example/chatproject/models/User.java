package com.example.chatproject.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String login;
    private String userName;
    private String password;
    private String avatarUrl;

    @OneToMany
    List<Message> messages = new ArrayList<>();

    @OneToOne
    Channel channel;

    public User(String login, String password) {
        this.login = login;
        this.userName = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
