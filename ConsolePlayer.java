package lab14;

import java.util.Scanner;

public class ConsolePlayer extends Player {

	private static Scanner scnr = new Scanner(System.in);


	public ConsolePlayer() {
	}
	
	@Override
	public Roshambo generateRashambo() {
		System.out.println("Rock, paper, scissors? ");
		Scanner userInput = null;
		String choice = userInput .nextLine().toUpperCase();
		return validateChoice(choice, userInput);

	}

	protected Roshambo validateChoice(String choice, Scanner userInput) {

		Roshambo answer = Roshambo.ROCK;
		boolean valid = false;
		while (!valid) {
			if (choice.equals("rock")) {
				
				valid = true;
				answer = Roshambo.ROCK;
				
			} else if (choice.equals("paper")) {
				
				valid = true;
				answer =  Roshambo.PAPER;
				
			} else if (choice.equals("scissors")) {
				
				valid = true;
				answer =  Roshambo.SCISSORS;
				
			} else {
				System.out.println("Invalid choice, please try again.");
				choice = userInput.nextLine();
			}
		}
		return answer;
	}
	

	
	public Scanner generateRoshambo(String choice, Scanner userInput) {
			return null;
		}

	@Override
	public Roshambo generateRoshambo() {
		return null;
	}
	
	

}
