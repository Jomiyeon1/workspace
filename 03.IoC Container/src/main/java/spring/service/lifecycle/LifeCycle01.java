package spring.service.lifecycle;

import org.springframework.beans.factory.BeanNameAware;
/*
 * - Bean LifeCycle :: Container�� wiring�۾��� ���� instance����, �Ҹ�ñ����� �ֱ�
 * - Bean LifeCycle ����
 *   ������ ������ �̿ܿ� �߰��� �ʱ�ȭ �۾��� �ؾ��� ���
 *   instance �Ҹ�� �߰��� �۾��� �ؾ��� ���
 *   instance ������ Container���� �Ϸ��� ������ �����Ͽ����� ��� ���...
 * */
public class LifeCycle01 implements BeanNameAware {
	
	//Filed
	
	//Constructor
	public LifeCycle01() {
		// TODO Auto-generated constructor stub
	}
	
	//==> BeanNameAware interface�������� �ݵ�� O/R
	public void setBeanName(String name) {
		System.out.println("::"+ getClass().getName()+".setBeanName() start...");
		System.out.println("xml�� ���� �� beanName : " + name);
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
