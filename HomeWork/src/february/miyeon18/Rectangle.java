package february.miyeon18;

public class Rectangle{
	//Field
	int width;
	int length;
	String color;

	public Rectangle(){
	}
	
	//Ã¹¹øÂ° setter
	public void setWidth(int width){
		this.width = width;
	}
	public void setLength(int length){
		this.length = length;
	}
		public void setColor(String color){
		this.color = color;
	}
	
	//	getter
	public int getWidth(){
		return width;
	}
	public int getLength(){
	return length;
	}
	public String getColor(){
	return color;
	}

	//method
	public int area(){
		return width * length;
	}

	public int perimeter(){
		return 2 * (length + width);
	}

}