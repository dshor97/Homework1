package hw1;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	int cardsInDeck;
	@SuppressWarnings("rawtypes")
	private ArrayList deck= new ArrayList<Card>();
	@SuppressWarnings("unchecked")
	public Deck(){
		cardsInDeck=52;
		Card card;
		CardVal[] c = CardVal.names();
		Suit[] s = Suit.names();
		for(int i=0;i<13;i++){
			for(int k=0;k<4;k++){	
				card=new Card(c[i],s[k]);
				deck.add(card);
			}
		}	
	}
	public void removeCard(Card c){
		deck.remove(c);
		cardsInDeck--;
	}	
	public Card draw(){
		Random rand= new Random();
		int x =rand.nextInt((cardsInDeck));
		Card c = (Card)deck.get(x);
		this.removeCard(c);
		return c;
	}
}	
