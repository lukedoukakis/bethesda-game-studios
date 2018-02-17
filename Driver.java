import java.util.Scanner;

public class Driver 
{

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Welcome to Team FAST's party! I am Gamebot.");
		System.out.println("I have three games for you, pick whichever fancies you and your friends!");
		System.out.println();
	
		//Update with game titles

		String gameChoice;

		do
		{
			System.out.print("Enter 'H' to play higher or lower, 'W' to play War, and 'B' to play board game: ");
			gameChoice = kb.nextLine();
		} while (!gameChoice.equalsIgnoreCase("h") && !gameChoice.equalsIgnoreCase("w") && !gameChoice.equalsIgnoreCase("b"));

		if(gameChoice.equalsIgnoreCase("h"))
		{
			HigherOrLower();
		}
		else if(gameChoice.equalsIgnoreCase("w"))
		{
			War(); //Replace if needed
		}
		else
		{
			BoardGame();
		}
	
	}

	public static void choice(int x)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What would you like to do?");
		int choiceBranch;

		
		do
		{
			System.out.print("Press 1 to play again, 2 to pick another game, or 3 to exit: ");
			choiceBranch = kb.nextInt();
		} while (choiceBranch != 1 && choiceBranch != 2 && choiceBranch != 3);

		if(choiceBranch == 1)
		{
			if(x == 1)
				HigherOrLower();
			else if(x == 2)
				War();
			else
				BoardGame();
		}
		else if(choiceBranch == 3)
			System.exit(0);
		else
		{
			String gameChoice;
                	do
                	{
                        	System.out.print("Enter 'H' to play higher or lower, 'W' to play War, and 'B' to play board game: ");
                        	gameChoice = kb.nextLine();
                	} while (!gameChoice.equalsIgnoreCase("h") && !gameChoice.equalsIgnoreCase("w") && !gameChoice.equalsIgnoreCase("b"));

                	if(gameChoice.equalsIgnoreCase("h"))
                	{
                        	HigherOrLower();
                	}
                	else if(gameChoice.equalsIgnoreCase("w"))
                	{
                        	War warGame = new War();
				warGame.runGame(); //Replace if needed
                	}
                	else
                	{
                        	BoardGame();
                	}
		}

	}
		
	public static void HigherOrLower()
	{
		Scanner kb = new Scanner(System.in);
		Card visibleCard, hiddenCard;
		Deck deck = new Deck();

    		
		System.out.println("----------------------------");
		System.out.println("Welcome to Higher or Lower!");
		System.out.println("The rules are simple. You'll be given a card and you need to guess whether the next one is higher or lower. Objective is to get longest streak you can without missing!");
		System.out.print("How many players would like to play? ");
		int numOfPlayers = kb.nextInt();
		System.out.println();

		//input validation
		if(numOfPlayers <=0)
		{
			System.out.println("Invalid player amount. Please try again: ");
			numOfPlayers = kb.nextInt();
		}

		System.out.println("Let the games begin!");
		System.out.println();

		int score; //tally for each player's score
		int[] scoreCounter = new int[numOfPlayers+1]; // array for keeping scores of each player

		for(int x = 1; x <=numOfPlayers; x++)
		{
			score = 0;
			deck = new Deck();
			System.out.println("It's Player " + x + "'s turn:");
			visibleCard = deck.drawRandomCard();

			boolean condition; //runs the do-while loop to play as long as you keep guessing right

			do
			{
				System.out.println("Your card is the " + visibleCard.toString());
				hiddenCard = deck.drawRandomCard();

				String str;
				
				//takes higher or lower input as string
				do
				{
					System.out.print("Press 'H' if you guess higher or Press 'L' if you guess lower: ");
					str = kb.nextLine();
				
						
				} while (!str.equalsIgnoreCase("h") && !str.equalsIgnoreCase("l"));

				
				//checks if the next card in the deck is higher or lower
				if (visibleCard.getCardValue() > hiddenCard.getCardValue())
				{
					if(str.equalsIgnoreCase("l"))
					{
						//replaces the visible card with the hidden card's values to start another turn
						visibleCard = new Card(hiddenCard.getType(), hiddenCard.getValue());
						score++;
						System.out.println("Correct! Points: " + score);
						condition = true;
					}
					else
					{
						System.out.println("Oops! Wrong guess! Too bad. The next card was "
								   + hiddenCard.toString() + " Final Score: " + score);
						System.out.println();
						break; //breaks the loop to start the next player's turn
					}
				}
				else
				{
					if(str.equalsIgnoreCase("h"))
					{
						visibleCard = new Card(hiddenCard.getType(), hiddenCard.getValue());
						score++;
						System.out.println("Correct! Points: " + score);
						condition = true;
					}
					else
					{
						System.out.println("Oops! Wrong guess! Too bad. The next card was " 
								   + hiddenCard.toString() + " Final Score: " + score);
						System.out.println();
						break;
					}
				}
			} while (condition = true);
			
			scoreCounter[x] = score; //stores indiviual player scores in the srray slots
		}

		System.out.println(deck.getResults(scoreCounter));
		System.out.println("-------------------------------------------------------");
		
		int x = 1; //purely for the choice method. Uses this number to recall the game when user wants to play again
		choice(x);

		

	}

	public static void War()
	{

		
		//War card game
		
		int x = 2; //play again choice method
		choice(x);
	}
	
	public static void BoardGame()
	{
		//Boardgame
		
		int x = 3; //play again choice method variable
		choice(x);
	}		
}
