package february.miyeon14;

import java.util.Scanner;

public class Prob01 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1보다 크고 10보다 작은 정수를 입력하세요. :");
		int inputInt = keyboard.nextInt();
		

		// 2 ~ 9 사이의 숫자 입력받기.
		// 범위를 벗어난 정수일 경우 "잘못된 숫자가 입력되었습니다." 출력 후 종료.
		if (inputInt < 2 || inputInt > 9)
		{
			System.out.println("잘못된 숫자가 입력되었습니다. 프로그램이 종료됩니다.");
			return;
		}
			System.out.println(inputInt +"단을 출력합니다.");
		
		//입력받은 숫자 단의 구구단 출력하기.
		for(int i = 1; i < 10 ; i++){
				System.out.println(inputInt + " * " + i + " = " + (inputInt * i));		
	
		}//for


		
	}//main
}//class
