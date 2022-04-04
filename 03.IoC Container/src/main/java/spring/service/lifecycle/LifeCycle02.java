package spring.service.lifecycle;

/*
 *  - Bean LifeCycle :: Container가 wiring작업을 통해 instance생성, 소멸시까지의 주기
 * 	- Bean LifeCycle 참여
 * 		instance 직접 생성을 Factory Method 이용 생성 하려할 경우.. (예: SingleTon Pattern)
 * */

public class LifeCycle02 {
	
	//Filed
	private static LifeCycle02 lifeCycle;
	
	//Constructor
	public LifeCycle02() {
		System.out.println("::" + getClass().getName()+"디폴트생성자");
	}
	
	public static LifeCycle02 getInstance() {
		System.out.println("\n::LifeCycle02.getInstance()");
		if( lifeCycle == null) {
			lifeCycle = new LifeCycle02();
		}
		return lifeCycle;
	}
}
