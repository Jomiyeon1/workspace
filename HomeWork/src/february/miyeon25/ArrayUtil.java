package february.miyeon25;

public class ArrayUtil {

	public char[] reverseString(char[] s, int start, int end) {
		char[] temp = s;
		char c;
		
		while(start < end) {
			c = temp[start];
			temp[start] = temp[end];
			temp[end] = c;
			start ++;
			end --;
		}
		
		
		return temp;
	}
	
	public static void main(String[] args) {
		ArrayUtil au = new ArrayUtil();
		char[] s = {'J','a','v','a','P','r','o','g','r','a','m'};
		//System.out.println(au.reverseString(s, 0, 3));
		//System.out.println(au.reverseString(s, 4, 7));
		//System.out.println(au.reverseString(s, 8, 10));
		System.out.println(au.reverseString(s, 0, 10));
		
		//주석처리하고 1개씩 풀어서 확인할 것.

	}

}
