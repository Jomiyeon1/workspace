package day08;
//package jp03.part01;

/*
	1. java.io package : ���α׷� �ܺη� �ڿ��� �ްų�(?), ����(?)�� ��쿡 ���.
	2. keyboard �� ���� data�� �о���̸�..
*/

import java.io.*;

public class InputTest{
	


	//main
	public static void main(String args[]){
		System.out.println(args[0]);
		//InputStram :: ǥ���Է���ġ �߻�ȭ�� class
		InputStream inputStream = System.in;

		System.out.println("�Է��� ��ٸ��ϴ�.......");
	
		try{
			//���� �о���̴� ���� loop����
			while(true){
				
				//1. java.io �� ����(block)�� �� �ִ�.
				int i = inputStream.read();
				char c = (char)i;

				//2. java.io�� FIFO����
				System.out.println("�Է��Ͻ� �� : " + c);

				//==> char 'x'�� �ԷµǸ� while�� ����
				if(c == 'x'){
					inputStream.close();
					break;
				}
			
			//�ѱ� �Է� �� ������. �ѱ� 1EA�� 2�� ����� ���� Ȯ��
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}//end of main
}//end of class