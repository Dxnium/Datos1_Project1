package datos.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable  {
	ServerSocket server;  
	Socket socket; 
	final int port = 9999;

	@Override
	public void run() {
		try {
			//server created in port 9999
			server = new ServerSocket(port);
			System.out.println("New server started");	
			socket = server.accept();//Waiting for a client 
			//Client connected 
			System.out.println("Client connect");
			
			
			
		} catch (IOException e) {
			System.out.println("Connetion failed");
		}
	}
}
