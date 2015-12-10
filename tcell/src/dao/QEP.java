package dao;

/**
 * author TORKHANI Rami
 * The execution plans of queries should be declaring this class
 */

public class QEP {
	public static String EP_insertPRATICIEN =
			"/*EP \u0006 6 1 1 -1 3 ?1 # 5 0 0 1 6 5 1 25 r0 26 ?2 27 ?3 28 ?4 29 ?5 30 ?6 # \u0000*/";

		public static String EP_insertANTECEDENTMED =
			"/*EP \u0008 2 3 3 -1 2 ?2 # 6 2 2 3 4 ?1 # 5 1 1 2 1 1 0 0 r1 # 5 0 0 1 8 6 1 31 r2 32 ?2 33 ?3 34 ?4 35 ?5 36 ?6 37 ?7 38 ?8 # \u0000*/";

		public static String EP_insertPatient =
			"/*EP \u0008 6 1 1 -1 2 ?1 # 5 0 0 1 8 4 1 17 r0 18 ?2 19 ?3 20 ?4 21 ?5 22 ?6 23 ?7 24 ?8 # \u0000*/";

		public static String EP_insertVisite =
			"/*EP \u000B 2 4 4 -1 3 ?3 # 2 5 5 -1 2 ?2 # 7 3 3 4 5 # 6 2 2 3 5 ?1 # 5 1 1 2 2 0 0 0 r1 1 r3 # 5 0 0 1 11 7 1 39 r4 40 ?2 41 ?3 42 ?4 43 ?5 44 ?6 45 ?7 46 ?8 47 ?9 48 ?10 49 ?11 # \u0000*/";

		public static String EP_insertMyParameter =
			"/*EP \u0006 6 1 1 -1 1 ?1 # 5 0 0 1 6 3 1 11 r0 12 ?2 13 ?3 14 ?4 15 ?5 16 ?6 # \u0000*/";

		public static String EP_getMyParameter =
			"/*EP \u0000 0 1 1 3 # 1 0 0 1 r0 5 3 1 11 12 13 14 15 # \u0000 5 1 1 IdGlobal 0 2 MytCellIp 1 3 MytCellPort 9 4 MyPublicKey 9 5 MyPrivateKey # \u0000*/";

		public static String EP_getAllPRATICIEN =
			"/*EP \u0000 0 1 1 5 # 1 0 0 1 r0 5 5 1 25 26 27 28 29 # \u0000 5 1 1 IdGlobal 0 2 Nom 0 3 Prenom 0 4 Grade 0 5 Poste # \u0000*/";

		public static String EP_getInfoPatient =
			"/*EP \u0000 0 1 1 4 # 1 0 0 1 r0 7 4 1 17 18 19 20 21 22 23 # \u0000 7 1 1 IdGlobal 0 2 Nom 0 3 Prenom 1 4 Age 0 5 Sexe 0 6 NiveauIntel 0 7 Profession # \u0000*/";

		public static String EP_getAllViste =
			"/*EP \u0000 0 1 1 7 # 1 0 0 1 r0 10 7 1 39 40 41 42 43 44 45 46 47 48 # \u0000 10 1 1 IdGlobal 1 2 IdPatient 1 3 IdPRATICIEN 0 4 DateVI 0 5 Poid 0 6 Taille 0 7 IMC 0 8 TDT 0 9 TG 0 10 Insuline # \u0000*/";

		public static String EP_getANTECEDENTMED =
			"/*EP \u0000 0 1 1 6 # 1 0 0 1 r0 7 6 1 31 32 33 34 35 36 37 # \u0000 7 1 1 IdGlobal 1 2 IdPatient 0 3 DateFirstCon 0 4 DateInsuline 0 5 ConsoAlc 0 6 ConsoTab 0 7 AccidentVS # \u0000*/";

		public static String EP_GetUnstoredPatient =
			"/*EP \u0000 0 2 2 4 # 1 1 1 2 r0 8 4 1 17 18 19 20 21 22 23 24 # 4 0 0 1 24 0 v10 r8 # \u0000 7 1 1 IdGlobal 0 2 Nom 0 3 Prenom 1 4 Age 0 5 Sexe 0 6 NiveauIntel 0 7 Profession # \u0000*/";

		public static String EP_GetUnstoredPracticien =
			"/*EP \u0000 0 2 2 5 # 1 1 1 2 r0 6 5 1 25 26 27 28 29 30 # 4 0 0 1 30 0 v10 r6 # \u0000 5 1 1 IdGlobal 0 2 Nom 0 3 Prenom 0 4 Grade 0 5 Poste # \u0000*/";

