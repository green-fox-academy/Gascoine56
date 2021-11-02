package com.example.todosmysql;

import com.example.todosmysql.models.Todo;
import com.example.todosmysql.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosMySqlApplication implements CommandLineRunner {
    TodoRepository todoRepository;

    public TodosMySqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodosMySqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Take out the trash"));
        todoRepository.save(new Todo("Eat lunch", true));
        todoRepository.save(new Todo("Play games"));
        todoRepository.save(new Todo("Finish project", true));
        todoRepository.save(new Todo("Drive a car"));
        todoRepository.save(new Todo("Pay the bills",true));
        todoRepository.save(new Todo("Buy groceries"));
    }
}
