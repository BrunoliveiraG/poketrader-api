package com.brunoliveira.poketrainer.service;

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
		
		int totalExperience1 = 0;
		int totalExperience2 = 0;
		int totalExperience = 0;
		
		
		Pokemon[] pokeList1 = tradeDtoList[0].getPokemonList();
		Pokemon[] pokeList2 = tradeDtoList[1].getPokemonList();
		
		for (Pokemon pokemon : pokeList1) {
			
			totalExperience1 += pokemon.getExperience();
		}
		
		for (Pokemon pokemon : pokeList2) {
			
			totalExperience2 += pokemon.getExperience();
		}
		
		totalExperience = Math.abs(totalExperience1 - totalExperience2);
		if(totalExperience > 100) {
			trade.setVerdict("Bad Trade!");
		}
		else {
			trade.setVerdict("Good Trade!");
		}
		trade.setExpDifference(totalExperience);
		
		return tradeRepository.save(trade);
	}

	
	
}
