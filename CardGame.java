import java.util.ArrayList;
import java.util.Arrays;

public class CardGame extends PartyGame{
	
	ArrayList<Card> deck = new ArrayList<Card>(52);
	
	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
	Card card;
	
	public void assembleDeck(){ //makes a deck of 52 cards
		for(int suitsInd = 0; suitsInd < suits.length; suitsInd++){
			for(int ranksInd = 0; ranksInd < ranks.length; ranksInd++){
				card = new Card(ranks[ranksInd], suits[suitsInd]);
				deck.add(card);
			}
		}
	}
	
	
	
	
}
