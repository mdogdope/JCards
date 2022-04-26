package com.github.mdogdope.jcards;
/** Represents a card.
 * @author Mike Heston
 * @version 1.0
 * @since 1.0
 */
public class Card {
//	1-4 {1:"Spades", 2:"Diamonds", 3:"Clubs", 4:"Hearts"}
	private int suit = 0;
	
//	1-13 {1:"Ace", 2:"2", ..., 10:"10", 11:"Jack", 12:"Queen", 13:"King"}
	private int value = 0;
	
	/**
	 * Creates a Card object with given suit and value.
	 * @param suit The suit of the card.
	 * @param value The value of the card.
	 */
	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	/**
	 * Gets the suit of the Card represented by a number 1-4.
	 * - 1 = Spades
	 * - 2 = Diamonds
	 * - 3 = Clubs
	 * - 4 = Hearts
	 * @return A number representing the suit.
	 */
	public int suit() {
		return this.suit;
	}
	
	/**
	 * Gets the value of the Card represented by a number 1-13.
	 * - 1 = Ace
	 * - 2-10 = Number card
	 * - 11 = Jack
	 * - 12 = Queen
	 * - 13 = King
	 * @return A number representing the value.
	 */
	public int value() {
		return this.value;
	}
	
//	public boolean isSpade() {
//		if(this.suit == 1) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
//	public boolean isDiamond() {
//		if(this.suit == 2) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
//	public boolean isClub() {
//		if(this.suit == 3) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
//	public boolean isHeart() {
//		if(this.suit == 4) {
//			return true;
//		}else {
//			return false;
//		}
//	}
}
