package March.miyeon02;

public class Prob01 {

	public String toEncoding(String str) {
		//값을 담을 변수 선언
		String value = "";
		

		for(int i = 0; i < str.length() ; i++) {
			//한글자씩 추출.
			char c = str.charAt(i);
			if( (c >= 'A' && c <= 'z') || (c >= '0' && c <= '9')||c == ' ') {
				value += c;
			
			//한글이라면? 16진수로 변환해서 담자. !) 모두 대문자로 바꿀 것. .toUpperCase()
		//	}else if( c == ' ') {
				value += "";
			}else {//end of if
				// temp에 추출한 c값을 담고, 16진수로 변환해 byte[]에 담는다.
				String temp = c+"";
				byte[] encoding = temp.getBytes();
				//변환한 값 출력을 위해 value에 담는다.
				for(int j = 0; j < encoding.length; j++) {
					value += "%"+Integer.toHexString(encoding[j]).toUpperCase().substring(6);
			
				}
				 
			
			}//else
			
		}//end of for i
		return value;
	}//end of method
	
	//main
	public static void main(String[] args) {
		Prob01 p1 = new Prob01();
		System.out.println("입력 : Korea");
		System.out.println("출력 : " + p1.toEncoding("Korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 : " + p1.toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : " + p1.toEncoding("홍 길 동"));
		System.out.println("입력 : Hong 길 동");
		System.out.println("출력 : " + p1.toEncoding("Hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : " + p1.toEncoding("0319"));
		

	}//end of main

}//end of class
