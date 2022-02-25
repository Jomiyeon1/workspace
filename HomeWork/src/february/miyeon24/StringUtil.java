package february.miyeon24;

public class StringUtil{
	private static String replaceString(String[] arr){
		int count = 0;
		int max = 0;
		int index = 0;
		String result = null;

		for(int i = 0; i < arr.length; i++){
				count = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				char c = arr[i].charAt(j);
				if(c == 'a'){
					count++;
				}//if(c == 'a')
			}//for j	
			if(count > max) {
				max = count;
				index = i;
			}//if count > max
		}//for i
		result = arr[index].replace('a', 'A');
		return result;
	}

	//main
	public static void main(String[] args){
		
		String[] arr ={"Java program", "array", "java Program area", "append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 : " + result);
	}//end of main

}//end of class