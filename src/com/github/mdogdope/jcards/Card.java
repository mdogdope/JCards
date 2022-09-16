package com.github.mdogdope.jcards;
/** Represents a card.
 * @author Mike Heston
 * @version 1.0
 * @since 1.0
 */
public class Card {
//	1-4 {1:"Spades", 2:"Diamonds", 3:"Clubs", 4:"Hearts"}
	private Integer suit = 0;
	
//	1-13 {1:"Ace", 2:"2", ..., 10:"10", 11:"Jack", 12:"Queen", 13:"King"}
	private Integer value = 0;
	
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
	public int getSuit() {
		return this.suit;
	}
	
	/**
	 * Gets the suit of the Card represented by a string.
	 * @return A string representing the suit.
	 */
	public String getSuitString() {
		String ret = "0";
		switch(this.suit) {
		case 1:
			ret = "spade";
		case 2:
			ret = "diamond";
		case 3:
			ret = "club";
		case 4:
			ret = "heart";
		}
		return ret;
	}
	
	/**
	 * Gets the suit of the Card represented by a character.
	 * @return A character representing the suit.
	 */
	public Character getSuitChar() {
		char ret = '0';
		switch(this.suit) {
		case 1:
			ret = 's';
			break;
		case 2:
			ret = 'd';
			break;
		case 3:
			ret = 'c';
			break;
		case 4:
			ret = 'h';
			break;
		}
		return ret;
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
	public int getValue() {
		return this.value;
	}
	
	/**
	 * Gets the value of the Card represented by a string.
	 * @return A string representing the value.
	 */
	public String getValueString() {
		String ret = "0";
		switch(this.value) {
		case 1:
			ret = "ace";
			break;
		case 11:
			ret = "jack";
			break;
		case 12:
			ret = "queen";
			break;
		case 13:
			ret = "king";
			break;
		default:
			ret = this.value.toString();
		}
		return ret;
	}
	
	/**
	 * Gets the value of the Card represented by a character.
	 * @return A character representing the value.
	 */
	public Character getValueChar() {
		Character ret = '-';
		switch(this.value) {
		case 1:
			ret = 'a';
			break;
		case 2:
			ret = '2';
			break;
		case 3:
			ret = '3';
			break;
		case 4:
			ret = '4';
			break;
		case 5:
			ret = '5';
			break;
		case 6:
			ret = '6';
			break;
		case 7:
			ret = '7';
			break;
		case 8:
			ret = '8';
			break;
		case 9:
			ret = '9';
			break;
		case 10:
			ret = '0';
			break;
		case 11:
			ret = 'j';
			break;
		case 12:
			ret = 'q';
			break;
		case 13:
			ret = 'k';
			break;
		}
		return ret;
	}
}
	