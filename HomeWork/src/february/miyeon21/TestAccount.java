package february.miyeon21;

//App
public class TestAccount{
	
//
	//main
	public static void main(String[] args) throws Exception{
		String accNo = null;
		int balance = 0;

		//Acocount accObj = new Account();
		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");



	}
}//end of class



