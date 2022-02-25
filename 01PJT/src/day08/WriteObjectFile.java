package day08;
//package jp03.part06;

import java.io.*;

/*
	-ObjectOutputStream을 이용한 회원정보를 갖는 UserVO instance를
	 (객체는 상태를 갖는다/ 상태정보를) persistence data(file)로 저장
*/

public class WriteObjectFile{
	//main
	public static void main(String[] args) throws Exception{
	
		//1. instance 를 File에 저장할 SinkStream :: FileOutputStream 생성
		//2. instance 를 전송하는 FileStream :: ObjectOutputStream 생성
		ObjectOutputStream oss
			= new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

		oss.writeObject(new UserVO(1, "홍길동")); // ==> API 확인
		oss.writeObject(new UserVO(2, "홍길순")); // ==> API 확인
		oss.flush();

		//Stream close();
		oss.close();

	}//main
}//class
