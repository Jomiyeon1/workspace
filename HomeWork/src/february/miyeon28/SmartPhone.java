package february.miyeon28;

public class SmartPhone extends CellPhone{
	//Field
	private boolean isMonthlyFixedRate = false;
	private int monthlyFixedFee = 0;
	
	//Constructor
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);	
	}
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
			super(phoneNumber, feePerCallTime);
			this.isMonthlyFixedRate = isMonthlyFixedRate;
			this.monthlyFixedFee = monthlyFixedFee;		
	}
	
	
	//get, set
	public boolean getiIsMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}
	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}
	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}
	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	//Method(O/R)
	public int calculationTotalFee() {
     
		if(isMonthlyFixedRate) {
			setTotalFee(monthlyFixedFee);
			System.out.println("������ " + monthlyFixedFee + " ���� ����� �Դϴ�.");
			
		}else {
			
			super.calculationTotalFee();
		}
		return getTotalFee();
	}
	
}//end of class
