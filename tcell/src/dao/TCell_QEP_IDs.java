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
		public static final int EP_insertPRATICIEN = EP_QEP.EP_QEP_INSERT + 1;
		public static final int EP_insertANTECEDENTMED = EP_insertPRATICIEN + 1;
		public static final int EP_insertPatient = EP_insertANTECEDENTMED + 1;
		public static final int EP_insertVisite = EP_insertPatient + 1;
		public static final int EP_insertMyParameter = EP_insertVisite + 1;
		
		public static final int EP_getMyParameter = EP_insertMyParameter + 1;
		public static final int EP_getAllPRATICIEN= EP_getMyParameter + 1;
		public static final int EP_getInfoPatient = EP_getAllPRATICIEN + 1;
		public static final int EP_getAllViste = EP_getInfoPatient + 1;
		public static final int EP_getANTECEDENTMED  = EP_getAllViste  + 1;
		
		public static final int EP_GetUnstoredPatient = EP_getANTECEDENTMED + 1;
		public static final int EP_GetUnstoredANTECEDENTMED = EP_GetUnstoredPatient + 1;
		public static final int EP_GetUnstoredVisite = EP_GetUnstoredANTECEDENTMED + 1;
		public static final int EP_GetUnstoredMyParameter  = EP_GetUnstoredVisite + 1;
		public static final int EP_GetUnstoredPracticien  = EP_GetUnstoredMyParameter + 1;
		
		public static final int EP_PRINTMyParameter  = EP_GetUnstoredPracticien  + 1;
		public static final int EP_PRINTAllPRATICIEN = EP_PRINTMyParameter  + 1;
		public static final int EP_PRINTInfoPatient = EP_PRINTAllPRATICIEN + 1;
		public static final int EP_PRINTAllViste  = EP_PRINTInfoPatient + 1;
		public static final int EP_PRINTANTECEDENTMED  = EP_PRINTAllViste + 1;
		
		public static final int EP_UpdateViste  = EP_PRINTANTECEDENTMED   + 1;
		public static final int EP_UpdatePatient = EP_UpdateViste  + 1;
		public static final int EP_UpdateANTECEDENTMED  = EP_UpdatePatient + 1;
		public static final int EP_UpdatePracticien  = EP_UpdateANTECEDENTMED  + 1;
		public static final int EP_UpdateMyParameter  = EP_UpdatePracticien + 1;
	}
}
