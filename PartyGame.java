import java.util.ArrayList;

public abstract class PartyGame {
	
	protected int numOfPlayers;
	
	ArrayList<Player> players;
	
	void addPlayers(int amount){
		for(int i = 0; i < amount; i++){
			players.add(new Player());
		}
	}
	
	
	void runGame(){
		
	}
}
