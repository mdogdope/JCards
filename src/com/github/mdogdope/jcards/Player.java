package com.github.mdogdope.jcards;

import java.util.Vector;

/** Represents a player.
 * @author Mike Heston
 * @version 1.0
 * @since 1.0
 */

public class Player {
	private Vector<Card> hand = new Vector<>();
	private String name = "";
	
	/**
	 * Creates a player with a given name.
	 * @param name The players name.
	 */
	public Player(String name) {
		this.name = name;
	}
	
	/**
	 * Adds a Card to the players hand.
	 * @param card The Card to add.
	 */
	public void add(Card card) {
		this.hand.add(card);
	}
	
	/**
	 * Take the top Card of the players hand.
	 * @return A card object.
	 */
	public Card takeTop() {
		return this.hand.remove(0);
	}
	
	/** 
	 * Take the card at the given index.
	 * @param index The index of the card.
	 * @return A Card object.
	 */
	public Card takeCard(int index) {
		return this.hand.remove(index);
	}
	
	/** 
	 * Gets a copy of the players hand.
	 * @return A Card Vector of the Players hand.
	 */
	public Vector<Card> getHand() {
		return this.hand;
	}
	
	/** 
	 * Get the number of cards in Player's hand.
	 * @return An Integer count of the cards in Player's hand.
	 */
	public Integer size() {
		return this.hand.size();
	}
	
	/** 
	 * Gets the name of the Player object.
	 * @return A string representation of the Player's name.
	 */
	public String getName() {
		return this.name;
	}
	
	/** 
	 * Returns true is Player's hand is empty.
	 * @return A boolean denoting if hand is empty.
	 */
	public boolean isEmpty() {
		return this.hand.isEmpty();
	}
	
}
