package com.example.messageservices.models;

import com.example.messageservices.configuration.MessageConfiguration;
import com.example.messageservices.repositories.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageProceeder {

    private final List<MessageService> messageServices;

    @Autowired
    public MessageProceeder(List<MessageService> messageServices) {
        this.messageServices = messageServices;
    }

    public void processMessage(String x, String y) {
        for (MessageService msg : messageServices) {
            msg.sendMessage(x, y);
        }
    }
}
