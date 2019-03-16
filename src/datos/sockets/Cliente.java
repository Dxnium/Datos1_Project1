package datos.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	final int port = 9999;
	String address = "localhost";
	Socket socket;
	
	public Cliente() {
		try {
			socket = new Socket(address,port);
			System.out.println("Hola desde el cliente");
			
			//Se obtiene el flujo entrante desde el cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

           
			String mensajeServidor;
			while((mensajeServidor = entrada.readLine()) != null) //Mientras haya mensajes desde el cliente
            {
                //Se muestra por pantalla el mensaje recibido
                System.out.println(mensajeServidor);
            }
			
			
			socket.close();
		} catch (UnknownHostException e) {
			//IP failed 
			System.out.println("Cannot find ip address");
		} catch (IOException e) {
			System.out.println("Cannot find server port");
		}
		
		
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
