package datos.JSON;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONArray;

import Juego.Juego;

public class Encode {
	//acceso a los datos (atributos) de la clase 
	//Almacenar en un JSONArray
	public JSONArray arrayData(Juego obj) {
		JSONArray array = new JSONArray();
			array.add(obj);
		return array;
	}
	//Main de prueba 
	public static void main(String[] args) {
	Encode datos = new Encode();
	//Crea el arreglo con los datos de la Clase 
	JSONArray arr = datos.arrayData(new Juego("Daniel",22));
	
	StringWriter out = new StringWriter();//crear un variable de tipo Writer para almacenar el array y poder mostarlo en pantalla 
	try {
		arr.writeJSONString(out); //guardar el JSONArray en un string 
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("*****************ENCODE*****************");
	System.out.println(out);
	System.out.println("*****************DECODE*****************");
	Decode decode = new Decode(out);
	
	}

}
