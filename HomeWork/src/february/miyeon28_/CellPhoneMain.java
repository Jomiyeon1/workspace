package february.miyeon28_;

public class CellPhoneMain {
	
	public static void main(String[] args) {
		
		CellPhone01 myPhone = new CellPhone01("SCH-600");
		
		myPhone.charge(20);
		myPhone.printBattery();
		System.out.println("\n");
		
		myPhone.call(300);
		myPhone.printBattery();
		System.out.println("\n");
		
		myPhone.charge(50);
		myPhone.printBattery();
		System.out.println("\n");

		myPhone.call(40);
		myPhone.printBattery();
		System.out.println("\n");
		
		try {
			myPhone.call(-20);
		} catch (IllegalAccessError e) {
			System.out.println(e.getMessage());
		}
		
		CellPhone01 yourPhone = new CellPhone01("SCH-600");
		
		if(myPhone.equals(yourPhone)) {
			System.out.println("동일 모델입니다.");
		}else {
			System.out.println("다른 모델입니다.");
		}
	}

}
