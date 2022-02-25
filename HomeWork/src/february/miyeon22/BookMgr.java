package february.miyeon22;

public class BookMgr{
	private Book[] booklist;

	//Constructor
	public BookMgr(){
	}

	public BookMgr(Book[] booklist){
		this.booklist = booklist;
	}

	public void printBookList(){
		for(int i = 0; i < booklist.length; i++){
			Book book = booklist[i];
			System.out.println(book.getTitle());
		}//for
	
	}//printBookList

	public void printTotalPrice(){
		for(int i = 0; i < booklist.length ; i++ ){
			Book book = booklist[i];
			System.out.println(book.getPrice());
		}
	}

}//end of class