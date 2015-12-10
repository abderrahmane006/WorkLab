package order;

public class GetMyParameterOrder extends Order {
	private int userGID;

	public GetMyParameterOrder(int numCommand, int userGID) {
		super(numCommand);
		this.userGID = userGID;
	}

	public int getUserGID() {
		return userGID;
	}

	public void setUserGID(int userGID) {
		this.userGID = userGID;
	}
}
