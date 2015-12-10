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
import java.security.PrivateKey;
import java.security.PublicKey;

import configuration.Configuration;
import tools.Constants;
import tools.Tools;
import cryptoTools.KeyManager;
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
			// Init MyInfo
						int myGid = Integer.parseInt(Configuration.getConfiguration().getProperty("userGID"));
						String myTcellIp = Configuration.getConfiguration().getProperty("tcellIP") ;
						int myTcellPort = Integer.parseInt(Configuration.getConfiguration().getProperty("port"));
						String KeyPath = Configuration.getConfiguration().getProperty("keyPath");
						KeyManager keygen;
						//load myPubKey
						keygen = new KeyManager();
						String MyPublicKeyPath = KeyPath + Constants.PUB_KEY_PREFIX + myGid + Constants.KEY_EXT;
						PublicKey pubKey = keygen.LoadPublicKey(MyPublicKeyPath, Constants.RSA_ALG);
						String myPubkey = keygen.PublicKeyToString(pubKey);

						//load myPrivKey
						keygen = new KeyManager();
						String MyPrivateKeyPath = KeyPath + Constants.PR_KEY_PREFIX + myGid + Constants.KEY_EXT;
						PrivateKey privKey = keygen.LoadPrivateKey(MyPrivateKeyPath, Constants.RSA_ALG);
						String myPrivkey = keygen.PrivateKeyToString(privKey);
						TcellDAOToken.getInstance(false).insertMyTOKENParameter(myGid, myTcellIp, myTcellPort, myPubkey, myPrivkey,0);
			// Get the contacts info of DataInputStream
					DataInputStream in = new DataInputStream(fstream);
					BufferedReader br = new BufferedReader(new InputStreamReader(in));
					String strLine;
			
			//Add Some Queries From File
			while ((strLine = br.readLine()) != null) {
				if (strLine != "") {
					String[] tokens = strLine.split(":");
					String GID = tokens[0];
					String nom = tokens[1];
					String prenom = tokens[2];
					String age = tokens[3];
					String sexe = tokens[4];
					String niveauintel = tokens[5];
					String profession = tokens[6];
					String stored = tokens[7];
					TcellDAOToken.getInstance(false).insertPatient(Integer.parseInt(GID),nom,prenom,Integer.parseInt(age),sexe,niveauintel,profession,Integer.parseInt(stored));
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
			String nom = tokens[1];
			String prenom = tokens[2];
			String grade = tokens[3];
			String poste = tokens[4];
			String stored = tokens[5];
			TcellDAOToken.getInstance(false).insertPracticien(Integer.parseInt(GID), nom,prenom, grade,poste,Integer.parseInt(stored));
		}
	}
	br.close();
	in.close();
			
			//Print LOGs
			TcellDAOToken.getInstance(false).printAllMedecin();
			TcellDAOToken.getInstance(false).printAllPatient();
			TcellDAOToken.getInstance(false).printMyTokenParameter();
			TcellDAOToken.getInstance(false).Save_DBMS_on_disk();
			TcellDAOToken.getInstance(false).Shutdown_DBMS();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
			
	}

}

