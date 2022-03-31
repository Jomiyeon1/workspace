package spring.service.dice.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import spring.service.dice.play.Player02;


public class DiceTestAppUseSpring {

	public static void main(String[] args) {
		
		//1. BeanFactory(Bean/IoC Container)�� �̿� Meta-Data�� ������, ���������� �����
		//   ������ ���� �ν��Ͻ� ���� �� Dependency Injection�� �Ϸ��� ���� ����
		
		BeanFactory factory =
				new XmlBeanFactory( new FileSystemResource
																	("./src/main/resources/config/diceservice.xml") );
		//2. Container�� ���� player01�� id�� ���� instance Lookup
		Player02 player01 = (Player02)factory.getBean("player01");
		player01.playDice(3);
		System.out.println("=======================");
		System.out.println("���õ� �ֻ��� ���� ������ : "+player01.getTotalValue());
		System.out.println("=======================\n\n");
		
		//3. Container�� ���� player02�� id�� ���� instance Lookup
		Player02 player02 = (Player02)factory.getBean("player02");
		player02.playDice(3);
		System.out.println("=======================");
		System.out.println("���õ� �ֻ��� ���� ������ : "+player02.getTotalValue());
		System.out.println("=======================\n\n");
		
		//4. Container�� ���� player03�� id�� ���� instance Lookup
		Player02 player03 = (Player02)factory.getBean("player03");
		player03.playDice(3);
		System.out.println("=======================");
		System.out.println("���õ� �ֻ��� ���� ������ : "+player03.getTotalValue());
		System.out.println("=======================\n\n");	
		
		//5. Container�� ���� player03�� id�� ���� instance Lookup
		Player02 player04 = (Player02)factory.getBean("player04");
		player04.playDice(3);
		System.out.println("=======================");
		System.out.println("���õ� �ֻ��� ���� ������ : "+player04.getTotalValue());
		System.out.println("=======================\n\n");			

	}

}
