package february.miyeon16;

public class Bank 
{
	//Field
	int balance = 0 ;
	String bankName = "�ѹ�����" ;
	String userName = "ȫ�浿";
	int money = 0;

	public int deposit(int i){
		System.out.println("�Է��� �ݾ׸�ŭ ����ϴ� ����");
		// 1:�Ա�. 2:���
		if( i == 1 ){
			balance += money;
			System.out.println(money + "���� �Ա���");
			
		}else if( i == 2 ){
			balance -= money;
			System.out.println(money + "���� �����");
		
		}
		return balance;
	} // deposit
	
	// �� �ʱ�ȭ
	public Bank(String s1, String s2){
		userName = s1 ;
		bankName = s2 ;
		System.out.println( s1 + "���� �ְŷ������� " + s2 + "�Դϴ�.");
		System.out.println( "���� �ܾ��� " + balance +"�� �Դϴ�.");
	}

	public Bank(String s1, String s2, int i, int j){
		userName = s1 ;
		bankName = s2 ;
		deposit(i);
		money = j;
			System.out.println(userName + "���� �ְŷ�������" + bankName +"�Դϴ�.");
			System.out.println( "���� �ܾ��� " + balance +"�� �Դϴ�.");
	}



	// getter method

	public String getUserName(){
		System.out.println("���� �̸��� ����");
		return userName;
	}	

	public String getBankName(){
		System.out.println("���� �̸��� ����");
		return bankName;
	}

	public int getBalance(){
		System.out.println("�ܾ��� ����");
		return balance;
	}

	public int getMoney(){
		System.out.println("�ŷ��� �ݾ��� ����");
		return money;
	}

	
}//class
