package com.example.messageservices.services;

import com.example.messageservices.repositories.MessageService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {


    public EmailService() {
    }

    @Override
    public void processMessage(String text, String direction) {
    }
}
