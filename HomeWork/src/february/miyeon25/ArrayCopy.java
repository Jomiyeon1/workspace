package february.miyeon25;

import java.util.Vector;

public class ArrayCopy {
	
	public Vector<String> moveToVector(String[] datas){
		// �迭�� ������ �Ųٷ� ����ϴ� �޼ҵ� �ϼ�
		//  ex> �迭�� 1,2,3,4,5 ��� 5,4,3,2,1�� ��µǵ��� ����� 
		
		// �Է¹��� �迭������ Vector ����.
		Vector<String> v = new Vector<String>(datas.length);
		
		for(int i = datas.length-1; i > -1; i--) {
			//������ ���� �Ųٷ� v�� ���
			v.add(datas[i]);
			
			
		}//for
				
		return v;
	}//end of method
	
	//main
	public static void main(String[] args) {
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
		//System.out.println(ac.moveToVector(datas).toString());
		
		//Vector<String> result = ac.ac.moveToVector(datas);
		//System.out.println(result);
		
		//toString() O/R�Ǿ� �ִٴ� �� �� �� �ִ�.
		
		

	}//end of main

}//end of class
