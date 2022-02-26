package february.miyeon17;

public class SortUtil {
	
	public int[] ascending(int[] inputNumbers) {
		int temp = 0;
		
		for(int i = 0; i < inputNumbers.length; i++) {
			for(int j = (i+1); j < inputNumbers.length; j ++) {
				if( inputNumbers[i] > inputNumbers[i+1] ) {
					temp = inputNumbers[i];
					inputNumbers[i] = inputNumbers[i+1];
					inputNumbers[i+1] = temp;
				} // if
				
			}//end of for > j
			
			
		}//end for > i
		
		
		return inputNumbers;
	}

	
	//main
	public static void main(String[] args) {
		
		SortUtil util = new SortUtil();
		int[] numbers = new int[] {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
		
		numbers = util.ascending(numbers);

		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			
			if( i != numbers.length-1) {
				System.out.print(", ");
				
			}else{
				System.out.println("");
				
			}
			
		}
		System.out.println("Successful!!!");
	}//end of main

}//end of class
