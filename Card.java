
public class Card 
{
	private int type, value;
	private String[] cardType = {"Clubs", "Spades", "Diamonds", "Hearts"};
	private String[] cardValue = {"King", "Ace", "2", "3", "4",
                               		"5", "6", "7", "8", "9", "10", "Queen", "Jack"};

	public Card(int type, int value)
	{
    		this.type = type; 
    		this.value = value;
	}
	
	//returns string of a specific card
	public String toString()
	{
    		String finalCard = cardValue[value] + " of " + cardType[type];

    		return finalCard;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public int getType()
	{
		return type;
	}
	
	//finds the numeric value of a card
	public int getCardValue()
	{
		int num;
		if(value==0)
			num = 13;
		else if(value==1)
			num = 1;
		else if (value == 11)
			num = 12;
		else if(value == 12)
			num = 11;
		else
			num = value;
		
		return num;
	}		
}
