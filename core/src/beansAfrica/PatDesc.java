package beansAfrica;

import java.io.Serializable;

/**
 * 
 * 
 */

public class PatDesc implements Serializable {
	public int GID;
	public String fullname;
	public int age;
	public String sex;
	public String taille;

	public PatDesc (int GID, String fullname, int age, String sex, String taille)
	{
		this.GID=GID;
		this.fullname=fullname;
		this.age=age;
		this.sex = sex;
		this.taille = taille;
	}


	
	
}

