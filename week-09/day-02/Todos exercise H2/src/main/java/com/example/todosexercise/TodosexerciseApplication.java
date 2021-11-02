package com.example.todosexercise;

import com.example.todosexercise.models.Todo;
import com.example.todosexercise.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosexerciseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TodosexerciseApplication.class, args);
    }

    TodoRepository repository;

    public TodosexerciseApplication(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Todo("Take out the trash"));
        repository.save(new Todo("Eat lunch"));
        repository.save(new Todo("Play games"));
        repository.save(new Todo("Finish project"));
        repository.save(new Todo("Drive a car"));
        repository.save(new Todo("Pay the bills"));
        repository.save(new Todo("Buy groceries"));
    }
}