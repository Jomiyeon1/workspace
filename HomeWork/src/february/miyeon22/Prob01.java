package february.miyeon22;

public class Prob01{
	Book[] booklist = new Book[5];

	Book book1 = new Book("Java Program", 25000);
	Book book2 = new Book("JSP Program", 15000);
	Book book3 = new Book("SQL Fundamentals", 30000);
	Book book4 = new Book("JDBC Program", 28000);
	book5.setTitle("EJB Program");
	book5.setPrice(34000);

	booklist[0] = book1;
	booklist[1] = book2;
	booklist[2] = book3;
	booklist[3] = book4;
	booklist[4] = book5;

	BookMgr mgr = new BookMgr(booklist);

	System.out.println("=== 책목록 ===");
	mgr.printBookList();
	System.out.println("");
	System.out.println("=== 책 가격의 총합 ===");
	mgr.printTotalPrice();
}
}