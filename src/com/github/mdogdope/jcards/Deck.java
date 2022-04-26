package com.github.mdogdope.jcards;

import java.util.Random;
import java.util.Vector;
/**
 * Represents a deck of cards and provides methods to manipulate the deck.
 * @author Mike Heston
 * @version 1.0
 * @since 1.0
 */
public class Deck {
	
	private Vector<Card> deck = new Vector<>();
	
	/**
	 * Creates a new Deck object with one set of 52 cards.
	 */
	public Deck() {
		for(int si = 1; si <= 4; si++) {
			for(int vi = 1; vi <= 13; vi++) {
				this.deck.add(new Card(si, vi));
			}
		}
	}
	/**
	 * Creates a new Deck object with multiple sets of 52 cards.
	 * @param deckCount The amount of deck in this object.
	 */
	public Deck(int deckCount) {
		for(int i = 0; i < deckCount; i++) {
			for(int si = 1; si <= 4; si++) {
				for(int vi = 1; vi <= 13; vi++) {
					this.deck.add(new Card(si, vi));
				}
			}
		}
	}
	
	/**
	 * Shuffles all the cards in the deck, with time set as seed.
	 */
	public void shuffle() {
		Vector<Card> sDeck = new Vector<>();
		
		Random rand = new Random();
		
		while(!this.deck.isEmpty()) {
			int index = rand.nextInt(this.deck.size());
			
			sDeck.add(this.deck.remove(index));
		}
	}
	
	/**
	 * Shuffles all the cards using a randomizer seeded with given seed
	 * @param seed The seed to use in the randomizer.
	 */
	public void shuffle(int seed) {
		Vector<Card> sDeck = new Vector<>();
		
		Random rand = new Random(seed);
		
		while(!this.deck.isEmpty()) {
			int index = rand.nextInt(this.deck.size());
			
			sDeck.add(this.deck.remove(index));
		}
	}
	
	/**
	 * Adds a Card object to the bottom of the deck.
	 * @param card The Card object to add.
	 */
	public void add(Card card) {
		this.deck.add(card);
	}
	
	/**
	 * Takes the top Card from the deck.
	 * @return The Card object that was on top.
	 */
	public Card deal() {
		return this.deck.remove(0);
	}
	
	/**
	 * Deals the card at a given index.
	 * @param index The location of the card object.
	 * @return The card at the given index.
	 */
	public Card deal(int index) {
		return this.deck.remove(index);
	}
	
	/**
	 * Returns an integer denoting the amount of cards in the deck.
	 * @return The number of cards left.
	 */
	public Integer size() {
		return this.deck.size();
	}
	
	/**
	 * Returns true if deck has no cards in it.
	 * @return A boolean.
	 */
	public boolean isEmpty() {
		return this.deck.isEmpty();
	}
	
	/**
	 * Search for a specific card.
	 * @param suit The suit of card to find.
	 * @param value The value of the card to find.
	 * @return The index of the card or -1 if not found.
	 */
	public Integer search(int suit, int value) {
		Card search = new Card(suit, value);
		return this.deck.indexOf(search);
	}
	
}
