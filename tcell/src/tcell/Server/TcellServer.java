package tcell.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import beansAfrica.MyParameter;
import configuration.Configuration;
import dao.TcellDAOToken;

public class TcellServer {

public static void main(String[] args) throws IOException {
		
	
		MyParameter myInfo  = TcellDAOToken.getInstance(false).getMyParameter();
		
		int userGID = myInfo.getMyGid();
		int listenPort = myInfo.getMyTcellPort();
		ServerSocket server = null;
		try {

			/* Creation of the server socket */
			server = new ServerSocket(listenPort);

			/* The server listens for new connections and accepts it */
			System.out.println("The PSMF is started...");

			while (true) {
				System.out.println("\nWaiting for a connection from the Doctor APP or from other feature");
				Socket clientSocket = server.accept();
				System.out.println("Accepted connection : " + clientSocket);

				/* For each socket, a new thread is created */
				ConnectionManager ccm = new ConnectionManager(clientSocket, userGID);
				ccm.start();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			server.close();
		}
	}
	
}
