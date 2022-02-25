package february.miyeon23;

class Prob{
	
	//method
	public static void printGugudan(int no){
		// 값 체크
		if(no < 1 || no > 9){
			System.out.println("1 이상 9 이하의 값을 입력하셔야 합니다.");
			return;
		}
		for(int i = 1; i < 10; i++){
			for(int j = 1; j < (no+1); j++){
				
				System.out.print( j + "*" + i + "=" + (i*j) + "\t"); 
			}// for j
				// 줄내려쓰기
				System.out.println(" ");
		}// for i

	}// end of method


	public static void main(String[] args) {

		Prob prob = new Prob();

		System.out.println("주어진 숫자까지의 구구단을 찍습니다.");
		System.out.println("---------------- Sample1 ----------------");
		prob.printGugudan(4);

		System.out.println("---------------- Sample2 ----------------");
		prob.printGugudan(9);

		System.out.println("---------------- Sample3 ----------------");
		prob.printGugudan(-1);

		System.out.println("---------------- Sample4 ----------------");
		prob.printGugudan(10);




		
	}// end of main
}// end of class
