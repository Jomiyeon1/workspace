package March.miyeon02;

public class Prob02 {
	
	public static String getParameter(String url, String paramName) {
		
		return null;
	}//end of method
	
	//main
	public static void main(String[] args) {
		String url1 = "http://localhost/order?prodId=PROD_001&prodName=������3&price=980000";
		
		String prodName = getParameter(url1,"prodName");
		System.out.println("��ǰ�̸� : " + prodName);
		
		String url2 = "http://localhost/registUser?userId=USER_001&userName=ȫ�浿&address=����ð�����&userAge=26";

		String userAddress = getParameter(url2,"address");
		System.out.println("ȸ�� �ּ� : " + userAddress);
		
	}//end of main

}//end of class
