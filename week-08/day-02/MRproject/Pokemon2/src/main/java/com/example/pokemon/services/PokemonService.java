package com.example.pokemon.services;

import com.example.pokemon.models.Pokemon;
import com.example.pokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    private PokemonRepository pokemonRepository;

    @Autowired
    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> getAll(){
        return pokemonRepository.findAll();
    }

    public void catchPokemon(Pokemon pokemon){
        pokemonRepository.save(pokemon);
    }

    public void removeById(String id){
        pokemonRepository.deleteById(id);
    }

    public Pokemon getById(String id) throws Exception {
       Optional<Pokemon> optionalPokemon = Optional.ofNullable(pokemonRepository.findById(id));

       if (optionalPokemon.isPresent()) {
           return optionalPokemon.get();
       }
       throw new Exception("Pokemon not found");
    }
}
