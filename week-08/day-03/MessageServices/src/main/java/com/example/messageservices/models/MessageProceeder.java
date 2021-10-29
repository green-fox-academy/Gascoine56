package com.example.messageservices.models;

import com.example.messageservices.configuration.MessageConfiguration;
import org.springframework.stereotype.Service;

@Service
public class MessageProceeder{

    MessageConfiguration config;

    public MessageProceeder(MessageConfiguration config){
        this.config = config;
    }

    public MessageConfiguration getConfig() {
        return config;
    }

    public void setConfig(MessageConfiguration config) {
        this.config = config;
    }

    public void processMessage(String s, String s1) {
    }
}
