package com.example.messageservices;

import com.example.messageservices.models.MessageProceeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageServicesApplication implements CommandLineRunner {

    private MessageProceeder messageProceeder;

    @Autowired
    public MessageServicesApplication(MessageProceeder messageProceeder) {
        this.messageProceeder = messageProceeder;
    }

    public static void main(String[] args) {
        SpringApplication.run(MessageServicesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
    }
}
