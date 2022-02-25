package february.miyeon11;

class  javaExample5
{
	public static void main(String[] args) 
	{
		// 문자열 배열 만들기
		String[][] text = new String[9][9];
		//실행결과
		// 1단을 출력합니다.
		// text[0][0] : 1*1=1 ...

		//스트링 인트로 변환
		//text =  Integer.parseInt(); 
		//int[] nums = Arrays.stream(text).mapToInt(Integer::parseInt).toArray();
		//int i = Integer.parseInt(args[0]); 

		// 배열에 값 대입.
		// 첫번째 배열에 대입
		for(int i = 0; i < text.length; i++){
			System.out.println((i+1) + "단을 출력합니다.");
			// 배열의 배열값
			for(int j = 0; j < text.length; j++){
				text[i][j] =(i+1)+"*"+(j+1)+"="+(i+1)*(j+1);
				System.out.println("text["+i+"]["+j+"]:"+text[i][j]);

			}
		}



	}//main
} //class