package february.miyeon16;

import java.util.Scanner;

public class Prob01{
	public static void main(String[] args) 
	{
		// 변수 선언 및 초기화
		int number = 0; // 입력받은 수
		int count = 0; // 배수의 갯수
		int sum = 0;   // 배수들의 합계
		
		// 정수 입력받기
		Scanner keyboard = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요 : ");
		number = keyboard.nextInt();

		// 1 ~ 1000 수 중에서 입력받은 정수의 배수의 개수/배수들의 합 출력

		// 1 ~ 1000값이 아닐경우
		if(number < 1 || number >1000){
			System.out.println("범위 밖의 값을 입력하셨습니다. 값을 출력할 수 없습니다.");
			return;
		}
		// 7의 배수를 가려내고,
		// 배수의 갯수와, 합을 구할 것.
		for(int i = number; i < 1001; i++){
			if(i % 7== 0){
				count++;
				sum += i;
			}
		}
		// 값 출력하기.
		System.out.println(number +"의 배수 갯수 = " + count);
		System.out.println(number +"의 배수 합 = " + sum);



	}//main
}//class
