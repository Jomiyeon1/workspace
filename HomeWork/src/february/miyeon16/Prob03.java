public class Prob03
{
	public static void main(String[] args) 
	{
		//���� ���� �� �ʱ�ȭ
		int year = 2010;
		int month = 2;
		int maxDay = 0; // ���� 29�� �ƴϸ� 28��

		// 4�� ����� �ش� ���� 
		// => year % 4 == 0
		// 4�� ����̸鼭 100�� ����� �ش� ������ �ƴ�. 
		// => year % 4 ==0 && year % 100 ==0
		// 100�� ����̸鼭 400�� ����� �ش� ����. 
		// => year % 4 ==0 && year % 100 ==0 && year % 400 == 0
		
		// 4�� ����� �ƴ� ��� ���� �Ÿ���.
		if(year % 4 != 0){
			maxDay = 28;
			System.out.println(year + "�� " + month + "���� ������ " + maxDay + "�Դϴ�.");
			return;
		}

		if(year % 4 == 0){
			if(year % 100 == 0){
			maxDay = 28;
			System.out.println(year + "�� " + month + "���� ������ " + maxDay + "�Դϴ�.");
			return;
			}// 100�� ��� ���� �ƴ�. if
			if(year % 400 ==0){
				maxDay = 29;
				System.out.println(year + "�� " + month + "���� ������ " + maxDay + "�Դϴ�.");
				return;
			}// 400�� ����� ��� ����. if
		maxDay = 29;
		System.out.println(year + "�� " + month + "���� ������ " + maxDay + "�Դϴ�.");

		}// 4�� ����� ��� if

	}//main
}// class
