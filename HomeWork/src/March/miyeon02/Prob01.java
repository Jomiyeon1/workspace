package March.miyeon02;

public class Prob01 {

	public String toEncoding(String str) {
		byte[] temp = str.getBytes();
		return null;
	}//end of method
	
	//main
	public static void main(String[] args) {
		Prob01 p1 = new Prob01();
		System.out.println("�Է� : Korea");
		System.out.println("��� : " + p1.toEncoding("Korea"));
		System.out.println("�Է� : ȫ�浿");
		System.out.println("��� : " + p1.toEncoding("ȫ�浿"));
		System.out.println("�Է� : ȫ �� ��");
		System.out.println("��� : " + p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է� : Hong �� ��");
		System.out.println("��� : " + p1.toEncoding("Hong �� ��"));
		System.out.println("�Է� : 0319");
		System.out.println("��� : " + p1.toEncoding("0319"));
		

	}//end of main

}//end of class
