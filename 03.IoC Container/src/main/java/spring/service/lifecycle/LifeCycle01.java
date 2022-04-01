package spring.service.lifecycle;

import org.springframework.beans.factory.BeanNameAware;
/*
 * - Bean LifeCycle :: Container가 wiring작업을 통해 instance생성, 소멸시까지의 주기
 * - Bean LifeCycle 참여
 *   생성시 생성자 이외에 추가적 초기화 작업을 해야할 경우
 *   instance 소멸시 추가적 작업을 해야할 경우
 *   instance 생성시 Container에게 일련의 정보를 공유하여야할 경우 등등...
 * */
public class LifeCycle01 implements BeanNameAware {
	
	//Filed
	
	//Constructor
	public LifeCycle01() {
		// TODO Auto-generated constructor stub
	}
	
	//==> BeanNameAware interface구현으로 반드시 O/R
	public void setBeanName(String name) {
		System.out.println("::"+ getClass().getName()+".setBeanName() start...");
		System.out.println("xml에 정의 된 beanName : " + name);
		System.out.println("::"+ getClass().getName()+".setBeanName() end...");
	}
	
	//Method
	public void init() {
		System.out.println("::"+ getClass().getName()+".init()");
	}
	
	public void destroy() {
		System.out.println("::"+ getClass().getName()+".destroy()");
	}

}
