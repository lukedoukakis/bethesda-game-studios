import java.util.Scanner;
import java.util.Random;

public class War extends CardGame{
	
	int p1Score;
	int p2Score;
	
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
		
		String user; //user's input for this class
		
		System.out.println("Welcome to War. This is a two player game where the deck will be split up between each player. Each round, the players will play the card on at the top of their hand, and the player with the higher value card will take both cards. The player with the most cards at the end wins!");
		
		System.out.println("Player 1, what is your name?");
		players.get(0).setName(s.nextLine());
		
		System.out.println("Player 2, what is your name?");
		players.get(1).setName(s.nextLine());
		
		for(int i = 0; i < 26; i++){
			if(Integer.parseInt(players.get(0).hand.get(i).value) > Integer.parseInt(players.get(1).hand.get(i).value)){
				p1Score+=2;
				System.out.println(players.get(0).getName() + " wins the round. His/her card, a "+ players.get(0).hand.get(i).toString()+ " beat "+ players.get(1).getName() +"'s "+ players.get(1).hand.get(i).toString() + ".");
			}
			else{
				p2Score+=2;
				System.out.println(players.get(1).getName() + " wins the round. His/her card, a "+ players.get(1).hand.get(i).toString()+ " beat "+ players.get(0).getName() +"'s "+ players.get(0).hand.get(i).toString() + ".");
			}
			System.out.println("Press any key to move to the next round.");
			user = s.nextLine();
			
		}
		System.out.println("Game over!");
		if(p1Score > p2Score){
			System.out.println(players.get(0).getName() + " wins with a score of " + p1Score + ".");
		}else{
			System.out.println(players.get(1).getName() + " wins with a score of " + p2Score + ".");
		}
		
	
		
		
	}
}
