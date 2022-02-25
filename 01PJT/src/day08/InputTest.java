package day08;
//package jp03.part01;

/*
	1. java.io package : 프로그램 외부로 자원을 받거나(?), 전달(?)할 경우에 사용.
	2. keyboard 로 부터 data를 읽어들이면..
*/

import java.io.*;

public class InputTest{
	


	//main
	public static void main(String args[]){
		System.out.println(args[0]);
		//InputStram :: 표준입력장치 추상화한 class
		InputStream inputStream = System.in;

		System.out.println("입력을 기다립니다.......");
	
		try{
			//값을 읽어들이는 무한 loop시작
			while(true){
				
				//1. java.io 는 지연(block)될 수 있다.
				int i = inputStream.read();
				char c = (char)i;

				//2. java.io는 FIFO구조
				System.out.println("입력하신 값 : " + c);

				//==> char 'x'가 입력되면 while문 종료
				if(c == 'x'){
					inputStream.close();
					break;
				}
			
			//한글 입력 시 깨진다. 한글 1EA당 2개 생기는 것을 확인
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}//end of main
}//end of class