public class Prob02 {
	public static void main(String[] args) 
	{
		// 오름차순으로 정렬하기.
		// [배열의 내용] ok
		// 3, 24, 1, 55, 17, 43, 5 ok
		//[클래스 실행결과] ok
		//1, 3, 5, 17, 24, 43, 55
		// ***** 내려쓰지 않고 한줄에 모두 출력 & 맨 마지막에는 , 없이 출력
		int[] array = {3, 24, 1, 55, 17, 43, 5};
		System.out.println("[배열의 내용]");
		// 배열의 내용 출력 & 마지막에 쉼표빼기!
		for( int i = 1; i < array.length; i++){
			// 마지막에 , 빼기.
			if( i == array.length-1){
				System.out.println(array[i]);
			}else{
				System.out.print(array[i] + ", ");			
			}//else
		} //for

		 System.out.println("[클래스 실행결과]");
		 // 배열 선언
/*		 int[] temp = new int[array.length];
		 int i;
		 int j;
		//오름차순 정렬하기.
		   for( i = 0; i < array.length -1; i++){
			   for( j = 0; j < array.length -1;j++){
			   temp[i] = array[j];
			   temp[i+1] = array[j+1];

			   if (array[j] > array[j+1]){
					array[j] = temp[i];
					array[j+1] = temp[i+1];
				}//if
			   }// j for문
		   }// i for문
			
			for(i = 0; i < array.length-1; i++){
				if( i == array.length-1){
					System.out.println(temp[i]);
				}else{
					System.out.print(temp[i] + ", ");		
			}
			}
*/



			for(int i = 0; i < array.length - 1 ; i++){
				
				for(int j = 0; j < array.length - 1; j++){
					int temp = array[j];
					int temp1 = array[j+1];

					if(array[j] > array[j+1]){
						array[j] = temp1;
						array[j+1] = temp;
					}
					
				}// for j
			}// for i

			for(int i = 0; i <array.length; i++){
				if( i == array.length-1){
				System.out.println(array[i]);
				}else{
				System.out.print(array[i] + ", ");			
					}//else
				
			}// 출력 for 문

	}//main
}//class
