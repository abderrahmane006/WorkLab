package dao;

/**
 * author TORKHANI RAMI
 * This class contains the schema database
 */
public class Schema {
	public static final String META =
			"TAB_DESC,6\n"+
			"0	QEP	512\n"+
			"1	LogDeleted	12\n"+
			"2	UpdateLog	512\n"+
			"3	MEDECIN	55\n"+
			"4	PATIENT	36\n"+
			"5	VISITE	73\n"+
			"COL_DESC,27\n"+
			"0	0	IdGlobal	4	1	0\n"+
			"1	0	QEPStr	460	0	4\n"+
			"2	0	SQLStr	24	9	464\n"+
			"3	0	ExplainStr	24	9	488\n"+
			"4	1	TabId	4	1	0\n"+
			"5	1	TuplePos	4	1	4\n"+
			"6	1	Flag	4	1	8\n"+
			"7	2	TabId	4	1	0\n"+
			"8	2	TuplePos	4	1	4\n"+
			"9	2	TupleSize	4	1	8\n"+
			"10	2	CompleteTup	500	0	12\n"+
			"11	3	IdGlobal	4	1	0\n"+
			"12	3	NomPROF	17	0	4\n"+
			"13	3	GRADE	17	0	21\n"+
			"14	3	SERVICE	17	0	38\n"+
			"15	4	IdGlobal	4	1	0\n"+
			"16	4	FULLNAME	17	0	4\n"+
			"17	4	AGE	4	1	21\n"+
			"18	4	SEX	3	0	25\n"+
			"19	4	TAILLE	8	0	28\n"+
			"20	5	IdGlobal	4	1	0\n"+
			"21	5	IdPatient	4	1	4\n"+
			"22	5	IdMedecin	4	1	8\n"+
			"23	5	IMC	17	0	12\n"+
			"24	5	TDT	17	0	29\n"+
			"25	5	POID	17	0	46\n"+
			"26	5	DateVI	10	0	63\n"+
			"FK_DESC,2\n"+
			"5	21	4	15\n"+
			"5	22	3	11\n"+
			"SKT_DESC,1\n"+
			"0	5	VISITE	8\n"+
			"SKT_COL_DESC,2\n"+
			"0	0	3	11	1\n"+
			"0	4	4	15	1\n"+
			"CI_DESC,4\n"+
			"0	0	0	0	1\n"+
			"1	3	3	11	1\n"+
			"2	4	4	15	1\n"+
			"3	5	5	20	1\n"+
			"";

}
