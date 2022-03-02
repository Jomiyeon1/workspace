package March.miyeon02;

public class Prob01 {

	public String toEncoding(String str) {
		//���� ���� ���� ����
		String value = "";
		

		for(int i = 0; i < str.length() ; i++) {
			//�ѱ��ھ� ����.
			char c = str.charAt(i);
			if( (c >= 'A' && c <= 'z') || (c >= '0' && c <= '9')||c == ' ') {
				value += c;
			
			//�ѱ��̶��? 16������ ��ȯ�ؼ� ����. !) ��� �빮�ڷ� �ٲ� ��. .toUpperCase()
		//	}else if( c == ' ') {
				value += "";
			}else {//end of if
				// temp�� ������ c���� ���, 16������ ��ȯ�� byte[]�� ��´�.
				String temp = c+"";
				byte[] encoding = temp.getBytes();
				//��ȯ�� �� ����� ���� value�� ��´�.
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
