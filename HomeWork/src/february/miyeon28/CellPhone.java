package february.miyeon28;

public class CellPhone {
	
	//Field
	private String phoneNumber = null; //�ڵ��� ��ȣ
	private int totalCallTime = 0; // �� ��ȭ�ð�
	private int feePerCallTime = 0; // �ܰ�
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
		// �ڵ��� ��ȣ�� ��ȭ�ð��� �Է¹޾� ����ȭ�ð� ��ȯ
		this.totalCallTime += callTime;
		System.out.println(phoneNumber + " ��ȣ�� " + callTime + " ��ȭ��.");
		return totalCallTime;
	}

	public int calculationTotalFee() {
		
		totalFee = totalCallTime * feePerCallTime;
		return totalFee;
	}
	// ����� ���
}//end of class
