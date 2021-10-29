package com.example.messageservices.services;

import com.example.messageservices.repositories.MessageService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TwitterService implements MessageService {

    private String type = "Email";

    public TwitterService() {
    }

    @Override
    public void processMessage(String text, String direction) {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
