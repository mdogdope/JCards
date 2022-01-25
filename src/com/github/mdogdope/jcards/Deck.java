package com.github.mdogdope.jcards;

import java.util.Random;
import java.util.Vector;

public class Deck {
	private Vector<Card> deck = new Vector<>();
	
	public Deck() {
		for(int si = 1; si <= 4; si++) {
			for(int vi = 1; vi <= 13; vi++) {
				this.deck.add(new Card(si, vi));
			}
		}
	}
	
	public Deck(int deckCount) {
		for(int i = 0; i < deckCount; i++) {
			for(int si = 1; si <= 4; si++) {
				for(int vi = 1; vi <= 13; vi++) {
					this.deck.add(new Card(si, vi));
				}
			}
		}
	}
	
	public void shuffle() {
		Vector<Card> sDeck = new Vector<>();
		
		Random rand = new Random();
		
		while(!this.deck.isEmpty()) {
			int index = rand.nextInt(this.deck.size());
			
			sDeck.add(this.deck.remove(index));
		}
	}

	public void shuffle(int seed) {
		Vector<Card> sDeck = new Vector<>();
		
		Random rand = new Random(seed);
		
		while(!this.deck.isEmpty()) {
			int index = rand.nextInt(this.deck.size());
			
			sDeck.add(this.deck.remove(index));
		}
	}
	
	public Card deal() {
		return this.deck.remove(0);
	}
	
	public Integer size() {
		return this.deck.size();
	}
	
}
