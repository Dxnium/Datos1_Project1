package programlogic;
import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;

public class Dictionary {//  This class contains the valid words used on the game, manages logical methods related to generation of data structures
	private DictionaryLinkedList wordBook = new DictionaryLinkedList();

	public DictionaryLinkedList getWordBook() {
		return wordBook;
	}

	public void setWordBook(DictionaryLinkedList wordBook) {
		this.wordBook = wordBook;
	}

	public void generateDictionaryBook(){//this method parses the .txt file containing the valid words to use and appends one DictionaryLinkedListNode
		BufferedReader reader = null;//that contains a single word on its data attribute to the linked list on the attribute wordBook of this class.
		try {
			reader= new BufferedReader(new FileReader("Dictionary.txt"));

			String line;
			while((line = reader.readLine()) != null) {
				this.wordBook.append(line);
			}
			System.out.println("Dictionary Initialized");
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

