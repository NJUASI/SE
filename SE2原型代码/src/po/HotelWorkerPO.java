package po;

public class HotelWorkerPO {
	//	�Ƶ���
	private String hotelID;
	//	����
	private String password;
	//	�Ƶ�����
	private String hotelName;
	
	
	public HotelWorkerPO(String hotelID, String password) {
		super();
		this.hotelID = hotelID;
		this.password = password;
	}
	
	public String getHotelID() {
		return hotelID;
	}
//	public void setHotelID(String hotelID) {
//		this.hotelID = hotelID;
//	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
}