		public static String EP_GetUnstoredANTECEDENTMED =
			"/*EP \u0000 0 2 2 6 # 1 1 1 2 r0 8 6 1 31 32 33 34 35 36 37 38 # 4 0 0 1 38 0 v10 r8 # \u0000 7 1 1 IdGlobal 1 2 IdPatient 0 3 DateFirstCon 0 4 DateInsuline 0 5 ConsoAlc 0 6 ConsoTab 0 7 AccidentVS # \u0000*/";

		public static String EP_GetUnstoredVisite =
			"/*EP \u0000 0 2 2 7 # 1 1 1 2 r0 8 7 1 39 40 41 45 46 43 42 49 # 4 0 0 1 49 0 v10 r8 # \u0000 7 1 1 IdGlobal 1 2 IdPatient 1 3 IdPRATICIEN 0 4 IMC 0 5 TDT 0 6 POID 0 7 DateVI # \u0000*/";

		public static String EP_GetUnstoredMyParameter =
			"/*EP \u0000 0 2 2 3 # 1 1 1 2 r0 6 3 1 11 12 13 14 15 16 # 4 0 0 1 16 0 v10 r6 # \u0000 5 1 1 IdGlobal 0 2 MytCellIp 1 3 MytCellPort 9 4 MyPublicKey 9 5 MyPrivateKey # \u0000*/";

		public static String EP_PRINTMyParameter =
			"/*EP \u0000 0 1 1 3 # 1 0 0 1 r0 5 3 1 11 12 13 14 15 # \u0000 5 1 1 IdGlobal 0 2 MytCellIp 1 3 MytCellPort 9 4 MyPublicKey 9 5 MyPrivateKey # \u0000*/";

		public static String EP_PRINTAllPRATICIEN =
			"/*EP \u0000 0 1 1 5 # 1 0 0 1 r0 5 5 1 25 26 27 28 29 # \u0000 5 1 1 IdGlobal 0 2 Nom 0 3 Prenom 0 4 Grade 0 5 Poste # \u0000*/";

		public static String EP_PRINTInfoPatient =
			"/*EP \u0000 0 1 1 4 # 1 0 0 1 r0 7 4 1 17 18 19 20 21 22 23 # \u0000 7 1 1 IdGlobal 0 2 Nom 0 3 Prenom 1 4 Age 0 5 Sexe 0 6 NiveauIntel 0 7 Profession # \u0000*/";

		public static String EP_PRINTAllViste =
			"/*EP \u0000 0 1 1 7 # 1 0 0 1 r0 10 7 1 39 40 41 42 43 44 45 46 47 48 # \u0000 10 1 1 IdGlobal 1 2 IdPatient 1 3 IdPRATICIEN 0 4 DateVI 0 5 Poid 0 6 Taille 0 7 IMC 0 8 TDT 0 9 TG 0 10 Insuline # \u0000*/";

		public static String EP_PRINTANTECEDENTMED =
			"/*EP \u0000 0 1 1 6 # 1 0 0 1 r0 7 6 1 31 32 33 34 35 36 37 # \u0000 7 1 1 IdGlobal 1 2 IdPatient 0 3 DateFirstCon 0 4 DateInsuline 0 5 ConsoAlc 0 6 ConsoTab 0 7 AccidentVS # \u0000*/";

		public static String EP_UpdateViste =
			"/*EP \u0001 2 2 2 -1 5 ?1 # 1 1 1 2 r1 9 7 1 40 41 42 43 44 45 46 47 48 # a 0 0 1 11 7 r1 39 ?1 40 r2 41 r3 42 r4 43 r5 44 r6 45 r7 46 r8 47 r9 48 r10 49 v11 # \u0000*/";

		public static String EP_UpdatePatient =
			"/*EP \u0001 2 2 2 -1 2 ?1 # 1 1 1 2 r1 6 4 1 18 19 20 21 22 23 # a 0 0 1 8 4 r1 17 ?1 18 r2 19 r3 20 r4 21 r5 22 r6 23 r7 24 v11 # \u0000*/";

		public static String EP_UpdateANTECEDENTMED =
			"/*EP \u0001 2 2 2 -1 4 ?1 # 1 1 1 2 r1 6 6 1 32 33 34 35 36 37 # a 0 0 1 8 6 r1 31 ?1 32 r2 33 r3 34 r4 35 r5 36 r6 37 r7 38 v11 # \u0000*/";

		public static String EP_UpdatePracticien =
			"/*EP \u0001 2 2 2 -1 3 ?1 # 1 1 1 2 r1 4 5 1 26 27 28 29 # a 0 0 1 6 5 r1 25 ?1 26 r2 27 r3 28 r4 29 r5 30 v11 # \u0000*/";

		public static String EP_UpdateMyParameter =
			"/*EP \u0001 2 2 2 -1 1 ?1 # 1 1 1 2 r1 4 3 1 12 13 14 15 # a 0 0 1 6 3 r1 11 ?1 12 r2 13 r3 14 r4 15 r5 16 v11 # \u0000*/";	
}
