package com.brunoliveira.poketrainer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunoliveira.poketrainer.DTO.TradeDTO;
import com.brunoliveira.poketrainer.model.Pokemon;
import com.brunoliveira.poketrainer.model.Trade;
import com.brunoliveira.poketrainer.repository.TradeRepository;

@Service
public class TradeService {
	
	@Autowired
	private TradeRepository tradeRepository;

	public List<Trade> findAllTrades() {
		
		return tradeRepository.findAll();
	}

	public Trade addNewTrade(TradeDTO[] tradeDtoList) {
		
		Trade trade =  new Trade();
		
		Pokemon[] pokeList1 = tradeDtoList[0].getPokemonList();
		Pokemon[] pokeList2 = tradeDtoList[1].getPokemonList();
		
		trade.setExpDifference(calculateExperienceDifference(getTotalExperience(pokeList1), getTotalExperience(pokeList2)));	
		trade.setFirstList(String.join(", ", getPokemonNameList(pokeList1)));
		trade.setSecondList(String.join(", ", getPokemonNameList(pokeList2)));
		trade.setUserNameOne(tradeDtoList[0].getUserName());
		trade.setUserNameTwo(tradeDtoList[1].getUserName());
		trade.setVerdict(getVerdictMessage(trade.getExpDifference()));
		
		return tradeRepository.save(trade);
	}
	
	private Integer getTotalExperience(Pokemon[] pokemonList) {
		Integer totalExperience = 0;
		for (Pokemon pokemon : pokemonList) {	
			totalExperience += pokemon.getBase_experience();
		}
		return totalExperience;
	}
	
	private Integer calculateExperienceDifference(Integer listOne, Integer listTwo) {
		return Math.abs(listOne - listTwo);
	}
	
	private List<String> getPokemonNameList(Pokemon[] pokemonList){
		List<String> pokemonNameList = new ArrayList();
		for (Pokemon pokemon: pokemonList) {
			pokemonNameList.add(pokemon.getName());
		}
		return pokemonNameList;
	}

	private String getVerdictMessage(Integer experienceDifference) {
		if(experienceDifference > 100) {
			return "Bad Trade";
		}
		else {
			return "Good Trade!";
		}
	}
	
	public List<Trade> removeAllTrades() {
		tradeRepository.deleteAll();
		return tradeRepository.findAll();
	}
	
	
}
