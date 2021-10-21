package com.example.pokemon.controllers;

import com.example.pokemon.models.Pokemon;
import com.example.pokemon.models.Type;
import com.example.pokemon.services.PokemonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(){
        this.pokemonService = new PokemonService();
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("pokemonList", pokemonService.getAll());
        return "index";
    }

    @GetMapping("/add-pokemon")
    public String renderAddPokemon(Model model){
        model.addAttribute("types", Type.values());
        return "add";
    }
    @PostMapping("/add-pokemon")
    public String addPokemon(@ModelAttribute Pokemon pokemon){
        pokemonService.catchPokemon(pokemon);
        return "redirect:/";
    }
    @PostMapping("/remove/{id}")
    public String removePokemon(@PathVariable String id){
        pokemonService.removeById(id);
        return "redirect:/";
    }
}
