package com.application;

import com.application.models.User;
import com.application.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinderApplication implements CommandLineRunner {

    UserService service;

    public FinderApplication(UserService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(FinderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        service.save(new User("Lacika", "Kovacs"));
    }
}
