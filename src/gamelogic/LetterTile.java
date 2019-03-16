package programlogic;

public class LetterTile {//Class that will be used as a game tile, contains a string attribute with a letter, the score linked to that letter and the amount of
	private String letter;//tiles of the same kind available
	private int score;
	private int amount;
	
	public String getLetter() {
		return letter;
	}
	
	public void setLetter(String letter) {
		this.letter = letter;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public LetterTile(String letter, int score,int amount) {
		this.letter = letter;
		this.score = score;
		this.setAmount(amount);
	}

	

	
}
