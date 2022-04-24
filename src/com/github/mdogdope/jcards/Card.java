package com.github.mdogdope.jcards;

public class Card {
//	1-4 {1:"Spades", 2:"Diamonds", 3:"Clubs", 4:"Hearts"}
	private int suit = 0;
	
//	1-13 {1:"Ace", 2:"2", ..., 10:"10", 11:"Jack", 12:"Queen", 13:"King"}
	private int value = 0;
	
	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	public int suit() {
		return this.suit;
	}
	
	public int value() {
		return this.value;
	}
	
	public boolean isSpade() {
		if(this.suit == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isDiamond() {
		if(this.suit == 2) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isClub() {
		if(this.suit == 3) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isHeart() {
		if(this.suit == 4) {
			return true;
		}else {
			return false;
		}
	}
}
