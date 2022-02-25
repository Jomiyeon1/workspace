package february.miyeon10;

class Test2
{
	public static void main(String[] args) 
	{
		
		// 입력받은 인수  int로 변경, 더한/뺀 값을 담을  int 변수 선언
		int i = Integer.parseInt(args[0]); 
		int j = Integer.parseInt(args[1]);
		int value;

		// 첫번째 숫자가 클 때 빼기.( i > j ) -> 출력
		if( i > j ){
			value = i - j;
				System.out.println("첫번째 인수 : " + args[0] + " 두번째 인수 : " + args[1] + ", " + i + " - " + j + " = " + value + "입니다.");
		
		// 두번재 숫자가 클 때 더하기.( j > i ) -> 출력
		}else if( j > i ){
			value = i + j;
				System.out.println("첫번째 인수 : " + args[0] + " 두번째 인수 : " + args[1] + ", " + j + " + " + i + " = " + value + "입니다.");
				}
		else if (j == i){
				System.out.println("같은 값은 연산이 불가능합니다.");		
		}
		
	
	} // main
} // class
