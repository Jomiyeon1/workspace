package spring.service.domain.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
public class UserTestApp01 {

	public static void main(String[] args) {
		
		//==> Bean / IoC Container : 객체 생성, 소멸 및 Dependency Injection 관리
		//==> Spring Framework에서는 상속관계를 갖는 아래의 Container 제공.
		//==> - BeanFactory : 기본적인 인스턴스 생성과 의존성 주입 Container
		//==> - ApplicationContext : Bean Factory 상속하여 국제화(i18n)
		//==>                        이벤트 리스너 등록 등등.. 추가적기능.
		
		//1. BeanFactory이용 xml에 선언적, 서술적 기술된 instance생성 및 의존성 주입
		//- BeanFactory는 getBean()호출시 Bean생성(lazy loading) <== console 확인할 것
		BeanFactory factory =
				new XmlBeanFactory( new FileSystemResource
																	("./src/main/resources/config/diceservice.xml") );
		//2. ApplicationContext이용 xml에선언적, 서술적 기술된 instance생성 및 의존성 주입
		//- ApplicationContext는 모든 인스턴스를 pre-loading <== console 확인할 것
//		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/userserivice01.xml");
		
		//3. Container로 부터 각각의 id를 갖는 instance id를 갖는 instance Look Up
		// - Dependency Look Up / Dependency Injection 확인...
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
