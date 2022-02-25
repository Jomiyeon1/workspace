package day08;

//package jp03.part05;

import java.io.*;

/*
	==> ketboard로 입력받은 내용 test.txt로 보내는 Apllication 작성
*/

public class FileWriterTestFilter02{
	//main
	public static void main(String[] args) throws Exception{

		//필요 객체 Stream/String 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;

		// keyboard 로 입력받기 위한 Sink Stream Reader 및
		// 1개의 line을 읽기 편한 readLine() method를 제공하는 BufferedReader생성
		// Reader r = new InputStreamReader(System.in);
		// br = new BufferesReader(r);
		br = new BufferedReader( new InputStreamReader(System.in));

		//File에 글을 쓰기위한 FileWriter 및 BufferWriter생성
		//FileWriter fw = new FileWriter("test.txt");
		//bw = new BufferedReader(fw);
		bw = new BufferedWriter(new FileWriter("test.txt")); //==> API확인
		//bw = new  BufferedWriter(new FileWriter("test.txt", true)); //==> API확인

		System.out.println("파일에 저장하실 글을 입력하세요.");
		while(true){
			String str = br.readLine();
			if(str.equals("끝")){
				break;
			}
			bw.write(str, 0, str.length()); //==> API확인
			bw.newLine(); //==> API확인(줄바꾸기)
		}
		bw.flush(); //flush 잊지 말것!

		//Strem close
		br.close();
		bw.close();



	
	}
}