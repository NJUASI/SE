package po;

public class GeneralOrderPO {
	
	//		�Ƶ���
	private String hotelName;
	//		�Ƶ��ַ
	private String hotelAddress;
	//		Ԥ���۸�
	private int price;
	//	������ִ��ʱ��
	private String expectExecuteTime;	
	//	Ԥ���뿪ʱ��
	private String expectLeaveTime;	
	//		����״̬
	private String state;
	
	public GeneralOrderPO(String hotelName, String hotelAddress, int price, String expectExecuteTime, String expectLeaveTime,
			String state) {
		super();
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.price = price;
		this.expectExecuteTime = expectExecuteTime;
		this.expectLeaveTime = expectLeaveTime;
		this.state = state;
	}
	
	
	public String getHotelName() {
		return hotelName;
	}
	
	public String getHotelAddress() {
		return hotelAddress;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getExpectExecuteTime() {
		return expectExecuteTime;
	}


	public String getExpectLeaveTime() {
		return expectLeaveTime;
	}


	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
