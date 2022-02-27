package february.miyeon16;

public class Prob03
{
	public static void main(String[] args) 
	{
		//변수 선언 및 초기화
		int year = 2010;
		int month = 2;
		int maxDay = 0; // 윤달 29일 아니면 28일

		// 4의 배수인 해는 윤년 
		// => year % 4 == 0
		// 4의 배수이면서 100의 배수인 해는 윤년이 아님. 
		// => year % 4 ==0 && year % 100 ==0
		// 100의 배수이면서 400의 배수인 해는 윤년. 
		// => year % 4 ==0 && year % 100 ==0 && year % 400 == 0
		
		// 4의 배수가 아닌 경우 먼저 거르기.
		if(year % 4 != 0){
			maxDay = 28;
			System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "입니다.");
			return;
		}

		if(year % 4 == 0){
			if(year % 100 == 0){
			maxDay = 28;
			System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "입니다.");
			return;
			}// 100의 배수 윤년 아님. if
			if(year % 400 ==0){
				maxDay = 29;
				System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "입니다.");
				return;
			}// 400의 배수인 경우 윤년. if
		maxDay = 29;
		System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "입니다.");

		}// 4의 배수인 경우 if

	}//main
}// class
