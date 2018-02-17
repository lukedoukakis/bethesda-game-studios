import java.util.Random;
import java.util.ArrayList;

public class Deck extends PartyGame
{
	private ArrayList<Card> cards;
	
	public Deck()
	{
    		cards = new ArrayList(52);

    		for(int a =0; a<=3; a++)
    		{
        		for(int b =0; b<=12;b++)
        		{
            			cards.add(new Card(a,b));
        		}
    		}
	}

	public Card drawRandomCard()
	{
    		Random generator = new Random();
    		int index = generator.nextInt(cards.size());
    		return cards.remove(index);
	}

	public String toString()
	{
    		String result = "Cards remaining in deck: " + cards;
    		return result;
	}

	//overriden method from the partygame class
	@Override
	public String getResults(int[] scoreCounter)
	{
		int largest = scoreCounter[0], index = 0;
		String str;
		boolean equalChecker = true;
		int firstScore = scoreCounter[1];

		// checks whether all scores in the  array are equal)
		for (int y = 2; y <scoreCounter.length; y++)
		{		
			if(scoreCounter[y] != firstScore)
				equalChecker = false;
		}

		if (equalChecker)
		        str = "Stalemate! All players are tied for points! Everyone loses.";
		else
		{
			for(int x = 1; x < scoreCounter.length; x++)
			{
				if (scoreCounter[x] > largest)
				{	
					largest = scoreCounter[x];
					index = x;
				}
			}

			str = "Player " + index + " wins with " + largest
		      	      + " correct guesses in a row! Congratulations!";
		}

		return str;
		
	}	     

}
