package february.miyeon23;

public abstract class Shape{
	// - : private, + : public, # : protected

	//Field
	private String name;
	protected double area;
	
	//Constructor
	public Shape(){
	}
	public Shape(String name){
		this.name = name;
	}

	//=====================method
	abstract void calculationArea();
	
	public void print(){
		System.out.println(this.name + "의 면적은" + this.area);
			
	}
	//=================== set

	public void setName(String name){
		this.name = name;
	}
	
	public void setArea(double area){
		this.area = area;
	}

	//=====================get
	public String getName(){
		return name;
	}

	public double getArea(){
		return area;
	}
	

		
}//end of class