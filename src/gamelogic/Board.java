package programlogic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Board {//Manages most of the g

	private Square[][] tableTop = new Square[15][15];
	private int numberOfPlayers = 0;
	private PlayerLinkedList playerList=new PlayerLinkedList();
	private LetterTile[] deck = new LetterTile[29];
	int deckSize=100;
	


	private Dictionary dictionary = new Dictionary();
	
	
	
	
	//GETTERS AND SETTERS
	public Dictionary getDictionary() {
		return dictionary;
	}
	public LetterTile[] getDeck() {
		return deck;
	}
	public Square[][] getTableTop() {
		return tableTop;
	}
	public void setTableTop(Square[][] tableTop) {
		this.tableTop = tableTop;
	}
	
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public PlayerLinkedList getPlayerList() {
		return playerList;
	}
	
	public int getDeckSize() {
		return deckSize;
	}
	
	public void setDeckSize(int deckSize) {
		this.deckSize = deckSize;
	}
	
	
	//GAME LOGIC METHODS
	
	
	
	
	public void initializeTableTop() {//reads from a .txt file on project root, parses a document that contains the board multiplier values and places them
		BufferedReader reader = null;//on a Square object thats positioned on the matrix contained in the tableTop attribute
		try {
			reader= new BufferedReader(new FileReader("TableTop.txt"));

			String line;
			int row = 0;
			while((line = reader.readLine()) != null) {
				String lineArray[] = line.split(",");
				for(int x=0; x<lineArray.length;x++) {
					this.tableTop[row][x]= new Square(Integer.parseInt(lineArray[x]));
				}
				row++;
					
				
			}
			System.out.println("Tabletop Initialized");
			
		} catch (IOException error){
			System.out.println("Error de lectura");
		} finally {
			try {
				reader.close();
			} catch (IOException closingError) {
				System.out.println("Error al crear diccionario");

			}
		}
	}
	

	public void InitializeDeck(){//this method parses the .txt file containing the valid words to use and appends one DictionaryLinkedListNode
		BufferedReader reader = null;//that contains a single word on its data attribute to the linked list on the attribute wordBook of this class.
		try {
			reader= new BufferedReader(new FileReader("LetterTiles.txt"));
			
			int index=0;
			String line;
			String lineArray[];
			while((line = reader.readLine()) != null) {
				lineArray = line.split(",");
				this.deck[index]=new LetterTile(lineArray[0],Integer.parseInt(lineArray[1]),Integer.parseInt(lineArray[2]));
				index++;
			}
			
			System.out.println("Deck Initialized");
		} catch (IOException error){
			System.out.println("Error de lectura");
		} finally {
			try {
				reader.close();
			} catch (IOException closingError) {
				System.out.println("Error al crear diccionario");

			}
		}
	}
	
	
	
}

