package february.miyeon14;

import java.util.Scanner;

public class Prob01 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1���� ũ�� 10���� ���� ������ �Է��ϼ���. :");
		int inputInt = keyboard.nextInt();
		

		// 2 ~ 9 ������ ���� �Է¹ޱ�.
		// ������ ��� ������ ��� "�߸��� ���ڰ� �ԷµǾ����ϴ�." ��� �� ����.
		if (inputInt < 2 || inputInt > 9)
		{
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�. ���α׷��� ����˴ϴ�.");
			return;
		}
			System.out.println(inputInt +"���� ����մϴ�.");
		
		//�Է¹��� ���� ���� ������ ����ϱ�.
		for(int i = 1; i < 10 ; i++){
				System.out.println(inputInt + " * " + i + " = " + (inputInt * i));		
	
		}//for


		
	}//main
}//class
