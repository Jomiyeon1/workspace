package february.miyeon17;

public class Prob02 {
	public int abs(int num1, int num2){
		// 음수라면 양수로 변환해주기.
		if(num1 < 0){
			num1 = num1 * (-1);
		}
		if(num2 < 0){
			num2 = num2 * (-1);	
		}

		// 두수의 차 구하기.
		 if(num1 > num2){
			return (num1 - num2);
		 }else if(num2 > num1){
			return (num2 - num1);	
		 }else{ // 값이 같다면? 0 출력.
			return 0;
		 }
	}/// end of abs
	




	///main
	public static void main(String[] args) 
	{
		int num1 = 6;
		int num2 = 15;

		Prob02 prob = new Prob02();
		System.out.println("두수의 차는 " + prob.abs(num1, num2));

	}///end of main 

} ///end of class
