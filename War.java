import java.util.Scanner;
import java.util.Random;

public class War extends CardGame{
	
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	
	public void deal(){
		for(int i = 0; i < 26; i++){
			for(int j = 0; j < players.size(); j++){
				card = deck.get(r.nextInt(deck.size()));
				deck.remove(card);
				players.get(i).hand.add(card);
			}
		}
	}
	
	public void runGame(){
		
		numOfPlayers = 2;
		addPlayers(numOfPlayers);
		assembleDeck();
		deal();
		
		int user; //user's input for this class
		
		System.out.println("Welcome to War. This is a two player game.");
		//todo: take players through game
		
	
		
		
	}
}
