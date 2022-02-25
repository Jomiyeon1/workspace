package day08;
//package jp03.part06;

import java.io.*;

/*
	- ObjectInputStream�� �̿� Persistence data(File)�� �����
	  ȸ�������� ���� UserVo instance��(��ü�� ���¸� ���´�/����������)�о�´�.
*/

public class ReadObjectFile{
	//main
	public static void main(String[] args) throws Exception{
		// 1. File���� instance�� ���� SinkStream :: FileInputStream ����
		// 2. instance�� ���� SinkStream :: ObjectInputStream ����
		ObjectInputStream ois 
			= new ObjectInputStream(new FileInputStream("UserInfo.obj"));

		UserVO user01 = (UserVO)ois.readObject(); // => API Ȯ��. ����� ����ȯ ����?
		UserVO user02 = (UserVO)ois.readObject(); // => API Ȯ��. ����� ����ȯ ����?

		System.out.println("1��° ȸ������::" + user01);
		System.out.println("2��° ȸ������::" + user02);

		//Stream close()
		ois.close();

	}
}