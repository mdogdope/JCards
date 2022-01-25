package com.github.mdogdope.jcards;

import java.util.Vector;

public class Player {
	private Vector<Card> hand = new Vector<>();
	private String name = "";
	
	public Player(String name) {
		this.name = name;
	}
	
	public void add(Card c) {
		this.hand.add(c);
	}
	
	public Card getTop() {
		return this.hand.remove(0);
	}
	
	public Integer size() {
		return this.hand.size();
	}
	
	public String getName() {
		return this.name;
	}
	
}
