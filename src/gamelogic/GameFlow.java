package programlogic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.concurrent.ThreadLocalRandom;

public class GameFlow {

	static BufferedReader in= new BufferedReader (new InputStreamReader(System.in));
	static PrintStream out=System.out;
	private static Board game = new Board();
	

	public static void main(String[] args) throws IOException {
		game.initializeTableTop();
		System.out.println("----------------------------------------");
		game.getDictionary().generateDictionaryBook();
		System.out.println("----------------------------------------");
		game.InitializeDeck();
		System.out.println("----------------------------------------");
		
	
		
		
		

	}

	public static void promptGameStart() throws IOException{
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		out.println("Bienvenido a Scrabble");
		out.println("desea iniciar un nuevo juego?");
		out.println("Y/N?");
		String input = in.readLine();
		if (input.equals("Y")||                    input.equals("y")) {
			out.println("La partida puede tener un maximo de cuatro jugadores");
			playerCreation();
		}else if(input.equals("N")||input.equals("n")) {
			out.println("hasta luego!");

		}


	}

	private static void playerCreation() throws IOException {
		if(game.getNumberOfPlayers()<=4) {
			out.println("Ingrese el nombre del nuevo jugador");
			String name = in.readLine();
			game.getPlayerList().append(new Player(name));
			game.setNumberOfPlayers(game.getNumberOfPlayers()+1);
			out.println(game.getNumberOfPlayers());
			out.println("desea agregar otro jugador?");
			String decision= in.readLine();
			if (decision.equals("Y")||decision.equals("y")) {
				if(game.getNumberOfPlayers()<=4) {
					if(game.getNumberOfPlayers()==4) {
						System.out.println("no puede agregar mas jugadores");
						//round start prompt
					}
					if(game.getNumberOfPlayers()<4) {
						playerCreation();
					}
				}


			}else if(decision.equals("N")||decision.equals("n")) {
				//Round start prompt
			}


		}
	}
	
	private static boolean verifyWord(String word)    {
		DictionaryNode current;
		
			for(current =game.getDictionary().getWordBook().getHead(); current != null; current = current.getNext()) {
				if(current.getData().equals(word)) { 
					out.println("FOUND");
					return true;
				}
			}
			out.println("NOT FOUND");
			return false;
	}

	
	private static void randomTileGenerator(/*to take a player object*/) {//Method that generates a random letter tile, taking into consideration the amount
		int positionCounter=0;																// of tiles per letter, the tiles bigger in amount have a bigger chance of dropping																					
		int index=0;																			
		int randomNum = ThreadLocalRandom.current().nextInt(1, game.getDeckSize()+1);
		out.println("random number "+ randomNum);
		while(positionCounter<randomNum) {
			out.println("sum of positions"+positionCounter);
			positionCounter+=game.getDeck()[index].getAmount();
			index++;
		}
		index-=1;
		
		out.println("La letra es: "+ game.getDeck()[index].getLetter());
		
	}
	
}




















		
		
	

