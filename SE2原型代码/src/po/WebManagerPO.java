package po;

public class WebManagerPO {
	//	������Ա���
	private String userID;
	//	����
	private String password;
	
	
	public WebManagerPO(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}
	
	
	public String getUserID() {
		return userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
