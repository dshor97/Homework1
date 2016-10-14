package hw1;

public class Card {
	CardVal val;
	Suit suit;
	public Card(CardVal val,Suit suit){
		this.val=val;
		this.suit=suit;
	}
	
	public String toString(){
		return this.val+" of "+this.suit;
	}
	public boolean winner(Card c){
		int x= this.checkVal(c);
		if(x>0)
			return true;
		else
			return false;
	}
	private int checkVal(Card c){
		int x = this.val.compareTo(c.val);
		if(x!=0)
			return x;
		else
			return this.checkSuit(c);
		
	}
	private int checkSuit(Card c){
		return this.suit.compareTo(c.suit);
	}
	
}
