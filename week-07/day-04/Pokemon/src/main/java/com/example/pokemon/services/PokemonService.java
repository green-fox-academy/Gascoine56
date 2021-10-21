package com.example.pokemon.services;

import com.example.pokemon.models.Pokemon;
import com.example.pokemon.models.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PokemonService {

    private List<Pokemon> pokemonList;

    public PokemonService() {
        this.pokemonList = new ArrayList<>(Arrays.asList
                ((new Pokemon("Magicarp", Type.WATER, 50)),
                (new Pokemon("Snorlax", Type.NORMAL, 150)),
                (new Pokemon("Pikachu", Type.ELECTRIC, 30)),
                (new Pokemon("JigglyPuff", Type.PSYCH, 60))));
    }

    public List<Pokemon> getAll(){
        return pokemonList;
    }

    public void catchPokemon(Pokemon pokemon){
        pokemonList.add(pokemon);
    }

    public void removeById(String id){
        pokemonList.removeIf(pokemon -> pokemon.getId().equals(id));
    }

    public Pokemon getById(String id) throws Exception {
       Optional<Pokemon> optionalPokemon = pokemonList.stream().filter(pokemon -> pokemon.getId().equals(id)).findFirst();

       if (optionalPokemon.isPresent()) {
           return optionalPokemon.get();
       }
       throw new Exception("Pokemon not found");
    }
}
