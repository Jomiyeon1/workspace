package february.miyeon18;

public class Prob01{

	//main
	public static void main(String[] args){
		// args[]로 입력받기.
		//1부터 시작하여 +2개씩.
		int i = Integer.parseInt(args[0]); 
		
		//값 걸러주기.
		if(i < 1 || i % 2 == 0){
			System.out.println("0이상의 홀수를 입력해주세요.");
			return;
		}// end of if
		
		for(int j = 0; j < i+1; j++){
			System.out.print("*");
			
		
		} // end of for (j)


	}//end of main


}//end of class