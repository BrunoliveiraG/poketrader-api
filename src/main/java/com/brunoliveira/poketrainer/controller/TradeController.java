package com.brunoliveira.poketrainer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunoliveira.poketrainer.DTO.TradeDTO;
import com.brunoliveira.poketrainer.model.Trade;
import com.brunoliveira.poketrainer.repository.TradeRepository;
import com.brunoliveira.poketrainer.service.TradeService;

@CrossOrigin
@RestController
@RequestMapping("/trades")
public class TradeController {
	
	@Autowired
	private TradeService tradeService; 
	
	@GetMapping
	public List<Trade> listTrades(){
		return tradeService.findAllTrades();
	}
	
	@PostMapping
	public Trade addTrade (@RequestBody TradeDTO[] tradeDtoList) {
		
		return tradeService.addNewTrade(tradeDtoList);
	}

}
