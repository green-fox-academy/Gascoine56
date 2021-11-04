package com.example.todosmysql.services;

import com.example.todosmysql.models.Todo;
import com.example.todosmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class TodoService {

    TodoRepository todorepository;

    @Autowired
    public TodoService(TodoRepository todorepository) {
        this.todorepository = todorepository;
    }

    public List<Todo> getAll() {
        return todorepository.findAll();
    }

    public List<Todo> getAllByDone(boolean done) {
        return todorepository.findAllByDone(done);
    }

    public void addTodo(Todo todo) {
        todorepository.save(todo);
    }

    public void deleteById(Long id) {
        todorepository.deleteById(id);
    }

    public Todo findById(Long id) {
        return todorepository.findById(id).get();
    }

    public List<Todo> findByQuery(String query) {
        return todorepository.findAll().stream()
                .filter(x -> x.getTitle().toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT)) || x.getDescription().toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT)) || x.getAssignee().getName().toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }

    public List<Todo> findByDate(String query) {
        return todorepository.findAll().stream().filter(x -> x.getDueDate().contains(query) || x.getCreationDate().toString().contains(query)).collect(Collectors.toList());
    }
}