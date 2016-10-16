package po;

public class OrderPO {
	//	�������
	private String orderID;
	//	�Ƶ���
	private String hotelName;
	//	�Ƶ��ַ
	private String hotelAddress;
	//	Ԥ���۸�
	private int price;
	//	��������ʱ��
	private String createTime;
	//	��סʱ��
	private String checkInTime;	
	//	�˷�ʱ��
	private String checkOutTime;
	//	������ִ��ʱ��
	private String expectExecuteTime;	
	//	Ԥ���뿪ʱ��
	private String expectLeaveTime;	
	//	����״̬
	private String state;
	//	��������
	private String roomType;
	//	������
	private int roomNum;
	//	�����
	private String roomNumber;
	//	��ס������
	private String name;	
	//	��ϵ��ʽ
	private String phone;
	//	�ر�Ҫ��
	private String message;
	public OrderPO(String orderID, String hotelName, String hotelAddress,int price, String createTime, String expectExecuteTime,
			String expectLeaveTime, String roomType, int roomNum, String name, String phone, String message) {
		super();
		this.orderID = orderID;
		this.hotelAddress = hotelAddress;
		this.hotelName = hotelName;
		this.price = price;
		this.createTime = createTime;
		this.expectExecuteTime = expectExecuteTime;
		this.expectLeaveTime = expectLeaveTime;
		this.roomType = roomType;
		this.roomNum = roomNum;
		this.name = name;
		this.phone = phone;
		this.message = message;
	}
	public String getOrderID() {
		return orderID;
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
	public String getCreateTime() {
		return createTime;
	}
	public String getCheckInTime() {
		return checkInTime;
	}
	public String getCheckOutTime() {
		return checkOutTime;
	}
	public String getExpectExecuteTime() {
		return expectExecuteTime;
	}
	public String getExpectLeaveTime() {
		return expectLeaveTime;
	}
	public void setExpectLeaveTime(String expectLeaveTime) {
		this.expectLeaveTime = expectLeaveTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRoomType() {
		return roomType;
	}
	public int getRoomNum() {
		return roomNum;
	}
	
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}

	public String getMessage() {
		return message;
	}

}
