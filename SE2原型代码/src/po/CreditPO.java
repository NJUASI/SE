package po;

public class CreditPO {
	//	����ֵ����ʱ��
	private String time;
	//	�������
	private String orderID;
	//	�仯ǰ����ֵ
	private int preCredit;
	//	�仯������ֵ
	private String credit;
	//	�仯ԭ�� ������
	private String reason;
	
	public CreditPO(String time, String orderID, int preCredit, String credit, String reason) {
		super();
		this.time = time;
		this.orderID = orderID;
		this.preCredit = preCredit;
		this.credit = credit;
		this.reason = reason;
	}
	
	public String getTime() {
		return time;
	}
	public String getOrderID() {
		return orderID;
	}
		public int getPreCredit() {
		return preCredit;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
