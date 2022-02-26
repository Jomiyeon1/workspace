package day08;

//package jp03.part05;

import java.io.*;

/*
	==>FileCopy 하는 Application을 작성
	1. Keyboard 로 FileName을 입력
	2. File의 내용을 read() ==> FileReader
	3. File로 내용을 write() ==> FileWriter
*/

public class FileWriterTestFilter01{

	//main
	public static void main(String[] args) throws IOException{
		
		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br = null;
		BufferedReader bw = null;
		String fileName = "";
		String copyFileName = "";
		
		int readCount = 0; //read 를 Count하기 위한 변수

		System.out.println("copy할 file이름을 입력하세요 : ");
		//copy할 FileName을 입력받기
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

		//==> 원본 파일 Data를 read할 수 있는 BufferedReader 생성
		br = new BufferedReader( new FileReader(fileName));


		//==> 사본파일 이름 만들기
		copyFileName = fileName + "_copy";
		//==> Data를 Write할 수 있는 BufferedWriter 생성
		//bw = new BufferedWriter(new FileWriter(copyFileName));

		// read / writer하는 while문
		String source = null;
		while( (source = br.readLine() ) != null ){
			bw.write(source);
			readCount++;
		}
		bw.flush();

		//Stream close()
		bw.close();
		br.close();

		System.out.println("=============================================");
		System.out.println("=========> read 횟수 read Count: " + readCount);
		System.out.println("=============================================");

	}//end of main

} // end of class