package day08;

//package jp03.part05;

import java.io.*;

/*
	==> ketboard�� �Է¹��� ���� test.txt�� ������ Apllication �ۼ�
*/

public class FileWriterTestFilter02{
	//main
	public static void main(String[] args) throws Exception{

		//�ʿ� ��ü Stream/String �ν��Ͻ� declaration
		BufferedReader br = null;
		BufferedWriter bw = null;

		// keyboard �� �Է¹ޱ� ���� Sink Stream Reader ��
		// 1���� line�� �б� ���� readLine() method�� �����ϴ� BufferedReader����
		// Reader r = new InputStreamReader(System.in);
		// br = new BufferesReader(r);
		br = new BufferedReader( new InputStreamReader(System.in));

		//File�� ���� �������� FileWriter �� BufferWriter����
		//FileWriter fw = new FileWriter("test.txt");
		//bw = new BufferedReader(fw);
		bw = new BufferedWriter(new FileWriter("test.txt")); //==> APIȮ��
		//bw = new  BufferedWriter(new FileWriter("test.txt", true)); //==> APIȮ��

		System.out.println("���Ͽ� �����Ͻ� ���� �Է��ϼ���.");
		while(true){
			String str = br.readLine();
			if(str.equals("��")){
				break;
			}
			bw.write(str, 0, str.length()); //==> APIȮ��
			bw.newLine(); //==> APIȮ��(�ٹٲٱ�)
		}
		bw.flush(); //flush ���� ����!

		//Strem close
		br.close();
		bw.close();



	
	}
}