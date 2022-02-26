package february.miyeon28;

public class CellPhone {
	
	//Field
	private String phoneNumber = null; //핸드폰 번호
	private int totalCallTime = 0; // 총 통화시간
	private int feePerCallTime = 0; // 단가
	private int callTime = 0;
	private int totalFee = 0;
	
	//Constructor
	public CellPhone() {
		// TODO Auto-generated constructor stub
	}
	
	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;	
	}
		
	
	//getter / setter
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTotalCallTime() {
		return totalCallTime;
	}

	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime += callTime;
	}

	public int geteePerCallTime() {
		return feePerCallTime;
	}

	public int getCallTime() {
		return callTime;
	}
	public void setCallTime(int callTime) {
		this.callTime = callTime;
	}
	
	public int getFeePerCallTime() {
		return feePerCallTime;
	}

	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	//Method
	public int call(String phoneNumber, int callTime) {
		// 핸드폰 번호와 통화시간을 입력받아 총전화시간 반환
		this.totalCallTime += callTime;
		System.out.println(phoneNumber + " 번호로 " + callTime + " 통화함.");
		return totalCallTime;
	}

	public int calculationTotalFee() {
		
		totalFee = totalCallTime * feePerCallTime;
		return totalFee;
	}
	// 사용요금 계산
}//end of class
