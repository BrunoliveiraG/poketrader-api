package com.brunoliveira.poketrainer.DTO;

import java.util.List;

import com.brunoliveira.poketrainer.model.Pokemon;

public class TradeDTO {
	
	private String tradeName;
	private Pokemon[] pokemonList;
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public Pokemon[] getPokemonList() {
		return pokemonList;
	}
	public void setPokemonList(Pokemon[] pokemonList) {
		this.pokemonList = pokemonList;
	}
	
	

}
