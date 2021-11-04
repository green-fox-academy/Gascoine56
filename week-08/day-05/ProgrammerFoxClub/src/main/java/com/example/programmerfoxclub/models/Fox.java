package com.example.programmerfoxclub.models;

import com.example.programmerfoxclub.enums.DRINKS;
import com.example.programmerfoxclub.enums.FOOD;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Enumerated
    private FOOD food = FOOD.PhoBo;
    @Enumerated
    private DRINKS drink = DRINKS.Beer;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "fox_tricks", joinColumns = @JoinColumn(name = "fox_id"), inverseJoinColumns = @JoinColumn(name = "trick_id"))
    private List<Trick> tricks = new ArrayList<>();

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Action> actions = new ArrayList<>();

    public Fox(String name, FOOD food, DRINKS drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
    }

    public Fox() {
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Trick> getTricks() {
        return tricks;
    }

    public void setTricks(List<Trick> tricks) {
        this.tricks = tricks;
    }

    public Fox(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
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


    public FOOD getFood() {
        return food;
    }

    public void setFood(FOOD food) {
        this.food = food;
    }

    public DRINKS getDrink() {
        return drink;
    }

    public void setDrink(DRINKS drink) {
        this.drink = drink;
    }
}