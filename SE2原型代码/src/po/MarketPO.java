package po;

public class MarketPO {
	//	�ȼ�����
	private String marketName;
	//	�ȼ����ö�
	private int marketCredit;
	//	�ȼ��Ż�
	private String marketBenefit;
	
	public MarketPO(String marketName, int marketCredit, String marketBenefit) {
		super();
		this.marketName = marketName;
		this.marketCredit = marketCredit;
		this.marketBenefit = marketBenefit;
	}
	
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public int getMarketCredit() {
		return marketCredit;
	}
	public void setMarketCredit(int marketCredit) {
		this.marketCredit = marketCredit;
	}
	public String getMarketBenefit() {
		return marketBenefit;
	}
	public void setMarketBenefit(String marketBenefit) {
		this.marketBenefit = marketBenefit;
	}
	
}
