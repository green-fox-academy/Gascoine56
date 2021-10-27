package com.example.pokemon.repositories;

import com.example.pokemon.models.Pokemon;
import com.example.pokemon.models.Type;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PokemonRepositoryImpl implements PokemonRepository {

    private List<Pokemon> pokemonList = new ArrayList<>(Arrays.asList
            ((new Pokemon("Magicarp", Type.WATER, 50)),
                    (new Pokemon("Snorlax", Type.NORMAL, 150)),
                    (new Pokemon("Pikachu", Type.ELECTRIC, 30)),
                    (new Pokemon("JigglyPuff", Type.PSYCH, 60))));
    @Override
    public List<Pokemon> findAll() {
        return pokemonList;
    }

    @Override
    public void save(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    @Override
    public void deleteById(String id) {
        pokemonList.removeIf(pokemon -> pokemon.getId().equals(id));
    }

    @Override
    public Pokemon findById(String id) {
        return null;
    }
}
