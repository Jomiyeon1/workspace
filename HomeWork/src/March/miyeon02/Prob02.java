package March.miyeon02;

import java.util.HashMap;
import java.util.Map;

public class Prob02 {
	
	public static String getParameter(String url, String paramName) {
		Map<String, String> map = new HashMap<>(); 
		int index = url.indexOf('?');
		String str = url.substring((index+1),url.length());
		String[] temp = str.split("&");
		
		for(int i = 0; i <temp.length; i++) {
			if(temp[i].startsWith(paramName)) {
				String temp2[] = temp[i].split("=");
				//String temp2[] = temp[i+1].split("=");
				map.put(temp2[0], temp2[1]);
				//System.out.println(temp2[i-1]);			
			}
		}	
		String result = map.get(paramName);
		
		return result;
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
