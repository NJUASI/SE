package po;

public class GeneralHotelPO {
	//	�Ƶ�����
	private String hotelName;
	//	�Ƶ����
	private String city;
	//	�Ƶ��Ǽ�
	private String level;
	//	����
	private int score;

	public GeneralHotelPO(String hotelName, String city, String level, int score) {
		super();
		this.hotelName = hotelName;
		this.city = city;
		this.level = level;
		this.score = score;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	
}
