package com.example.todosmysql.services;

import com.example.todosmysql.models.Assignee;
import com.example.todosmysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeService {

    private AssigneeRepository assigneeRepository;

    public AssigneeService() {
    }

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public List<Assignee> getAll() {
        return assigneeRepository.findAll();
    }

    public Assignee getById(Long id) {
        return assigneeRepository.findById(id).get();
    }

    public void addAssignee(Assignee ass) {
        assigneeRepository.save(ass);
    }

    public void removeById(Long id) {
        assigneeRepository.deleteById(id);
    }

    public AssigneeRepository getAssigneeRepository() {
        return assigneeRepository;
    }

    public void setAssigneeRepository(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }
}