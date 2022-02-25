package day08;
//package jp03.part02;

/*
	1. byteó���� ���� Stream�� input/output Stream�� �̿��Ͽ�
	   keyboard�� �Է�, monitor�� ����ϴ� ��
	2. �ѱ�ó��(����ó��)�� ���Ͽ� Reader/Writer�迭�� �ٲپ� �Է�, ���

*/

import java.io.*;

public class WriterTest{
	//main
	public static void main(String[] args){
	
		try{
			//InputStream :: ǥ���Է���ġ �߻�ȭ�� class
			//InputStream inputStream = System.in;
			//����ó���� ���� Reader�� ����
			//Reader reader = new InputStreamReader(inputStream);
			//�� �� �ڵ带 �ϴ�ó�� �ٲ� �� �ִ�.
			Reader reader = new InputStreamReader(System.in);
			
			

			//OutputStream :: ǥ�������ġ �߻�ȭ�� class
			//OutputStream outputStream = System.out;
			//����ó���� ���� Writer�� ����
			//Writer writer = new OutputStreamWriter(outputStream);
			// �� �� �ڵ带 �ϴ�ó�� �̿��� �� �ִ�.
			Writer writer = new OutputStreamWriter(System.out);
			
			System.out.println("�Է��� ��ٸ��ϴ�....");

			while(true){
				int i = reader.read();
				writer.write(i);
			//		writer.flush();

				if( (char)i == 'x'){
					break;
				}//if
			}//while
			// ==> while �� ������ flush()�� ���� flush()�� �ǹ̴�?
			// flush()�� ���߿����� �Է¹��� �͵�(���ۿ� ����� ��)�� �ѹ��� ����Ѵ�.
			// while���ȿ� flush()�� ���� �Է°� ���ÿ� ��µ�.
			writer.flush();

			//Stream close()
			reader.close();
			writer.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}//end of class