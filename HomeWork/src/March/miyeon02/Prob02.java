package March.miyeon02;

public class Prob02 {
	
	public static String getParameter(String url, String paramName) {
		
		return null;
	}//end of method
	
	//main
	public static void main(String[] args) {
		String url1 = "http://localhost/order?prodId=PROD_001&prodName=갤럭시3&price=980000";
		
		String prodName = getParameter(url1,"prodName");
		System.out.println("제품이름 : " + prodName);
		
		String url2 = "http://localhost/registUser?userId=USER_001&userName=홍길동&address=서울시강남구&userAge=26";

		String userAddress = getParameter(url2,"address");
		System.out.println("회원 주소 : " + userAddress);
		
	}//end of main

}//end of class
