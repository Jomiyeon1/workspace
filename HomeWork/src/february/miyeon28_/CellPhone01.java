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

	// 통화시간에 따른 배터리 감소
	// 감소되는 배터리양 = 통화시간(분) * 0.5
	public void call(int time) {
		if(time < 0 ) {
			throw new IllegalArgumentException("통화시간 입력 오류");
		}
		//감소되는 배터리양
		double total = time * 0.5;
		System.out.println("통화 시간 : " + time + "분");
		
		if(battery <= total) {
			battery = 0;
		}else {
			battery -= total;
		}
	}
	
	// 충전시간에 따른 배터리 증가
	// 충전되는 배터리양 = 충전시간(분) * 3
	public void charge(int time) {
		if(time < 0 ) {
			throw new IllegalArgumentException("통화시간 입력 오류");
		}
		//충전되는 배터리양
		double total = time * 3;
		System.out.println("충전 시간 : " + time +"분");
		if(battery+total > 101) {
			battery = 100;
		}else {
			battery += total;
		}
	}
	
	//남은 배터리양 출력
	public void printBattery() {
		System.out.println("남은 배터리양 : " + battery );
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
