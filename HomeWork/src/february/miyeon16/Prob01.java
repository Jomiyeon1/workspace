package february.miyeon16;

import java.util.Scanner;

public class Prob01{
	public static void main(String[] args) 
	{
		// ���� ���� �� �ʱ�ȭ
		int number = 0; // �Է¹��� ��
		int count = 0; // ����� ����
		int sum = 0;   // ������� �հ�
		
		// ���� �Է¹ޱ�
		Scanner keyboard = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ��� : ");
		number = keyboard.nextInt();

		// 1 ~ 1000 �� �߿��� �Է¹��� ������ ����� ����/������� �� ���

		// 1 ~ 1000���� �ƴҰ��
		if(number < 1 || number >1000){
			System.out.println("���� ���� ���� �Է��ϼ̽��ϴ�. ���� ����� �� �����ϴ�.");
			return;
		}
		// 7�� ����� ��������,
		// ����� ������, ���� ���� ��.
		for(int i = number; i < 1001; i++){
			if(i % 7== 0){
				count++;
				sum += i;
			}
		}
		// �� ����ϱ�.
		System.out.println(number +"�� ��� ���� = " + count);
		System.out.println(number +"�� ��� �� = " + sum);



	}//main
}//class
