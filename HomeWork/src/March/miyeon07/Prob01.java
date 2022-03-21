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
			bookList.add(makeBook("Java Programming 기초 : 컴퓨터 : 35000"));
			bookList.add(makeBook("초보자를 위한 SQL : 컴퓨터 : 28000"));
			bookList.add(makeBook("HTML5 API 소개 : 컴퓨터 : 58000"));
			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터 : 45000"));
			bookList.add(makeBook("JSP Programming 고급 : 컴퓨터 : 56000"));
			System.out.println("<<책목록>>");
			printBookList(bookList);
		} catch (DataFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
