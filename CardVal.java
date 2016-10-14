package hw1;

public enum CardVal {
	Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King,Ace;
	
	public static CardVal[] names(){
		CardVal[] cardVals = values();
		return cardVals;
	}
}
