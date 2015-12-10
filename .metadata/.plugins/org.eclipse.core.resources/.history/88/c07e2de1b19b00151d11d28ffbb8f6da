package tcell.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import configuration.Configuration;

public class TcellServer {

public static void main(String[] args) throws IOException {
		
		//Function to verifiy if the configuration file exist 
		if (System.getProperty("configurationFilePath") == null) {
			System.out.println("'configurationFilePath' system property is not defined");
			return;
		}
		
		System.getProperties().setProperty("jdbc.port", Configuration.getConfiguration().getProperty("dbPort"));
		//Later it will be changed : Ask token for port and FoldNum
		int listenPort = 33010;
		ServerSocket server = null;
		try {

			/* Creation of the server socket */
			server = new ServerSocket(listenPort);

			/* The server listens for new connections and accepts it */
			System.out.println("TCell Daemon started...");

			while (true) {
				System.out.println("\nWaiting for a connection from the MED APP");
				Socket clientSocket = server.accept();
				System.out.println("Accepted connection : " + clientSocket);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			server.close();
		}
	}
	
}
