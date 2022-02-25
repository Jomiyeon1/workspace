package day08;

//package jp03.part03;

import java.io.*;

public class FileInputStreamTest{
	//main
	public static void main(String[] args){
	 //File을 읽어들이는 Stream 선언
	 FileInputStream fis = null;
	 //read()수 count 위한 변수
	int readCount = 0;

	try{
		fis = new FileInputStream(args[0]);

		while(true){
			int i = fis.read();

			if(i == -1){ // -1 ? 값이 없음을 의미. > API확인
				break;
			}//if

			char c = (char)i;
			System.out.print(c);

			readCount++;
		}//while
	}catch(FileNotFoundException e){
		e.printStackTrace();
	
	}catch(IOException e1){
		e1.printStackTrace();
	}finally{
		System.out.println("\n\n ========================================");
		System.out.println("========>>> read 횟수 readCount : " + readCount);
		System.out.println("=============================================");
	}try{
		fis.close();
	}catch(Exception e){
		e.printStackTrace();
	}

	}//end of main
}//end of class