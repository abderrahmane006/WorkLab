package message;

import java.net.Socket;
import order.GetMyParameterOrder;
import order.Order;
import tools.Constants;
import tools.IOStreams;
import beansAfrica.MyParameter;

public class GetMyParameter {

	/**
	 * Get the files' descriptions
	 * @return the list of the files' description, as a String
	 */
	
	public static MyParameter getUser(int userGID, MyParameter myInfo) {
		/**
		 * getUser
		 * @param userGID
		 * @param myInfo
		 */

		MyParameter param = null;
		try {
			/* socket connection to my TCELL */
			Socket socket = new Socket(myInfo.getMyTcellIp(), myInfo.getMyTcellPort());
			IOStreams stream = new IOStreams(socket);

			/* get the user from the TCELL */
			Order getParameterCommand = new GetMyParameterOrder(Constants.CMD_STORE_TABLE1,
					userGID);
			stream.getOutputStream().writeObject(getParameterCommand);
			param = (MyParameter) stream.getInputStream().readObject();

			stream.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return param;
	}
	
}
