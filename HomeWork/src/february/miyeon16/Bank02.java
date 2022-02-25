package february.miyeon16;

public class Bank02
{		

	//Field
	int balance ;
	String bankName  ;
	String userName ;
	int money ;

	//=====================
		public Bank02(){
		 System.out.println("Constructor");
		}



	//================================
	//초기화 생성자
	public Bank02(String s1, String s2){
		userName = s1 ;
		bankName = s2 ;
		System.out.println( userName + "님의 주거래 은행은 " + bankName + "입니다.");
		System.out.println( "현재 " + balance + "원 있습니다.");
	}

	public Bank02(String s1, String s2, int i, int j){
		userName = s1 ;
		bankName = s2 ;
		money = j;
		if( i == 1){
			balance += money;
			System.out.println(money + "원을 입금함");
		}else if( i ==2){
			balance -= money;
			System.out.println(money + "원을 출금함");
		}
		System.out.println( userName + "님의 주거래 은행은 " + bankName + "입니다.");
		System.out.println( "현재 " + balance + "원 있습니다.");
	}
	//=========================================
	// 행위 method
/*		public int deposit(int i){
		System.out.println("입력한 금액만큼 출금하는 행위");
		// 1:입금. 2:출금
		if( i == 1 ){
			balance += money;
			System.out.println(money + "원을 입금함");
			
		}else if( i == 2 ){
			balance -= money;
			System.out.println(money + "원을 출금함");
		
		}

*/	//================================================
	//getter
	public String getUserName(){
		return userName;
	}

	public String getBankName(){
		return bankName;
	}

	public int getBalance(){
		return balance;
	}

	public int getMoney(){
		return money;
	}

	//main method
	public static void main(String[] args){
	  Bank02 bank = new Bank02("홍길동", "한미은행");
	  System.out.println("========================================");
	  Bank02 bank01 = new Bank02("홍길동", "한미은행", 1, 100);
	  System.out.println("========================================");
	  Bank02 bank02 = new Bank02("홍길동", "하나은행", 2, 100);
	  System.out.println("========================================");

	}//main
	
}//class
