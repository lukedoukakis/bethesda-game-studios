import java.util.Random;
import java.util.Scanner;

public class BoardGame
{
	public static void main (String [] args)
	{
		//creates the range for the dice
		int max = 6;
		int min = 1;
		
		System.out.println("Welcome to JavaLand!");
		for(int i = 1; i< 100; i++)
		{
			Random diceRoll = new Random();
			int result = min + diceRoll.nextInt(max);
			if ((i % 2) == 0)
			{
				System.out.println("Player 2: Enter R to roll the dice ");
				Scanner input = new Scanner(System.in);
				String roll = input.nextLine();
		
				if (roll.equalsIgnoreCase("r"))
				{
					System.out.println(result);
					System.out.println(Spaces.spaceLanded(result));
				}
			}
			else
			{
				System.out.println("Player 1: Enter R to roll the dice ");
				Scanner input = new Scanner(System.in);
				String roll = input.nextLine();
		
				if (roll.equalsIgnoreCase("r"))
				{
					System.out.println(result);
					System.out.println(Spaces.spaceLanded(result));
				}
			}
		}
		
	}
	
}
