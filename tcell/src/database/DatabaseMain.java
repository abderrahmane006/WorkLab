/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
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
			/*STOP HERE*/
			TcellDAOToken.getInstance(true);
			TcellDAOToken.getInstance(false).DropTables();
			TcellDAOToken.getInstance(false).CreateTables();
			
			/*InsertDATA*/
			System.getProperties().setProperty("jdbc.port", Configuration.getConfiguration().getProperty("dbPort"));
			String InsertFilePath = Configuration.getConfiguration().getProperty("InsertFilePath");
			String InsertDoctorPath = Configuration.getConfiguration().getProperty("InsertDoctorPath");
			FileInputStream fstream1 = new FileInputStream(InsertDoctorPath);
			FileInputStream fstream = new FileInputStream(InsertFilePath);
	
			// Get the contacts info of DataInputStream
					DataInputStream in = new DataInputStream(fstream);
					BufferedReader br = new BufferedReader(new InputStreamReader(in));
					String strLine;
			
			//Add Some Queries From File
			while ((strLine = br.readLine()) != null) {
				if (strLine != "") {
					String[] tokens = strLine.split(":");
					String GID = tokens[0];
					String FullName = tokens[1];
					String age = tokens[2];
					String sex = tokens[3];
					String taille = tokens[4];
					TcellDAOToken.getInstance(false).insertPatient(Integer.parseInt(GID), FullName,Integer.parseInt(age),sex,taille);
				}
			}
			br.close();
			in.close();
			//Insert Doctor
			in = new DataInputStream(fstream1);
			br = new BufferedReader(new InputStreamReader(in));
			strLine ="";
	
	//Add Some Queries From File
	while ((strLine = br.readLine()) != null) {
		if (strLine != "") {
			String[] tokens = strLine.split(":");
			String GID = tokens[0];
			String nomProf = tokens[1];
			String grade = tokens[2];
			String service = tokens[3];
			TcellDAOToken.getInstance(false).insertMedecin(Integer.parseInt(GID), nomProf, grade, service);
		}
	}
	br.close();
	in.close();
			
			//Print LOGs
			TcellDAOToken.getInstance(false).printAllMedecin();
			TcellDAOToken.getInstance(false).printAllPatient();

		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
			
	}

}

