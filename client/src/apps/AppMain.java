package apps;

import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;

import beansAfrica.MyParameter;
import tools.Constants;
import interfaces.ClientInterface;
import configuration.Configuration;
import cryptoTools.KeyManager;
import dao.*;

public class AppMain 
{
	/**
	 * APP Main
	 * 
	 * @author Majdi Ben Fredj
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		int destUserGID = Integer.parseInt(Configuration.getConfiguration().getProperty("destUserGID"));
		String tCellIP = Configuration.getConfiguration().getProperty("myIP");
		int port = Integer.parseInt(Configuration.getConfiguration().getProperty("myPort"));
		MyParameter myInfo  = TcellDAOToken.getInstance(false).getMyParameter();
		// TEST READFILE
		ClientInterface.STORE_TABLE1(destUserGID, myInfo);
				
		System.out.println("Dooooone");
	}
}