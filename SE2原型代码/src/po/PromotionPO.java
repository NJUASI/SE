package po;

public class PromotionPO {
	//	�ۿ���
	private double discount;
	//	�ۿ۾Ƶ�
	private String hotelID;
	//	��ʼ����
	private String startDate;
	//	��������
	private String endDate;
	
	public PromotionPO(double discount, String hotelID, String startDate, String endDate) {
		super();
		this.discount = discount;
		this.hotelID = hotelID;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getHotelID() {
		return hotelID;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
