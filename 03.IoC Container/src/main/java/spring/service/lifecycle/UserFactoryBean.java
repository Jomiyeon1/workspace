package spring.service.lifecycle;

import org.springframework.beans.factory.FactoryBean;

import spring.service.domain.User;

public class UserFactoryBean implements FactoryBean {
	
	//Filed
	
	//Constructor
	public UserFactoryBean() {
		System.out.println("::"+getClass().getName() + "����Ʈ ������!");
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
//		//�Ʒ��� true, false �� ���� Test�Ͽ� �ǹ̸� ����
//		//return true;
//		return false;
//		
//	}

}