package miyeon07;

public class Prob02 {
	
	//10���� �ߺ����� �ʴ� ������ ����, �迭�� ���� -> ����
	public static int[] generaeGandomNumber() {
		int[] arr = new int[10];
	      for(int i=0;i<10;i++) {
	    	  arr[i]= i; //(int)(Math.random()*20)+1; //����    
	        }        
	      System.out.println(arr);
		return arr;
	}
		
		//10���� �迭�� �Ű������� �Ͽ� �߻��� ������ ��������� store.txt�� ����
		public static void generaRandomStatistice(int[] array) {
			
				
			
		}

	//main	
	public static void main(String[] args) {
		int[] array = generaeGandomNumber();
		System.out.println(array);
		//printStatistice(array);
		


	}//end of main

}// end of class
