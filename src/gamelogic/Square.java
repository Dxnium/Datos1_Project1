package programlogic;

public class Square {
	
	private LetterTile letter;
	private int multiplier;
	private boolean activeFlag = false;
	
	public Square(int multiplier){
		if ( multiplier != 0) {
			this.setActiveFlag(true);
		}
		this.multiplier = multiplier;
		
	}
	
	public LetterTile getLetter() {
		return letter;
	}
	public void setLetter(LetterTile letter) {
		this.letter = letter;
	}
	public int getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}
	public boolean isActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	

}
