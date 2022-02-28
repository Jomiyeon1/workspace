package March.miyeon02;

public class Prob01 {

	public String toEncoding(String str) {
		byte[] temp = str.getBytes();
		return null;
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
