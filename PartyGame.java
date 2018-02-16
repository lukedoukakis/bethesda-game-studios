import java.util.ArrayList;

public abstract class PartyGame {
	
	protected int numOfPlayers;
	
	ArrayList<Player> players; //games will cycle through this list for players' turns?
	
	void addPlayers(int amount){ //adds players to players ArrayList
		for(int i = 0; i < amount; i++){
			players.add(new Player());
		}
	}
	
	
	void runGame(){
		
	}
}
