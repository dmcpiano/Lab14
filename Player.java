package lab14;

public abstract class Player {
	
	private String name;
	
	public Player() {
		
	}
	
	public Player(String name) {
		super();
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

	public Roshambo generateRoshambo(String input) {
		return null;
	}

}