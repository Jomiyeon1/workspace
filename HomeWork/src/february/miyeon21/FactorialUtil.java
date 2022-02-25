package february.miyeon21;

import java.util.Scanner;
//★출력 순서가 이상함
public class FactorialUtil{
	//method
	
		public int factorial(int n){
		
		// 양수만 입력받기.
		if( n < 1 ){
			System.out.println("잘못된 숫자가 입력되었습니다..");
			System.exit(0);
		}
		//출력되야할 문구
		int result = 1;
		int number = n;
		
		for(int i = 1; i < n+1 ; i++){
			result = i * result;
			//시작 괄호 출력.
				if(number == n){
					System.out.print("(");
			    }

			// 5 * 4 * 3 * 2 * 1 출력
			//마지막 * 빼기. number == 1 일때 출력없음.
			if(number > 1){
				System.out.print( number + "*");
			}else{
				System.out.print(number);
			}
			number--;
			//마지막 괄호 출력	
				if(number == 0){
					System.out.print(") = ");
				}
		}
		return result;
	}//end of method
	
	//main
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input값을 입력해주세요.");
		//int n = keyboard.nextInt();
		
		FactorialUtil util = new FactorialUtil();
		System.out.print(util.factorial(keyboard.nextInt()));
	
	}//end of main

}//end of class