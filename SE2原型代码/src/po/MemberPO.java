package po;

public class MemberPO {
	//	�û����	
	private String guestID;
	//	��Ա�ȼ�	
	private String memberLevel;
	
	//	��Ա����
	private String birthday;
	//	��Ա��ҵ����
	private String enterprise;
	
	public MemberPO(String guestID, String memberLevel, String birthday, String enterprise) {
		super();
		this.guestID = guestID;
		this.memberLevel = memberLevel;
		this.birthday = birthday;
		this.enterprise = enterprise;
	}
	
	public String getGuestID() {
		return guestID;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}	

	
	
}
