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
	//�ʱ�ȭ ������
	public Bank02(String s1, String s2){
		userName = s1 ;
		bankName = s2 ;
		System.out.println( userName + "���� �ְŷ� ������ " + bankName + "�Դϴ�.");
		System.out.println( "���� " + balance + "�� �ֽ��ϴ�.");
	}

	public Bank02(String s1, String s2, int i, int j){
		userName = s1 ;
		bankName = s2 ;
		money = j;
		if( i == 1){
			balance += money;
			System.out.println(money + "���� �Ա���");
		}else if( i ==2){
			balance -= money;
			System.out.println(money + "���� �����");
		}
		System.out.println( userName + "���� �ְŷ� ������ " + bankName + "�Դϴ�.");
		System.out.println( "���� " + balance + "�� �ֽ��ϴ�.");
	}
	//=========================================
	// ���� method
/*		public int deposit(int i){
		System.out.println("�Է��� �ݾ׸�ŭ ����ϴ� ����");
		// 1:�Ա�. 2:���
		if( i == 1 ){
			balance += money;
			System.out.println(money + "���� �Ա���");
			
		}else if( i == 2 ){
			balance -= money;
			System.out.println(money + "���� �����");
		
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
	  Bank02 bank = new Bank02("ȫ�浿", "�ѹ�����");
	  System.out.println("========================================");
	  Bank02 bank01 = new Bank02("ȫ�浿", "�ѹ�����", 1, 100);
	  System.out.println("========================================");
	  Bank02 bank02 = new Bank02("ȫ�浿", "�ϳ�����", 2, 100);
	  System.out.println("========================================");

	}//main
	
}//class
