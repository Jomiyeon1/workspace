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
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");



	}
}//end of class



