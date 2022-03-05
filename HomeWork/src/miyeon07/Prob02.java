package miyeon07;

public class Prob02 {
	
	//10개의 중복되지 않는 난수를 생성, 배열에 저장 -> 리턴
	public static int[] generaeGandomNumber() {
		int[] arr = new int[10];
	      for(int i=0;i<10;i++) {
	    	  arr[i]= i; //(int)(Math.random()*20)+1; //조작    
	        }        
	      System.out.println(arr);
		return arr;
	}
		
		//10개의 배열을 매개변수로 하여 발생된 난수와 통계정보를 store.txt에 저장
		public static void generaRandomStatistice(int[] array) {
			
				
			
		}

	//main	
	public static void main(String[] args) {
		int[] array = generaeGandomNumber();
		System.out.println(array);
		//printStatistice(array);
		


	}//end of main

}// end of class
