package day08;

//package jp03.part04;

import java.io.*;

/*
	1. read() Method ���� ȿ������ method�� �����ϴ� class ���
	2. Sink steam : Data�� ���� �ְ� �޴� �ܼ������ Stream
	   Filter stream : Sink Stream�� ���� ���� Data�����ϴ� Stream ���� ����
*/

public class BufferedReaderTest{
	//main
	public static void main(String args[]) throws Exception{
		//read �� count�� ���� ����
		int readCount = 0;

		//SinkStream ==> ���ܿ��� �ܼ� ����¸� ���
		FileReader fr = new FileReader(args[0]);
		//FilterStream ==> �߰����� ����� ����
		BufferedReader br = new BufferedReader(fr);

		//==>�� �� line �� �Ʒ��� ������.
		//BufferedReader br = new BufferedReader(new FileReader(args[0]));

		String oneLine = null;

		while(true){
			readCount++;

			oneLine = br.readLine(); //APIȮ��
			if(oneLine == null){ //APIȮ��
				break;
			}
			System.out.println("���� ��� : " + readCount + " " + oneLine);
		}//while

		//Stream close
		br.close();
		fr.close();
	}//end of main
}//end of class