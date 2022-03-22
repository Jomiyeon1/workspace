package february.miyeon28_;

public class CellPhone01 {
	
	//Field
	private String model;
	private double battery;
	//Constructor
	public CellPhone01() {
		
	}
	public CellPhone01(String model) {
		this.model = model;
	}

	// ��ȭ�ð��� ���� ���͸� ����
	// ���ҵǴ� ���͸��� = ��ȭ�ð�(��) * 0.5
	public void call(int time) {
		if(time < 0 ) {
			throw new IllegalArgumentException("��ȭ�ð� �Է� ����");
		}
		//���ҵǴ� ���͸���
		double total = time * 0.5;
		System.out.println("��ȭ �ð� : " + time + "��");
		
		if(battery <= total) {
			battery = 0;
		}else {
			battery -= total;
		}
	}
	
	// �����ð��� ���� ���͸� ����
	// �����Ǵ� ���͸��� = �����ð�(��) * 3
	public void charge(int time) {
		if(time < 0 ) {
			throw new IllegalArgumentException("��ȭ�ð� �Է� ����");
		}
		//�����Ǵ� ���͸���
		double total = time * 3;
		System.out.println("���� �ð� : " + time +"��");
		if(battery+total > 101) {
			battery = 100;
		}else {
			battery += total;
		}
	}
	
	//���� ���͸��� ���
	public void printBattery() {
		System.out.println("���� ���͸��� : " + battery );
	}
	
	public boolean equals(Object object) {
		if(object == null) {
			return false;
		}else if ( !(object instanceof CellPhone01) ) {
			return false;
			
		}else {
			CellPhone01 yourPhone = (CellPhone01)object;
			return model.equals(yourPhone.model);
		}
	}
}
