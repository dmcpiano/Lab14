package lab14;

import java.util.Scanner;
import java.lang.NullPointerException;

public class RoshamboApp extends ConsolePlayer {

	private RoshamboApp playerOne;

	public RoshamboApp(String userName) {
		super();
	}

	public static void main(String[] args, Roshambo String) {
		
		boolean valid = false;
		Scanner scnr = new Scanner(System.in);
		String userName = null;
		String ans = null;
		Player playerOne = new Player();
		Player playerTwo;
		
		 System.out.println("Welcome to Roshambo!\n");
		 System.out.println("Enter your name: ");
		 userName = scnr.nextLine();
		 System.out.println("Hi " + userName + "!😃 "); 
		
			 System.out.println("\nSelect your opponent😈:   'Buttons the Bandit' 🦸 or 'Crimson Chaos' 🦸.");
			 String userChoice = scnr.nextLine();
			 Playerpick(userChoice, ans);
	}
		 public Roshambo generateRashambo() {
				System.out.println("\nRock, paper, scissors? ");
				Scanner userInput = null;
				String choice = userInput .nextLine().toUpperCase();
				return validateChoice(choice, userInput);

			}
			Roshambo playerTwoPlayer = playerTwo.generateRashambo();
			System.out.println(playerOne.getName() + ": " + p1Played);
			System.out.println(playerTwo.getName() + ": " + p2Played);
			String winner = findWinner(playerOnePlayed, playerTwoPlayer);
			System.out.println(winner);	
			
			System.out.println("Would you like to play again? y/n");
			choice = in.nextLine().toUpperCase().charAt(0);
			
		} while(choice == 'Y');
		
		System.out.println("Goodbye!");
		
		scnr.close();
		
	}
	
	public static String findWinner(Roshambo player1, Roshambo player2) {
		
		if(player1 == player2 ) {
			return "Tie!";
		}else if (player1 == Roshambo.ROCK)
		{
			if(player2 == Roshambo.SCISSORS)
			{
				return "Player 1 wins";
			}else {
				return "Player 2 wins";
			}
		}else if(player1 == Roshambo.PAPER)
		{
			if(player2 == Roshambo.ROCK)
			{
				return "Player 1 wins";
			}else {
				return "Player 2 wins";
			}
		}else {
			if(player2 == Roshambo.PAPER)
			{
				return "Player 1 wins";
			}else {
				return "Player 2 wins";
			}
		}
	}
	
	public static Roshambo getRoshambo(String userInput) {
		
		if (userInput.equals("rock"))
		{
			return Roshambo.ROCK;
		}else if(userInput.equals("paper")) {
			return Roshambo.PAPER;
		}else {
			return Roshambo.SCISSORS;
		}
		
	}

	private static void Playerpick(String userChoice, String ans) {
		if (userChoice.equalsIgnoreCase("Buttons the Bandit")) {
			ans = ("Nice choice, here we go!🦸..");
			System.out.println(ans);
		} else if (userChoice.equalsIgnoreCase("Crimson Chaos")) {
			ans = ("Nice choice, here we go! 🦸🏻‍♀️.. ");
			System.out.println(ans);
		}

	}
}
