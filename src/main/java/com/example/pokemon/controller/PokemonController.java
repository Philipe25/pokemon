package com.example.pokemon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PokemonController {
    
     private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    // Endpoint para buscar todos os pokemons
    @GetMapping("/api/pokemon")
    public List<Pokemon> getAllPokemons() {
        return pokemonService.getAllPokemons();
    }

    // Endpoint para buscar um pokemon específico pelo ID
    @GetMapping("/api/pokemon/{id}")
    public Pokemon getPokemonById(@PathVariable int id) {
        return pokemonService.getPokemonById(id);
    }
}
