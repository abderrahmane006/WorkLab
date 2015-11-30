/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import configuration.Configuration;
import dao.TcellDAOToken;

/**
 * author TORKHANI Rami 
 * Initialization of the DataBase.
 */
public class DatabaseMain {
	/**
	 * Initialization of db.
	 * 
	 * @param args
	 * @throws NoSuchAlgorithmException
	 * @throws FileNotFoundException
	 */


	public static void main(String[] args) throws NoSuchAlgorithmException,
			FileNotFoundException {

		if (System.getProperty("configurationFilePath") == null) {
			System.out.println("'configurationFilePath' system property is not defined");
			return;
		}

		try {
			System.getProperties().setProperty("jdbc.port", Configuration.getConfiguration().getProperty("dbPort"));
			TcellDAOToken.getInstance(true);
			TcellDAOToken.getInstance(false).DropTables();
			TcellDAOToken.getInstance(false).CreateTables();
			
		
			TcellDAOToken.getInstance(false).insertPatient(1, "TORKHANI RAMI", 23,"M", "1.85");
			TcellDAOToken.getInstance(false).insertMedecin(1, "Willam", "chef service", "diab");
			TcellDAOToken.getInstance(false).getAllMedecin();
		
			
			

			

		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
			
	}

}

