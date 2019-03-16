package datos.sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable  {
	ServerSocket server;  
	Socket socket; 
	final int port = 9999;
	DataOutputStream clientOut;
	

	@Override
	public void run() {
		try {
			//server created in port 9999
			server = new ServerSocket(port);
			Socket client = new Socket();
			System.out.println("New server started");	
			socket = server.accept();//Waiting for a client 
			//Client connected 
			System.out.println("Client connect");
		//--------Connection----------------------	
			//Client OutStream 
			clientOut = new DataOutputStream(client.getOutputStream());
			//Send a msj to client
			clientOut.writeUTF("Hi from Server");
			
			server.close();
			
			
			
			
			
		} catch (IOException e) {
			System.out.println("Connetion failed");
		}
	}
}
