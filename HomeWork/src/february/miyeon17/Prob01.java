package february.miyeon17;

import java.util.Scanner;

public class Prob01
{
	public static void main(String[] args) 
	{
		// ���α׷� ���� �� ����� �Ű������� �Է¹��� ���ڸ� �̿��Ͽ�
		// �ش� ���ڸ� �������� ���ﰢ�� ����� '*'�� �ܼ�â�� ����Ͻÿ�.
		//1. ���ڸ� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.println("0���� ū Ȧ���� �Է����ּ���. >> ");
		int i = sc.nextInt();

		// �߸��� �� �ɷ��ֱ�.
		if(i < 1 || i % 2 == 0){
			System.out.println("0���� ū Ȧ���� �Է� �����մϴ�.");
			return; // =>System.exit(0);
		}
		//2. ������ ������ŭ * ��� �� �� ����(println)�� -2�� ��ŭ�� �� ��� && ��� ����.

		// int i = �Է� ���� ��.
		// int j = ������.(�Է¹��� ���� ���� ��)
		int j = i;
		for(int k = 0; k < j; k++){
			for (int l = 1; l <= k; l++){ 
			System.out.print(" ");
			}
		
		for(int n = 0; n < i; n++){
			System.out.print("*");
		}// for�� n
		
		i -= 2;
		
		//�ݺ����� ������ �ٳ�������.
		System.out.print("\n");

		}//for�� k
		
		
	}///main
}///class
