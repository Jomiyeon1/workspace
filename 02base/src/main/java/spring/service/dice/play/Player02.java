package spring.service.dice.play;

import spring.service.dice.Dice;

/*
 *	[player01]
 * - Filed에 Dice diceA = new DiceA() 인스턴스를 선언 및 생성
 * - Dice와 Association Relation DiceA만 사용가능
 * - Coupling 관계가 높은 코드 > 유연하지 못함
 * 
 * [player01]
 * - Association Relation을 interface기반으로 변경함 > 유연한구조
 *  ( 다형성 : Polymorphism 적용/ 특정객체와 느슨한 결합.(Loose Coupling))
 * - interface Dice만 선언함으로써 DiceA~CImpl등 is a 관계를 갖는 객체는 모두 사용 가능
 * - 또한 선언만 하였으며 어떤 구현체를 사용할지 결정되어 있지 않으며
 * 생성자를 통해 생성시 구현객체를 받거나(주입:injection), setter method를 통해
 * 구현첼를 받아(주입:injection) Dice를 사용할 수 있다.
 * - 어떤 Dice가 주입될지 모르며 알필요도 없다.(Encapsulation / Ployorphism)
 */
public class Player02 {
	
	///Field
	private Dice dice;
	private int totalValue;
	
	///Constructor Method
	public Player02() {
		System.out.println("::"+getClass().getName()+"디폴트 생성자!");
	}
	public Player02(Dice dice) {
		System.out.println("::"+getClass().getName()+"Dice 인스턴스를 인자로 받는 생성자!");
		this.dice = dice;
	}
	
	///Method (getter/setter)
	public Dice getDice() {
		return dice;
	}
	public void setDice(Dice dice) {
		System.out.println("::"+getClass().getName()+".setDice()...");
		this.dice = dice;
	}
	public int getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	
	//==> count 만큼 주사위를 굴려서 합을 후하는 행위
	public void playDice(int count){
		
		System.out.println("==>"+getClass().getName()+".playDice() start....");

		for (int i = 0; i < count; i++) {
			dice.selectedNumber();
			System.out.println("::[ "+dice.getClass().getName()+" ] 의 선택된수 : "+dice.getValue());
			totalValue += dice.getValue(); 
		}
		
		System.out.println("==>"+getClass().getName()+".playDice() end....");
	}

}//end of class