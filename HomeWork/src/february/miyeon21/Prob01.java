package february.miyeon21;

public class Prob01{
	//method
	public void calc(int[] ix){
		//홀짝 구분하기.
		//홀수, 짝수 각각 합을 저장하기.
		int a = 0; // 짝수의 합
		int b = 0; // 홀수의 합
		for(int i = 0; i < ix.length; i++){
			if(ix[i] % 2 == 0){
				a += ix[i];
			}else{
				b += ix[i];
			}
		}// end of for (int i)
		System.out.print("홀수의 합 : " + b + "\n" + "짝수의 합 : " + a + "\n");
		
	}//end of calc method


	//main
	public static void main(String[] args){
		int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
		int[] ib = new int[]{1, 2 , 3, 4, 5};

		Prob01 p = new Prob01();
		System.out.println("(배열 ia)");
		p.calc(ia);

		System.out.println("(배열 ib)");
		p.calc(ib);
		
	}//end of main
}//end of class