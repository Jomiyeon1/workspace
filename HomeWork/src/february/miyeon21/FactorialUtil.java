package february.miyeon21;

import java.util.Scanner;
//����� ������ �̻���
public class FactorialUtil{
	//method
	
		public int factorial(int n){
		
		// ����� �Է¹ޱ�.
		if( n < 1 ){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�..");
			System.exit(0);
		}
		//��µǾ��� ����
		int result = 1;
		int number = n;
		
		for(int i = 1; i < n+1 ; i++){
			result = i * result;
			//���� ��ȣ ���.
				if(number == n){
					System.out.print("(");
			    }

			// 5 * 4 * 3 * 2 * 1 ���
			//������ * ����. number == 1 �϶� ��¾���.
			if(number > 1){
				System.out.print( number + "*");
			}else{
				System.out.print(number);
			}
			number--;
			//������ ��ȣ ���	
				if(number == 0){
					System.out.print(") = ");
				}
		}
		return result;
	}//end of method
	
	//main
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input���� �Է����ּ���.");
		//int n = keyboard.nextInt();
		
		FactorialUtil util = new FactorialUtil();
		System.out.print(util.factorial(keyboard.nextInt()));
	
	}//end of main

}//end of class