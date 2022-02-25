package day08;
//package jp03.part02;

/*
	1. byte처리를 위한 Stream인 input/output Stream을 이용하여
	   keyboard로 입력, monitor로 출력하는 예
	2. 한글처리(문자처리)를 위하여 Reader/Writer계열로 바꾸어 입력, 출력

*/

import java.io.*;

public class WriterTest{
	//main
	public static void main(String[] args){
	
		try{
			//InputStream :: 표준입력장치 추상화한 class
			//InputStream inputStream = System.in;
			//문자처리를 위한 Reader로 변경
			//Reader reader = new InputStreamReader(inputStream);
			//위 두 코드를 하단처럼 바꿀 수 있다.
			Reader reader = new InputStreamReader(System.in);
			
			

			//OutputStream :: 표준출력장치 추상화한 class
			//OutputStream outputStream = System.out;
			//문자처리를 위한 Writer로 변경
			//Writer writer = new OutputStreamWriter(outputStream);
			// 위 두 코드를 하단처럼 이용할 수 있다.
			Writer writer = new OutputStreamWriter(System.out);
			
			System.out.println("입력을 기다립니다....");

			while(true){
				int i = reader.read();
				writer.write(i);
			//		writer.flush();

				if( (char)i == 'x'){
					break;
				}//if
			}//while
			// ==> while 문 내부의 flush()와 밖의 flush()의 의미는?
			// flush()를 나중에쓰면 입력받은 것들(버퍼에 저장된 것)을 한번에 출력한다.
			// while문안에 flush()를 사용시 입력과 동시에 출력됨.
			writer.flush();

			//Stream close()
			reader.close();
			writer.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}//end of class