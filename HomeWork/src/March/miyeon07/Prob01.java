package March.miyeon07;

import java.util.Vector;
import java.util.zip.DataFormatException;

public class Prob01 {
	
	//method
	private static Book makeBook (String bookData) {
		
		return null;
	}
	
	private static void printBookList(Vector bookList) {
		
	}
	
	public static void main(String[] args) {
		Vector bookList = new Vector();
		
		try {
			bookList.add(makeBook("Java Programming ���� : ��ǻ�� : 35000"));
			bookList.add(makeBook("�ʺ��ڸ� ���� SQL : ��ǻ�� : 28000"));
			bookList.add(makeBook("HTML5 API �Ұ� : ��ǻ�� : 58000"));
			bookList.add(makeBook("JDBC Programming ���� : ��ǻ�� : 45000"));
			bookList.add(makeBook("JSP Programming ��� : ��ǻ�� : 56000"));
			System.out.println("<<å���>>");
			printBookList(bookList);
		} catch (DataFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
