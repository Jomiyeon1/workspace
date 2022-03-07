package february.miyeon28;

public class Prob01 {
	//method
	private static String[] stringSplit(String str1, String str2) {
		String[] str = new String[str1.length()] ;
		int count = 0;
		int start = 0;
		
		for(int i = 0; i < str1.length(); i++) {
			
			int end = str1.indexOf(str2);
			char c = str1.charAt(i);
			String a = String.valueOf(c);
			
			if(a == str2) {
				count ++;
			}
			
			String[] result = new String[count+1];
			
			for(int j = 0; i < result.length; j++) {
				String s = str1.substring(start, end);
				start = end + 1;
				int index = str1.indexOf(str2, start+1);
				
				result[i] = s;
				if(index == -1) {
					end = str1.length() -1;
				}else {
					end = index;
				}
				
			}
			return result;
		}
		return str;	
		
	}
	
	//main
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Dansung#3#6000000";
		String[] strs = stringSplit(str,"#");
		System.out.println("===문자열 처리 결과===");
		
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}

	}//end of main

}//end of class
