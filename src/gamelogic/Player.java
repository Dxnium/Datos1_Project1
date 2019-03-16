package programlogic;

public class Player {//The player class has key attributes for game logic, such as the name of the player (graphical identifier), an array dock which will serve 
							//as storage for the tiles that belong to the player, and the player score.
	
	private String name;
	private  LetterTile[] dock = new LetterTile[7];
	int score;
	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LetterTile[] getDock() {
		return dock;
	}
	
	public Player(String name) {
		this.name = name;
	}

	

}
