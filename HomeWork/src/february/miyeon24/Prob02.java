package february.miyeon24;

public class Prob02{
	//method
	public String leftPad(String str, int size, char padChar){
		
		// 입력받은 수보다 문자열길이가 길다면 문자열 전부 출력.
		if(str.length() > size){
			return str;
		}
		
		String result = "";
		
		for(int i = 0; i < (size - str.length()); i++){
			result += padChar;
		}
			result += str;

		return result;
		
	}//end of method


	//main
	public static void main(String args[]){
		
		Prob02 prob03 = new Prob02();

		System.out.println(prob03.leftPad("ABC",6,'#'));
		System.out.println(prob03.leftPad("ABC",5,'$'));
		System.out.println(prob03.leftPad("ABC",2,'&'));

	}//end of main
}//end of class