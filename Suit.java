package hw1;

public enum Suit {
	Clubs,Diamonds,Hearts,Spades;
	
	public static Suit[] names(){
		Suit[] suits = values();
		return suits;
	}
}
