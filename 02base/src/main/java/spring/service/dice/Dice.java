package spring.service.dice;
// Contreact(기능에 대한 규약)을 갖는 interface declaration
// Polymorphism ==> interface 기반 Programing
public interface Dice {
	//Method
	//==>value를 return하는 Method declaration
	public int getValue();
	
	//==> 주사위를 던저 선택되는 숫자를 생산하는 Method declaration
	public void selectedNumber();
	

}
