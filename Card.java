
public class Card {

	String suit;
	String value;
	
	public Card(String v, String s){
		suit = s;
		value = v;
	}
	
	public String toString(){
		return value + " of " + suit;
	}
}
