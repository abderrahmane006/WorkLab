package beansAfrica;

import java.io.Serializable;



public class MedeDesc implements Serializable {
	public String GID;
	public String nom;
	public String prenom;
	public String grade;
	public String poste;

	public MedeDesc(String GID, String nom,String prenom, String grade, String poste)
	{
		this.GID=GID;
		this.nom=nom;
		this.prenom=prenom;
		this.grade = grade;
		this.poste = poste;          
	}


	
	
}


