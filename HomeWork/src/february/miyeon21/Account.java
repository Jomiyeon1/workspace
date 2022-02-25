package february.miyeon21;

//Bean
public class Account{
	// Field
	String accNo;
	int balance;

	//Constructor
	public Account(){	
	}

	//setter method
	public Account(String accNo){
		this.accNo = accNo;
		System.out.println(accNo + " 계좌가 개설되었습니다.");
	}
	public void setAccNo(String accNO){
		this.accNo = accNo;
	}
	//getter method
	///계좌번호
	public String getAccNo(){
		return accNo;
	}
	//잔액
	public int getBalance(){
		return balance;
	}

	//save method
	public void save(int balance){
		this.balance += balance;
		System.out.println(accNo + " 계좌에" + balance+"만원이 입금되었습니다." );		
	}
	
	//deposit method
	public void deposit(int balance){
		this.balance -= balance;
		System.out.println(accNo + " 계좌에" + balance+"만원이 출금되었습니다." );	
		
	}


}