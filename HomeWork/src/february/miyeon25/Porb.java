package february.miyeon25;

public class Porb {
	
	public static String myReplace(String str, char oldChar, char newChar) {
		
		String result = "";
		
		//변경할 문자열이 없을 경우 문자열 그대로 출력.
		if(str.indexOf(oldChar) < 1) {
			return str;
		}
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
						
			if(c == oldChar) {
				c = newChar;				
			}
			result += c;
		}
		  
		
		return result;
	}
	
	//main
	public static void main(String[] args) {
		
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("------ Sample 1 ------");
		String str1 = myReplace("hello world", 'l','*');
		System.out.println(str1);
				
		System.out.println("------ Sample 2 ------");
		String str2 = myReplace("hello world", ' ','-');
		System.out.println(str2);
		
		
		System.out.println("------ Sample 3 ------");
		String str3 = myReplace("hello world", 'a','*');
		System.out.println(str3);
	}

}
