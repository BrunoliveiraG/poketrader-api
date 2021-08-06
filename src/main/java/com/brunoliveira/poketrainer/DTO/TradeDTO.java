package com.brunoliveira.poketrainer.DTO;

import java.util.List;

import com.brunoliveira.poketrainer.model.Pokemon;

public class TradeDTO {
	
	private String userName;
	private Pokemon[] pokemonList;

	public Pokemon[] getPokemonList() {
		return pokemonList;
	}
	public void setPokemonList(Pokemon[] pokemonList) {
		this.pokemonList = pokemonList;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
