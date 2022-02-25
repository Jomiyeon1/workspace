package february.miyeon14;

public class Prob02
{
	public static void main(String[] args) 
	{
		int limit = 50; // 50이하의 숫자
		boolean prime = false;
		//int[] m;
		
		// 자신으로 나눴을 때의 값이 2개일 경우 출력
		// 50이하의 값 체크
		for( int i = 2; i < limit+1; i++){
			// i = 1 ~ 50 ( 1은 소수가 아니므로 제외하고 2부터 시작한다.)
			int count = 0;

		//=========================================
			for(int j =2; j < i+1; j++){
				if( i % j == 0 ){
					count += 1; 
				}//if( i % j )

					
			}//for(j)
			if(count == 1){
						System.out.println(i);
					} // if count == 1 이면 출력.

		}//for (i)
	



	}//main
}//class
