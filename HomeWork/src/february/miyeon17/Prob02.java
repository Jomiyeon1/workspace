package february.miyeon17;

public class Prob02 {
	public int abs(int num1, int num2){
		// ������� ����� ��ȯ���ֱ�.
		if(num1 < 0){
			num1 = num1 * (-1);
		}
		if(num2 < 0){
			num2 = num2 * (-1);	
		}

		// �μ��� �� ���ϱ�.
		 if(num1 > num2){
			return (num1 - num2);
		 }else if(num2 > num1){
			return (num2 - num1);	
		 }else{ // ���� ���ٸ�? 0 ���.
			return 0;
		 }
	}/// end of abs
	




	///main
	public static void main(String[] args) 
	{
		int num1 = 6;
		int num2 = 15;

		Prob02 prob = new Prob02();
		System.out.println("�μ��� ���� " + prob.abs(num1, num2));

	}///end of main 

} ///end of class
