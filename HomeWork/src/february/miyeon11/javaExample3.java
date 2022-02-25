package february.miyeon11;

class javaExample3 
{
	public static void main(String[] args) 
	{
		//두 수를 입력받고, 두 사이 값의 합 구하기.
		// 입력받기
		int i = Integer.parseInt(args[0]); 
		int j = Integer.parseInt(args[1]); 

		//같은 값일 경우 문구 출력
		if( i == j){
				System.out.println("입력값이 같습니다. 같은 값의 사이값이 없어 값 출력이 불가능합니다.");
				return;
		} // if

/* 반복문 2번 사용.
		
		// 합계를 담을 변수 선언
		int sum = 0;

		//두 수 사이의 합계 구하기.
		// i > j 일경우
		if(i>j){ 			
			     for(int a = j; a<=i; a++){
			     sum += a;
				 } System.out.println(j + "~" + i + "의 합은" + sum + "입니다.");
			}else if(i<j){ 			
			for(int a = i; a<=j; a++){
			sum += a;
			}
				System.out.println(i + "~" + j + "의 합은" + sum + "입니다.");
		}//if   i>j

==========================================================================*/

		//반복문 1번 사용.
		//
		
/*		//삼항연산자. int i = 1>5 ? 3 : 4
	for( int a = j; a <= i; a++ ){
		System.out.println(i>j ? 
		//true	
		
		j + "~" + i + "의 합은" + sum + "입니다." 
			
		//false
		: i + "~" + j + "의 합은" + sum + "입니다.");}// println

=================================================================================*/

		
		//System.out.println( i>j ? j + "~" + i + "의 합은" : i + "~" + j + "의 합은");
//=======================================================

			int sum;
			int temp = 0;
			int temp02 = 0;
			
			if(i>j){
				temp02 = j; // 작은수
				temp = i; //큰 수
				i=j;
				j=temp;
				
						
			}else{
				temp02 = i;
				temp = j;
				j=i;
				i=temp;

			}

			//===========================
			// System.out.println("큰값 : " + temp + "작은값" + temp02 );
			for(sum = 0 ; i < j+1; i++){
				sum += i;
				//System.out.println(i + "~" + j + "의 합은" + sum + "입니다.");
			
			     
		  					
			} System.out.println( temp02 + "~" + temp + "의 합은" + sum + "입니다.");
			// System.out.println("큰값 : " + temp + "작은값" + temp02 );
			

		
	} // main
} // class
