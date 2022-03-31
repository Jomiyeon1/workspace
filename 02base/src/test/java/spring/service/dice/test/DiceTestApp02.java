package spring.service.dice.test;

import spring.service.dice.impl.*;
import spring.service.dice.play.Player02;

/*
 * FileName : DiceTestApp00.java
 */
public class DiceTestApp02 {
	
	///Main Method
	public static void main(String[] args){
		//==> 생성자 이용
		//==> 사용할 Dice인 DiceAImpl인스턴스를 Player02 생성시 전달(Injection)
		//==> Constructor Injection을 통한 DiceAImpl을 사용하는 Player02 instance 생성
		Player02 player01 = new Player02(new DiceAImpl());
		player01.playDice(3);
		System.out.println("=======================");
		System.out.println("선택된 주사위 수의 통합은 : "+player01.getTotalValue());
		System.out.println("=======================");
		
		//setter method 이용
		// 사용할 Dice인 DiceAㅠmpl인스턴스를 Player02 생성시 전달(Injection)
		//==> Setter Injection을 통한 DiceAImpl을 사용하는 Player02 instance 생성
		Player02 player02 = new Player02();
		player02.setDice(new DiceBImpl());
		player02.playDice(3);
		System.out.println("=======================");
		System.out.println("선택된 주사위 수의 통합은 : "+player02.getTotalValue());
		System.out.println("=======================");
		
		
	}
}//end of class

/*
 * [IoC] Inversion of Control 제어 역핸
 * 1. Dependency Injection 사용 인스턴스 주입
 * (의존관계 주입, Loose Coupling : d인스턴스간 의존관계를 낮춤)
 * - Constructor Injection : 생성자를 통한 사용 객체 주입
 * - Setter Injection : setter method를 사용한 객체 주입
 * 2. Dependency LoopUp : 사용객체를 찾는것
 * -  ex> EJB, DataSource, RMI등등.. (JNDI사용)
 * 
 * [고려할 사항]
 * => DiceTestApp02에서 player02, DiceImplA, DiceImplB 인스턴스를 직접 생성 사용.
 * - 이러한 Bean의 생성, 소멸, 설정하는 일련의 과정을 관리하는 Container를 사용한다면..
 * - 또한 Dependency Injection 관리해주는 Container를 사용한다면..
 * 
 *  ==> Spring Framework는 Bean의 생성, 소멸, 객체간 관계설정 등을 관리하는 
 *      또한 DI를 지원하는 API를 제공하는 :: IoC Container::이다.
 *  ==> 다음 예제에서 IoC Container인 Spring을 사용한다.
 * 
  */