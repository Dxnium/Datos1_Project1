package datos.sockets;

public class Main {

	public static void main(String[] args) {
		//New thread running the Server
		Server server = new Server();
		Thread hilo = new Thread(server);
		hilo.start();
		//
		Cliente cliente = new Cliente();
		System.out.println(cliente.address);
	}

}
