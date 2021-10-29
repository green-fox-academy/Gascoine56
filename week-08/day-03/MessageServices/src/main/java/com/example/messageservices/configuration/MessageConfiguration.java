package com.example.messageservices.configuration;

import com.example.messageservices.repositories.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageConfiguration{

    MessageService service;
    @Autowired
    public MessageConfiguration(MessageService service) {
        this.service = service;
    }

    public void processMessage(String text, String direction) {

    }
}
