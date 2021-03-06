package spring.service.lifecycle;

import org.springframework.beans.factory.FactoryBean;

import spring.service.domain.User;

public class UserFactoryBean implements FactoryBean {
	
	//Filed
	
	//Constructor
	public UserFactoryBean() {
		System.out.println("::"+getClass().getName() + "디폴트 생성자!");
	}
	
	@Override
	public User getObject() {
		System.out.println("::"+getClass().getName() + ".getObject()");
		return new User();
	}
	
	@Override
	public Class getObjectType() {
		System.out.println("::"+getClass().getName() + ".getObjectType()");
		return User.class;
	}
	
//	@Override
//	public boolean isSingleton() {
//		System.out.println("::"+getClass().getName() + ". isSingleton()");
//		//아래를 true, false 로 변경 Test하여 의미를 이해
//		//return true;
//		return false;
//		
//	}

}
