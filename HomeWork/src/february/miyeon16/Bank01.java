package february.miyeon16;

public class Bank01{
	
	public static void main(String[] args){
	//Bank.class를 instance화 함.
	Bank bank = new Bank();
	
	System.out.println("이름 : " + bank.userName);
	System.out.println("거래은행 : " + bank.bankName);
	System.out.println("출금할 금액 : " + bank.money);
	System.out.println("총 잔액 : " + bank.balance);

	System.out.println("=====================");
	//출금하기.
	bank.money = 100;
	bank.deposit(2);
	System.out.println("출금 금액은? " + bank.money);
	System.out.println("잔액은 ? " + bank.balance);
	}//main
}//class
