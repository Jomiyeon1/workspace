package spring.service.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.aop.Message;

public class MessageTestAppUseSpringAOP01 {
//main method
	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("/config/messageservice01.xml");
		
		//==> Ioc Container로 부터 Look Up한 인스턴스는 ProxyFactoryBean 객체가 생성해준
		//==> Message interface구현한 Dynamic Proxy
		Message message = (Message)context.getBean("message");
		
		message.setMessage("Hello");
		
		System.out.println("\n리턴 받은 메시지:"+message.getMessage());
		
	}

}//end of class
