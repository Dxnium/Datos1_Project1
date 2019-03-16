package datos.sockets;

import java.io.IOException;
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
