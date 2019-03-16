package Juego;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;

import org.json.simple.JSONAware;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class Juego implements JSONStreamAware{
	private String name;
	private int fichas;
	 
	
	public Juego(String name, int fichas) {
		this.name = name;
		this.fichas = fichas;
	}
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public int getFichas() {
		return fichas;
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}

	@Override
	public void writeJSONString(Writer out) throws IOException {
		//darle formato al JSON
		LinkedHashMap obj = new LinkedHashMap();
		obj.put("Name", name);
		obj.put("Fichas", String.valueOf(fichas));
		JSONValue.writeJSONString(obj, out);
	}


	
	
	
	
	

}
