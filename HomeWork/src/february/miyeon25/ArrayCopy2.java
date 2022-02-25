package february.miyeon25;

import java.util.List;
import java.util.Vector;

public class ArrayCopy2 {
	
	//처음 과제는 모든 것을 Vector로 사용했지만,
	// 해당 부분은 List로 변경하고, 인스턴스를 Vector로 생성했다.
	// 이렇게 작성하는 것을 interface기반 코딩이라고 하며,
	// 프로그램이 유연해진다. List로 만들었기 때문에, 인스턴스생성부분을
	//ArrayList등 List의 하위클래스로 변경해도 문제가 없다.
	
	//또한, 값을 반대로 담아 출력하는 부분은 값을 거꾸로 담지않고,
	//Stack에 그대로 담아서 출력해도 가능하다.
	
	public List<String> moveToVector(String[] datas){
		// 배열의 순서를 거꾸로 출력하는 메소드 완성
		//  ex> 배열이 1,2,3,4,5 라면 5,4,3,2,1로 출력되도록 만들기 
		
		// 입력받은 배열길이의 Vector 선언.
		List<String> v = new Vector<String>(datas.length);
		
		for(int i = datas.length-1; i > -1; i--) {
			//데이터 값을 거꾸로 v에 담기
			v.add(datas[i]);
			
			
		}//for
				
		return v;
	}//end of method
	
	//main
	public static void main(String[] args) {
		ArrayCopy2 ac = new ArrayCopy2();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));

		

	}//end of main

}//end of class
