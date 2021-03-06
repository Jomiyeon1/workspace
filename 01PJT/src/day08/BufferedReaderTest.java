package day08;

//package jp03.part04;

import java.io.*;

/*
	1. read() Method 보다 효율적인 method를 제공하는 class 사용
	2. Sink steam : Data를 직접 주고 받는 단순입출력 Stream
	   Filter stream : Sink Stream을 통해 들어온 Data조작하는 Stream 차이 이해
*/

public class BufferedReaderTest{
	//main
	public static void main(String args[]) throws Exception{
		//read 수 count를 위한 변수
		int readCount = 0;

		//SinkStream ==> 말단에서 단순 입출력만 담당
		//FileReader fr = new FileReader(args[0]);
		//FilterStream ==> 추가적인 기능을 제공
		//BufferedReader br = new BufferedReader(fr);

		//==>위 두 line 과 아래를 비교하자.
		BufferedReader br = new BufferedReader(new FileReader(args[0]));

		String oneLine = null;

		while(true){
			readCount++;

			oneLine = br.readLine(); //API확인
			if(oneLine == null){ //API확인
				break;
			}
			System.out.println("한줄 출력 : " + readCount + " " + oneLine);
		}//while

		//Stream close
		br.close();
		//fr.close();
	}//end of main
}//end of class