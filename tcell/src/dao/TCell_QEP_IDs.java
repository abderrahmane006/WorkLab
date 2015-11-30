package dao;

public class TCell_QEP_IDs {
	/**
	 * author TORKHANI Rami
	 * EP_QEP class must exist in every application. It allows to interact
	 * hard coded QEPs inside SGBD. Application QEP start id should be greater
	 * than the value of last element of this class.
	 */
	public static class EP_QEP // 1
	{
		public static final int EP_QEP_INSERT = 0;
	}

	/* Application QEP ids */
	public static class QEP // 2
	{
		public static final int EP_insertMedecin = EP_QEP.EP_QEP_INSERT + 1;
		public static final int EP_insertPatient = EP_insertMedecin + 1;
		public static final int EP_insertVisite = EP_insertPatient + 1;
		public static final int EP_getAllMedecin = EP_insertVisite + 1;
		public static final int EP_getAllPatient = EP_getAllMedecin + 1;
		public static final int EP_getAllViste = EP_getAllPatient + 1;
		public static final int EP_getPrintAllMed = EP_getAllViste + 1;
		
	}
}
