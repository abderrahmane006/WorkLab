package dao;

/**
 * author TORKHANI RAMI
 * This class contains the schema database
 */
public class Schema {
	public static final String META =
			"TAB_DESC,8\n"+
					"0	QEP	512\n"+
					"1	LogDeleted	12\n"+
					"2	UpdateLog	512\n"+
					"3	MyParameter	77\n"+
					"4	PATIENT	97\n"+
					"5	PRATICIEN	76\n"+
					"6	ANTECEDENTMED	97\n"+
					"7	VISITE	125\n"+
					"COL_DESC,50\n"+
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
					"12	3	MytCellIp	17	0	4\n"+
					"13	3	MytCellPort	4	1	21\n"+
					"14	3	MyPublicKey	24	9	25\n"+
					"15	3	MyPrivateKey	24	9	49\n"+
					"16	3	STORED	4	1	73\n"+
					"17	4	IdGlobal	4	1	0\n"+
					"18	4	Nom	17	0	4\n"+
					"19	4	Prenom	17	0	21\n"+
					"20	4	Age	4	1	38\n"+
					"21	4	Sexe	17	0	42\n"+
					"22	4	NiveauIntel	17	0	59\n"+
					"23	4	Profession	17	0	76\n"+
					"24	4	STORED	4	1	93\n"+
					"25	5	IdGlobal	4	1	0\n"+
					"26	5	Nom	17	0	4\n"+
					"27	5	Prenom	17	0	21\n"+
					"28	5	Grade	17	0	38\n"+
					"29	5	Poste	17	0	55\n"+
					"30	5	STORED	4	1	72\n"+
					"31	6	IdGlobal	4	1	0\n"+
					"32	6	IdPatient	4	1	4\n"+
					"33	6	DateFirstCon	17	0	8\n"+
					"34	6	DateInsuline	17	0	25\n"+
					"35	6	ConsoAlc	17	0	42\n"+
					"36	6	ConsoTab	17	0	59\n"+
					"37	6	AccidentVS	17	0	76\n"+
					"38	6	STORED	4	1	93\n"+
					"39	7	IdGlobal	4	1	0\n"+
					"40	7	IdPatient	4	1	4\n"+
					"41	7	IdPRATICIEN	4	1	8\n"+
					"42	7	DateVI	17	0	12\n"+
					"43	7	Poid	17	0	29\n"+
					"44	7	Taille	7	0	46\n"+
					"45	7	IMC	17	0	53\n"+
					"46	7	TDT	17	0	70\n"+
					"47	7	TG	17	0	87\n"+
					"48	7	Insuline	17	0	104\n"+
					"49	7	STORED	4	1	121\n"+
					"FK_DESC,3\n"+
					"6	32	4	17\n"+
					"7	40	4	17\n"+
					"7	41	5	25\n"+
					"SKT_DESC,2\n"+
					"0	7	VISITE	8\n"+
					"1	6	ANTECEDENTMED	4\n"+
					"SKT_COL_DESC,3\n"+
					"0	0	5	25	1\n"+
					"0	4	4	17	1\n"+
					"1	0	4	17	1\n"+
					"CI_DESC,6\n"+
					"0	0	0	0	1\n"+
					"1	3	3	11	1\n"+
					"2	4	4	17	1\n"+
					"3	5	5	25	1\n"+
					"4	6	6	31	1\n"+
					"5	7	7	39	1\n"+
					"";
}
