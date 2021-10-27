package com.example.pokemon.repositories;

import com.example.pokemon.models.Pokemon;
import com.example.pokemon.models.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface PokemonRepository {

    List <Pokemon> findAll();

    void save (Pokemon pokemon);

    void deleteById (String id);

    Pokemon findById(String id);
}
