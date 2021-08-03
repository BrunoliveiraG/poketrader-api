package com.brunoliveira.poketrainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunoliveira.poketrainer.model.Trade;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {

}
