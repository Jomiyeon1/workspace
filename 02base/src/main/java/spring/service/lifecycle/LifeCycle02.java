package spring.service.lifecycle;

/*
 *  - Bean LifeCycle :: Container�� wiring�۾��� ���� instance����, �Ҹ�ñ����� �ֱ�
 * 	- Bean LifeCycle ����
 * 		instance ���� ������ Factory Method �̿� ���� �Ϸ��� ���.. (��: SingleTon Pattern)
 * */

public class LifeCycle02 {
	
	//Filed
	private static LifeCycle02 lifeCycle;
	
	//Constructor
	public LifeCycle02() {
		System.out.println("::" + getClass().getName()+"����Ʈ������");
	}
	
	public static LifeCycle02 getInstance() {
		System.out.println("\n::LifeCycle02.getInstance()");
		if( lifeCycle == null) {
			lifeCycle = new LifeCycle02();
		}
		return lifeCycle;
	}
}
