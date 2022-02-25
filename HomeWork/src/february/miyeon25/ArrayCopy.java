package february.miyeon25;

import java.util.Vector;

public class ArrayCopy {
	
	public Vector<String> moveToVector(String[] datas){
		// 배열의 순서를 거꾸로 출력하는 메소드 완성
		//  ex> 배열이 1,2,3,4,5 라면 5,4,3,2,1로 출력되도록 만들기 
		
		// 입력받은 배열길이의 Vector 선언.
		Vector<String> v = new Vector<String>(datas.length);
		
		for(int i = datas.length-1; i > -1; i--) {
			//데이터 값을 거꾸로 v에 담기
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
		
		//toString() O/R되어 있다는 걸 알 수 있다.
		
		

	}//end of main

}//end of class
