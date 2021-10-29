package com.example.programmerfoxclub.models;

import com.example.programmerfoxclub.repositories.DRINKS;
import com.example.programmerfoxclub.repositories.FOOD;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    String name;
    List<String> tricks = new ArrayList<>();
    FOOD food = FOOD.PhoBo;
    DRINKS drink = DRINKS.Beer;

    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
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