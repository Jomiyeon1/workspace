package february.miyeon23;

class Circle extends Shape{
	//Field
	private double radius;
	
	public Circle(){
	}
	public Circle(String name){
		super(name);
	}

	public Circle(double radius){
		this.radius = radius;
	}

	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

//========================================

	public void calculationArea(){
		this.area = this.radius * this.radius * Math.PI;
		//System.out.println(area);
	}	


	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}


}