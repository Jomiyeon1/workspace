package february.miyeon28;

public class Prob01 {
	//method
	private static String[] stringSplit(String str1, String str2) {

		int count = 0;
		int start = 0;
		int end = str1.indexOf(str2);
		
		for(int i = 0; i < str1.length(); i++) {
			
			char c = str1.charAt(i);

			if(c == str2.charAt(0)) {
				count ++;
				
			}

		}
			
			String[] result = new String[count+1];
			
			for(int j = 0; j < result.length; j++) {
				String s = str1.substring(start, end);
				result[j] = s;
				start = end+1;
				int index = str1.indexOf(str2, start+1);
				if(index == -1) {
					end = str1.length() -1;
				}else {
					end = index;
				}
				
			}
		
		return result;
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
