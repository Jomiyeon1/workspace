package february.miyeon22;

public class Book{
	//Field
	private String title;
	private int price;
	
	//Constructot
	public Book(){
	}

	public Book(String title, int price){
		this.title = title;
		this.price = price;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public String getTitle(){
		return title;
	}

	public int getPrice(){
		return price;
	}

	

}