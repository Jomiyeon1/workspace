package february.miyeon23;

public class Rectangular extends Shape{

	//Field
	private double width;
	private double height;
	
	//Constructor
	public Rectangular(){
	}
	public Rectangular(String name){
		super(name);
	}

	public Rectangular(String name, double width, double height){
		super(name);
		this.width = width;
		this.height = height;
	}

	//================================
	//Method
	public void calculationArea(){
		this.area = this.width * this.height ;
		//System.out.println(area);
	
	}

	public void setWidth(double width){
		this.width = width;
	}

	public void setHeight(double hight){
		this.height = height;
	}

	public double getWidth(){
		return width;
	}

	public double getHeight(){
		return height;
	}



}