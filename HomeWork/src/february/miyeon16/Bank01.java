package february.miyeon16;

public class Bank01{
	
	public static void main(String[] args){
	//Bank.class�� instanceȭ ��.
	Bank bank = new Bank();
	
	System.out.println("�̸� : " + bank.userName);
	System.out.println("�ŷ����� : " + bank.bankName);
	System.out.println("����� �ݾ� : " + bank.money);
	System.out.println("�� �ܾ� : " + bank.balance);

	System.out.println("=====================");
	//����ϱ�.
	bank.money = 100;
	bank.deposit(2);
	System.out.println("��� �ݾ���? " + bank.money);
	System.out.println("�ܾ��� ? " + bank.balance);
	}//main
}//class
