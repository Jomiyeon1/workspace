package spring.service.domain.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
public class UserTestApp01 {

	public static void main(String[] args) {
		
		//==> Bean / IoC Container : ��ü ����, �Ҹ� �� Dependency Injection ����
		//==> Spring Framework������ ��Ӱ��踦 ���� �Ʒ��� Container ����.
		//==> - BeanFactory : �⺻���� �ν��Ͻ� ������ ������ ���� Container
		//==> - ApplicationContext : Bean Factory ����Ͽ� ����ȭ(i18n)
		//==>                        �̺�Ʈ ������ ��� ���.. �߰������.
		
		//1. BeanFactory�̿� xml�� ������, ������ ����� instance���� �� ������ ����
		//- BeanFactory�� getBean()ȣ��� Bean����(lazy loading) <== console Ȯ���� ��
		BeanFactory factory =
				new XmlBeanFactory( new FileSystemResource
																	("./src/main/resources/config/diceservice.xml") );
		//2. ApplicationContext�̿� xml��������, ������ ����� instance���� �� ������ ����
		//- ApplicationContext�� ��� �ν��Ͻ��� pre-loading <== console Ȯ���� ��
//		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/userserivice01.xml");
		
		//3. Container�� ���� ������ id�� ���� instance id�� ���� instance Look Up
		// - Dependency Look Up / Dependency Injection Ȯ��...
		System.out.println("\n==============================");
		User user01 = (User)factory.getBean("user01");
		System.out.println(user01);
		
		System.out.println("==============================");
		User user02 = (User)factory.getBean("user02");
		System.out.println(user02);
		
		System.out.println("\n==============================");
		User user03 = (User)factory.getBean("user03");
		System.out.println(user03);
		
		System.out.println("\n==============================");
		User user04 = (User)factory.getBean("user04");
		System.out.println(user04);

		System.out.println("\n==============================");
		User user05 = (User)factory.getBean("user05");
		System.out.println(user05);
	}

}
