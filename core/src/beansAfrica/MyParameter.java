package beansAfrica;
/**
 * MyParameter records contains the
 *  TCell IP, the UserGID, the TCellPort, the PublicKey, and the PrivateKey of a device 
 *  @author TORKHANI Rami
 */
public class MyParameter {
	private int myGid;
	private String myTcellIp;
	private int myTcellPort;
	private String myPubKey;
	private String myPrivKey;
	
	//MyInfo Constructor
	public MyParameter(int myGid, String myTcellIp, int myTcellPort, String myPubKey, String myPrivKey) {
		this.myGid = myGid;
		this.myTcellIp = myTcellIp;
		this.myTcellPort = myTcellPort;
		this.myPubKey = myPubKey;
		this.myPrivKey = myPrivKey;
	}
	

	// Getter and setter
	public int getMyGid() {
		return myGid;
	}
	public void setMyGid(int myGid) {
		this.myGid = myGid;
	}
	public String getMyTcellIp() {
		return myTcellIp;
	}
	public void setMyTcellIp(String myTcellIp) {
		this.myTcellIp = myTcellIp;
	}
	public int getMyTcellPort() {
		return myTcellPort;
	}
	public void setMyTcellPort(int myTcellPort) {
		this.myTcellPort = myTcellPort;
	}
	public String getMyPubKey() {
		return myPubKey;
	}
	public void setMyPubKey(String myPubKey) {
		this.myPubKey = myPubKey;
	}
	public String getMyPrivKey() {
		return myPrivKey;
	}
	public void setMyPrivKey(String myPrivKey) {
		this.myPrivKey = myPrivKey;
	}
	
}
