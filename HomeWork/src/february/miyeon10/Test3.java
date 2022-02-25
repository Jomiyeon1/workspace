package february.miyeon10;

public class Test3
{
	public static void main(String[] args) 
	{
		//두 수를 입력받고, 입력받은 수가 짝/홀/3배수를 판단하기
		// 출력 예 > 입력하신 n번째 인자값은 "짝/홀수"이며, 3의 배수 "입니다./아닙니다."

		//입력받은 두 수를 int로 변환
		int i = Integer.parseInt(args[0]); 
		int j = Integer.parseInt(args[1]);

		// 짝홀수 구분 후 3의 배수인지 확인 후 출력.
		// 1번째 인수 값이 짝수라면, 
		if (i % 2 ==0)
		{	//짝수이면서 3의 배수라면,
			if( i % 3 ==0){
					System.out.println("입력하신 첫번째 인자값 " +  i  +"은 짝수이며, 3의 배수입니다.");
						// 짝수이면서 3의 배수가 아니라면
			}else{ 
					System.out.println("입력하신 첫번째 인자값 " +  i   + "은 짝수이며, 3의 배수가 아닙니다.");
			
			} //1번째 인수 값이 홀수라면,
		}else if (i % 2 ==1)
		{ // 홀수이면서 3의 배수
				if(i % 3 ==0){
					System.out.println("입력하신 첫번째 인자값 " +  i  +"은 홀수이며,  3의 배수입니다.");
				}else{ // 홀수이면서 3의 배수 아님
					System.out.println("입력하신 첫번째 인자값 " +  i   + "은 홀수이며,  3의 배수가 아닙니다.");				
				}

		}

		// =====================================================

		// 2번째 인수값
				if (j % 2 ==0)
		{	//짝수이면서 3의 배수라면,
			if( j % 3 ==0){
					System.out.println("입력하신 두번째 인자값 " +  j  +"은 짝수이며, 3의 배수입니다.");
						// 짝수이면서 3의 배수가 아니라면
			}else{ 
					System.out.println("입력하신 두번째 인자값 " + j   + "은 짝수이며, 3의 배수가 아닙니다.");
			
			} //홀수라면,
		}else if (j % 2 ==1)
		{ // 홀수이면서 3의 배수
				if(j % 3 ==0){
					System.out.println("입력하신 두번째 인자값 " + j  +"은 홀수이며,  3의 배수입니다.");
				}else{ // 홀수이면서 3의 배수 아님
					System.out.println("입력하신 두번째 인자값 " + j   + "은 홀수이며,  3의 배수가 아닙니다.");				
				}

		}



	} //main
} //class
