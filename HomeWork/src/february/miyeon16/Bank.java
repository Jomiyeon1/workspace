package february.miyeon16;

public class Bank 
{
	//Field
	int balance = 0 ;
	String bankName = "한미은행" ;
	String userName = "홍길동";
	int money = 0;

	public int deposit(int i){
		System.out.println("입력한 금액만큼 출금하는 행위");
		// 1:입금. 2:출금
		if( i == 1 ){
			balance += money;
			System.out.println(money + "원을 입금함");
			
		}else if( i == 2 ){
			balance -= money;
			System.out.println(money + "원을 출금함");
		
		}
		return balance;
	} // deposit
	
	// 값 초기화
	public Bank(String s1, String s2){
		userName = s1 ;
		bankName = s2 ;
		System.out.println( s1 + "님의 주거래은행은 " + s2 + "입니다.");
		System.out.println( "현재 잔액은 " + balance +"원 입니다.");
	}

	public Bank(String s1, String s2, int i, int j){
		userName = s1 ;
		bankName = s2 ;
		deposit(i);
		money = j;
			System.out.println(userName + "님의 주거래은행은" + bankName +"입니다.");
			System.out.println( "현재 잔액은 " + balance +"원 입니다.");
	}



	// getter method

	public String getUserName(){
		System.out.println("유저 이름을 전달");
		return userName;
	}	

	public String getBankName(){
		System.out.println("은행 이름을 전달");
		return bankName;
	}

	public int getBalance(){
		System.out.println("잔액을 전달");
		return balance;
	}

	public int getMoney(){
		System.out.println("거래할 금액을 전달");
		return money;
	}

	
}//class
