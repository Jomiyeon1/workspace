package february.miyeon14;

import java.util.Scanner;

public class Prob03 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1���� ũ�� 10���� ���� ������ �Է��ϼ���.");

		int inputInt = keyboard.nextInt();

		int a = 1;
		
		
		if(inputInt < 1 || inputInt > 10){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�..");
			return;
		}//if
		for(int i = 1; i < inputInt+1 ; i++){
			a = a * i;
			System.out.println( i + "! = " + a ); 
			
		}//for

	}//main
}//class
