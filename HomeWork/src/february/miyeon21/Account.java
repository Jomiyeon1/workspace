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
		System.out.println(accNo + " ���°� �����Ǿ����ϴ�.");
	}
	public void setAccNo(String accNO){
		this.accNo = accNo;
	}
	//getter method
	///���¹�ȣ
	public String getAccNo(){
		return accNo;
	}
	//�ܾ�
	public int getBalance(){
		return balance;
	}

	//save method
	public void save(int balance){
		this.balance += balance;
		System.out.println(accNo + " ���¿�" + balance+"������ �ԱݵǾ����ϴ�." );		
	}
	
	//deposit method
	public void deposit(int balance){
		this.balance -= balance;
		System.out.println(accNo + " ���¿�" + balance+"������ ��ݵǾ����ϴ�." );	
		
	}


}