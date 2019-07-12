package lab14;

import java.util.Scanner;

public class randPlayer extends Player{

	private Roshambo randomer;
	
	@Override
	public Roshambo generateRoshambo() {
	
		
		switch (randomer) {
		
		case 1:
			randomer = Roshambo.ROCK;
			break;

		case 2: 
			randomer = Roshambo.SCISSORS;
			break;

		case 3:
			randomer = Roshambo.PAPER;
			break;
		}
		System.out.println(randomer);
	
		
	}

}
