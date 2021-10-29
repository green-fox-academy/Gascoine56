package com.example.messageservices.services;

import com.example.messageservices.repositories.MessageService;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {

    @Override
    public void sendMessage(String text, String direction) {
        System.out.println("Twitter sent to" + text + "to " + direction);
    }
}
