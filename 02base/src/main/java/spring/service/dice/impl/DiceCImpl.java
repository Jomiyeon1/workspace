package spring.service.dice.impl;

import java.util.Random;

import spring.service.dice.Dice;

// Dice interface 구현 :: Realization Relation
// 주사위 Object Modeling
// 1~6 수를 랜덤하게 리턴
// Bean 규악 준함.(POJO:: Plain Old Java Object)

public class DiceCImpl implements Dice {
		///Field
		private int value;

		///Constructor
		public DiceCImpl() {
			System.out.println("::"+getClass().getName()+" 생성자....");
		}

		//Method (getter/setter)
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		
		//==> 주사위를 던저 무작위로 숫자 생산
		public void selectedNumber(){
			value = new Random().nextInt(6) + 1;
		}

}
