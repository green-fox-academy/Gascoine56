package com.example.programmerfoxclub.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Trick {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Trick() {
    }

    public Trick(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "tricks", cascade = CascadeType.PERSIST)
    private List<Fox> foxes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void setFoxes(List<Fox> foxes) {
        this.foxes = foxes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}