package com.brunoliveira.poketrainer.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Trade {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "exp_difference")
	private Integer expDifference;
	
	@Column(name = "verdict")
	private String verdict;
	
	@Column(name= "first_list")
	private String firstList;
	
	@Column(name= "second_list")
	private String secondList;
	
	@Column(name = "user_name")
	private String userName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getExpDifference() {
		return expDifference;
	}

	public void setExpDifference(Integer expDifference) {
		this.expDifference = expDifference;
	}

	public String getVerdict() {
		return verdict;
	}

	public void setVerdict(String verdict) {
		this.verdict = verdict;
	}

	public String getFirstList() {
		return firstList;
	}

	public void setFirstList(String firstList) {
		this.firstList = firstList;
	}

	public String getSecondList() {
		return secondList;
	}

	public void setSecondList(String secondList) {
		this.secondList = secondList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trade other = (Trade) obj;
		return Objects.equals(id, other.id);
	}
	

	
	
	
}
