package com.example.messageservices.repositories;

import org.springframework.stereotype.Service;

@Service
public interface MessageService {

    public void sendMessage(String text, String direction);

}
