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
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String channelName;

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    @OneToMany
    List<Message> messages = new ArrayList<>();

    @OneToOne
    User user;

}
