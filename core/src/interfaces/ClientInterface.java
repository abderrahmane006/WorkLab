package interfaces;

import message.GetMyParameter;
import order.GetMyParameterOrder;
import beansAfrica.MyParameter;

public class ClientInterface {
	public static void STORE_TABLE1( int userGID, MyParameter myInfo) {
		GetMyParameter.getUser(userGID, myInfo);
	}
}
