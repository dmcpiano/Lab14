package lab14;

import java.util.Scanner;

public abstract class Player {

	private String userName;
	
	public Player() {
		
	}
	
	public abstract Roshambo generateRoshambo();

	public String getName() {
		return userName;
	}

	public String setName(String name) {
		return this.userName = userName;
	}

	public Roshambo generateRoshambo(Roshambo randomer) {
		
		return null;
	}

	public String setName(Scanner scnr, String userName) {
		return null;
	}

	public Roshambo generateRashambo() {
		// TODO Auto-generated method stub
		return null;
	} 
	
}
