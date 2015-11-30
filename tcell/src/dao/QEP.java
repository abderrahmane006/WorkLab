package dao;

/**
 * author TORKHANI Rami
 * The execution plans of queries should be declaring this class
 */

public class QEP {

	public static String EP_insertMedecin =
			"/*EP \u0004 6 1 1 -1 1 ?1 # 5 0 0 1 4 3 1 11 r0 12 ?2 13 ?3 14 ?4 # \u0000*/";

		public static String EP_insertPatient =
			"/*EP \u0005 6 1 1 -1 2 ?1 # 5 0 0 1 5 4 1 15 r0 16 ?2 17 ?3 18 ?4 19 ?5 # \u0000*/";

		public static String EP_insertVisite =
			"/*EP \u0007 2 4 4 -1 1 ?3 # 2 5 5 -1 2 ?2 # 7 3 3 4 5 # 6 2 2 3 3 ?1 # 5 1 1 2 2 0 0 0 r1 1 r3 # 5 0 0 1 7 5 1 20 r4 21 ?2 22 ?3 23 ?4 24 ?5 25 ?6 26 ?7 # \u0000*/";

		public static String EP_getAllMedecin =
			"/*EP \u0000 0 1 1 3 # 1 0 0 1 r0 4 3 1 11 12 13 14 # \u0000 4 1 1 IdGlobal 0 2 NomPROF 0 3 GRADE 0 4 SERVICE # \u0000*/";

		public static String EP_getAllPatient =
			"/*EP \u0000 0 1 1 4 # 1 0 0 1 r0 5 4 1 15 16 17 18 19 # \u0000 5 1 1 IdGlobal 0 2 FULLNAME 1 3 AGE 0 4 SEX 0 5 TAILLE # \u0000*/";

		public static String EP_getAllViste =
			"/*EP \u0000 0 1 1 5 # 1 0 0 1 r0 7 5 1 20 21 22 23 24 25 26 # \u0000 7 1 1 IdGlobal 1 2 IdPatient 1 3 IdMedecin 0 4 IMC 0 5 TDT 0 6 POID 0 7 DateVI # \u0000*/";

}
