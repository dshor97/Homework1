package hw1;

import java.util.Scanner;

public class MainDriver {
	public static void main(String[] args){
		Deck p1= new Deck();
		Deck p2 =new Deck();
		int score1=0,score2=0;
		Card c1,c2;
		Scanner reader = new Scanner(System.in);
		System.out.println("Would you like to play war or peace?");
		String x = new String(reader.next());
		if(x.equals("war")){
			for(int i=0;i<52;i++){
				c1=p1.draw();
				c2=p2.draw();
				System.out.println("Turn "+(i+1));
				System.out.println("P1 has the "+c1.toString()+" P2 has the "+c2.toString() );
				if(c1.winner(c2))
					score1++;
				else
					score2++;
			}
		}
		if(x.equals("peace")){
			for(int i=0;i<52;i++){
				c1=p1.draw();
				c2=p2.draw();
				System.out.println("Turn "+(i+1));
				System.out.println("P1 has the "+c1.toString()+" P2 has the "+c2.toString() );
				if(!c1.winner(c2))
					score1++;
				else
					score2++;
			}
		}
		System.out.println("P1: "+ score1+" P2: "+score2 );
		if(score1>score2)
			System.out.println("Player 1 wins.");
		else if(score1<score2)
			System.out.println("Player 2 wins.");
		if(score1==score2)
			System.out.println("We have a tie.");
	}
	
}
