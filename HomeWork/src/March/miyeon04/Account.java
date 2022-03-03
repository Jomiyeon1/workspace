package March.miyeon04;

public class Account {
	
	//Field =================================================
	private String accountNo = null;
	private boolean creditLine = false;
	private int creditLineLimit = 0;
	private int balance = 0;

	
	
	//Constructor=================================================

	public Account() {

	}
	
	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;
		this.balance = balance;		
		//System.out.println(" 계좌번호 : " + accountNo + ", " + "잔고 : " + balance);
	}
	



	//getter, setter =================================================
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balace) {
		this.balance = balace;
	}


	
	//method====================================================
	public int withdraw(int money) throws Exception{
		if( balance < creditLineLimit || balance < money) {
//			try {
				Exception e = new Exception("잔고부족 출금불가입니다.");
//			}catch (Exception e) {
				System.out.print(e.getMessage());
//			}
		}else
			
			//=================
			balance -= money;
			return balance;
	}
	
	public int deposit(int money) {
		balance += money;
		return balance;
	}
	
	// OverRading
	
	public String toString() {
//		if(balance < creditLineLimit) {
//			return "";
/*		}else*/ if(creditLine) {
			return " 계좌번호 : " + accountNo + ", " + "잔고 : " + balance + "\t[[ " + (-creditLineLimit) + "원 마이너스 통장 ]]";	
		}else{
			return " 계좌번호 : " + accountNo + ", " + "잔고 : " + balance;
		}
		//마이너스 통장 정보는.. 마이너스 통장이 있을때만 출력되도록 수정할 것.
	}//end of toString() O/R
		
	
}//end of class
