package com.example.todosmysql;

import com.example.todosmysql.repositories.AssigneeRepository;
import com.example.todosmysql.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosMySqlApplication{

    public static void main(String[] args) {
        SpringApplication.run(TodosMySqlApplication.class, args);
    }

}