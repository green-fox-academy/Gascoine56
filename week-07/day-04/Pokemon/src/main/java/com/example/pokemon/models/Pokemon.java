package com.example.pokemon.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {

    private String id;
    private String name;
    private Type type;
    private int hp;

    public Pokemon(String name, Type type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.id = UUID.randomUUID().toString();
    }
}
