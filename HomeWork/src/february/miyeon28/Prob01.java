package february.miyeon28;

public class Prob01 {
	//method
	private static String[] stringSplit(String str1, String str2) {
		String[] str = new String[str1.length()] ;
		

		for(int i = 0; i < str1.length(); i++) {
			int count = 0;
			char c = str1.charAt(i);
			String a = Character.toString(c);
			// ������ char�� str2�� ���ٸ�, count++
			if(a == str2) {
				count++;
				// str2�� ���� ���ڰ� ���Դٸ�?
				if(count > 0) {
					
				}
			}else{
				for(int j = 0; j < i; j++) {
				str[j] += a;
				}
			}
			System.out.println("");
		} //end of for i
		
		return str;
	}
	
	//main
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Dansung#3#6000000";
		String[] strs = stringSplit(str,"#");
		System.out.println("===���ڿ� ó�� ���===");
		
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}

	}//end of main

}//end of class
