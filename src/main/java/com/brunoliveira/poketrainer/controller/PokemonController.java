package com.brunoliveira.poketrainer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunoliveira.poketrainer.model.Pokemon;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
	
	@GetMapping
	public Pokemon get(Pokemon pokemon) {
		return pokemon;
	}

}
