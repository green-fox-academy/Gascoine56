package com.example.programmerfoxclub;

import com.example.programmerfoxclub.controllers.MainController;
import com.example.programmerfoxclub.models.Fox;
import com.example.programmerfoxclub.services.FoxServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgrammerFoxClubApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProgrammerFoxClubApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}