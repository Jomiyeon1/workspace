package spring.service.dice.test;

import spring.service.dice.impl.*;
import spring.service.dice.play.Player02;

/*
 * FileName : DiceTestApp00.java
 */
public class DiceTestApp02 {
	
	///Main Method
	public static void main(String[] args){
		//==> ������ �̿�
		//==> ����� Dice�� DiceAImpl�ν��Ͻ��� Player02 ������ ����(Injection)
		//==> Constructor Injection�� ���� DiceAImpl�� ����ϴ� Player02 instance ����
		Player02 player01 = new Player02(new DiceAImpl());
		player01.playDice(3);
		System.out.println("=======================");
		System.out.println("���õ� �ֻ��� ���� ������ : "+player01.getTotalValue());
		System.out.println("=======================");
		
		//setter method �̿�
		// ����� Dice�� DiceA��mpl�ν��Ͻ��� Player02 ������ ����(Injection)
		//==> Setter Injection�� ���� DiceAImpl�� ����ϴ� Player02 instance ����
		Player02 player02 = new Player02();
		player02.setDice(new DiceBImpl());
		player02.playDice(3);
		System.out.println("=======================");
		System.out.println("���õ� �ֻ��� ���� ������ : "+player02.getTotalValue());
		System.out.println("=======================");
		
		
	}
}//end of class

/*
 * [IoC] Inversion of Control ���� ����
 * 1. Dependency Injection ��� �ν��Ͻ� ����
 * (�������� ����, Loose Coupling : d�ν��Ͻ��� �������踦 ����)
 * - Constructor Injection : �����ڸ� ���� ��� ��ü ����
 * - Setter Injection : setter method�� ����� ��ü ����
 * 2. Dependency LoopUp : ��밴ü�� ã�°�
 * -  ex> EJB, DataSource, RMI���.. (JNDI���)
 * 
 * [����� ����]
 * => DiceTestApp02���� player02, DiceImplA, DiceImplB �ν��Ͻ��� ���� ���� ���.
 * - �̷��� Bean�� ����, �Ҹ�, �����ϴ� �Ϸ��� ������ �����ϴ� Container�� ����Ѵٸ�..
 * - ���� Dependency Injection �������ִ� Container�� ����Ѵٸ�..
 * 
 *  ==> Spring Framework�� Bean�� ����, �Ҹ�, ��ü�� ���輳�� ���� �����ϴ� 
 *      ���� DI�� �����ϴ� API�� �����ϴ� :: IoC Container::�̴�.
 *  ==> ���� �������� IoC Container�� Spring�� ����Ѵ�.
 * 
  */