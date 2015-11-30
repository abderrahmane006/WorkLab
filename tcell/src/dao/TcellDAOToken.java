package dao;

import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.inria.database.QEPng;

import test.jdbc.Tools;
import beansAfrica.MedeDesc;
import configuration.Configuration;
import dao.QEP;
import dao.Schema;
import dao.TCell_QEP_IDs;



/**
 * author TORKHANI Rami
 * the TCell DB Manager.
 */
public class TcellDAOToken extends Tools{
	private static int fileIdGlobal=0;

	private static TcellDAOToken instance = null;
	
	
	// Renvoyer une instance de TcellDAOToken
		public static TcellDAOToken getInstance(boolean ignoreLoadQEP) {
			/**
			 * TcellDAOToken Creates a TCELL_DB instance
			 * @param ignoreLoadQEP
			 */

			if (instance == null) {
				synchronized (TcellDAOToken.class) {
					if (instance == null) {
						instance = new TcellDAOToken(ignoreLoadQEP);
					}
				}
			}
			return instance;
		}

	//Load JDBC driver, get a connexion, without installing execution plans
	
	public TcellDAOToken(boolean ignoreLoadQEP) {
		try {
			out = new PrintWriter(java.lang.System.out);
		    init();
			openConnection(Configuration.getConfiguration().getProperty("dbPath"), null);
			
			((org.inria.jdbc.Connection) db).bypassInitialization();
			
			Class<?>[] executionPlans = new Class[] { QEP.class };
			QEPng.loadExecutionPlans(TCell_QEP_IDs.class, executionPlans);
			if(!ignoreLoadQEP){
				QEPng.installExecutionPlans(db);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




	public void DropTables() {
		/**
		 * Drop the tables of DB.
		 */
		try {
			Desinstall_DBMS_MetaData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void CreateTables() {
		/**
		 * Creates the tables in DB.
		 * 
		 */
		try {
			String schema = Schema.META;
			Install_DBMS_MetaData(schema.getBytes(),0);

			// load and install QEPs
			Class<?>[] executionPlans = new Class[] { QEP.class };
			QEPng.loadExecutionPlans(TCell_QEP_IDs.class, executionPlans);
			QEPng.installExecutionPlans(db);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Inserts a patient's description
	 * 
	 * @param GID
	 *            the global id of the file
	 * @param fullname
	 *            the fullname of the patient
	 * @param age
	 *            the age of the patient
	 * @param sex
	 *            the civility of the patient
	 * @param taille
	 *            the size of patient
	 * @throws Exception
	 */
	public void insertPatient(int GID, String fullname, int age, String sex, String taille) {

		try {
			java.sql.PreparedStatement ps = ((org.inria.jdbc.Connection) db).prepareStatement(TCell_QEP_IDs.QEP.EP_insertPatient);
			//ps.setInt(1, fileIdGlobal++);
			ps.setInt(1, GID);
			ps.setString(2, fullname);
			ps.setInt(3, age);
			ps.setString(4, sex);
			ps.setString(5, taille);
			ps.executeUpdate();
			
			String query= "INSERT INTO PATIENT  VALUES ("+ GID+","+fullname+","+age+","+sex+","+taille+")";
			System.out.println("Executing query : " + query);			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Uncomment when the close function will be implemented
			// attemptToClose(ps);
		}

	}
	
	/**
	 * Inserts a Consultation 's description
	 * 
	 * @param IdGlobal
	 *            the global id of the consultation
	 * @param IdPatient
	 *           the global id of the Patient
	 * @param IdMedecin
	 *            the global id of a Doctor
	 * @param IMC
	 *            Sepecifique to Doc
	 * @param TDT
	 * 			  Sepecifique to Doc
	 * @param POID   
	 * 			  Sepecifique to Doc  
	 * @param DATEVI   
	 * 			  the date of consultation	  
	 * @throws Exception
	 */
	public void visite(int GID, int IdPatient, int IdDocteur, String TDT, String IMC, String DateVi) {

		try {
			java.sql.PreparedStatement ps = ((org.inria.jdbc.Connection) db).prepareStatement(TCell_QEP_IDs.QEP.EP_insertVisite);
			//ps.setInt(1, fileIdGlobal++);
			ps.setInt(1, GID);
			ps.setInt(2, IdPatient);
			ps.setInt(3, IdDocteur);
			ps.setString(4, TDT);
			ps.setString(3, IMC);
			ps.setString(4, DateVi);
			ps.executeUpdate();
			
			String query= "INSERT INTO MEDECIN  VALUES ("+ GID+","+nomProf+","+grade+","+service+")";
			System.out.println("Executing query : " + query);			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Uncomment when the close function will be implemented
			// attemptToClose(ps);
		}
	}
	/**
	 * Inserts a doctor's description
	 * 
	 * @param GID
	 *            the global id of the doctor
	 * @param nomProf
	 *            the name of the professor
	 * @param grade
	 *            the level of the doctor
	 * @param service
	 *            the service of the doctor 
	 * @throws Exception
	 */
	public void insertMedecin(int GID, String nomProf, String grade, String service) {

		try {
			java.sql.PreparedStatement ps = ((org.inria.jdbc.Connection) db).prepareStatement(TCell_QEP_IDs.QEP.EP_insertMedecin);
			//ps.setInt(1, fileIdGlobal++);
			ps.setInt(1, GID);
			ps.setString(2, nomProf);
			ps.setString(3, grade);
			ps.setString(4, service);
			ps.executeUpdate();
			
			String query= "INSERT INTO MEDECIN  VALUES ("+ GID+","+nomProf+","+grade+","+service+")";
			System.out.println("Executing query : " + query);			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Uncomment when the close function will be implemented
			// attemptToClose(ps);
		}
	}
	/**
	 * SELECT GID, nomProf, Grade, Service FROM MEDECIN;
	 * 	 * @return FileDesc 
	 *    The Doctor's description <GID, nomProf, Grade, Service>
	 */
	public ArrayList<MedeDesc> getAllMedecin() {

		ArrayList<MedeDesc> result = new ArrayList<MedeDesc>();

		try {
			java.sql.PreparedStatement ps = ((org.inria.jdbc.Connection) db).prepareStatement(TCell_QEP_IDs.QEP.EP_getAllMedecin);
			ResultSet rs = ps.executeQuery();
			
			String query = "SELECT GID, nomProf, Grade, Service FROM MEDECIN";
			System.out.println("Executing query : " + query);			
			Tools.lireResultSet(rs , out);
			
			while (rs.next() == true) {
				String GID = rs.getString(1);
				String nomProf = rs.getString(2);
				String Grade = rs.getString(3);
				String Service = rs.getString(4);
				result.add(new MedeDesc(GID,nomProf, Grade, Service));
				
			}
			Tools.lireResultSet(rs , out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Uncomment when the close function will be implemented
			// attemptToClose(ps);
			
		}

		return result;
	}
	
	
			/************LOG INFO***************/
	public void printAllMedecin() {

		try {
			java.sql.PreparedStatement ps = ((org.inria.jdbc.Connection) db).prepareStatement(TCell_QEP_IDs.QEP.EP_PrintAllMedecin);
			ResultSet rs = ps.executeQuery();
			
			String query = "SELECT GID, nomProf, Grade, Service FROM MEDECIN";
			System.out.println("Executing query : " + query);			

			Tools.lireResultSet(rs , out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Uncomment when the close function will be implemented
			// attemptToClose(ps);
			
		}
	}
	public void printAllPatient() {

		try {
			java.sql.PreparedStatement ps = ((org.inria.jdbc.Connection) db).prepareStatement(TCell_QEP_IDs.QEP.EP_PrintAllPatient);
			ResultSet rs = ps.executeQuery();
			
			String query = "SELECT GID, fullname, age, sex, taille FROM PATIENT";
			System.out.println("Executing query : " + query);			

			Tools.lireResultSet(rs , out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Uncomment when the close function will be implemented
			// attemptToClose(ps);
			
		}
	}
	
	public void printAllVisite() {

		try {
			java.sql.PreparedStatement ps = ((org.inria.jdbc.Connection) db).prepareStatement(TCell_QEP_IDs.QEP.EP_PrintAllViste);
			ResultSet rs = ps.executeQuery();
			
			String query = "SELECT GID, fullname, age, sex, taille FROM PATIENT";
			System.out.println("Executing query : " + query);			

			Tools.lireResultSet(rs , out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Uncomment when the close function will be implemented
			// attemptToClose(ps);
			
		}
	}
	
	/*************************************************************************************************************/

	

	private void attemptToClose(PreparedStatement ps) {
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
