package shop.service.user.test;

import shop.service.user.Client;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("홍길동", "010", "개발자", false);
		
	System.out.println("이름 : " + client.getName());
	System.out.println(client);
	
	
	}

}
