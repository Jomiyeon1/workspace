package day08;
//package jp03.part06;

import java.io.*;

/*
	-ObjectOutputStream�� �̿��� ȸ�������� ���� UserVO instance��
	 (��ü�� ���¸� ���´�/ ����������) persistence data(file)�� ����
*/

public class WriteObjectFile{
	//main
	public static void main(String[] args) throws Exception{
	
		//1. instance �� File�� ������ SinkStream :: FileOutputStream ����
		//2. instance �� �����ϴ� FileStream :: ObjectOutputStream ����
		ObjectOutputStream oss
			= new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

		oss.writeObject(new UserVO(1, "ȫ�浿")); // ==> API Ȯ��
		oss.writeObject(new UserVO(2, "ȫ���")); // ==> API Ȯ��
		oss.flush();

		//Stream close();
		oss.close();

	}//main
}//class
