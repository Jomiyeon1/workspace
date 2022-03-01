package february.miyeon28;
import java.util.Vector;

public class Prob02 {
	
	//method
	public Vector<String> dataChange(String[] strData){
		Vector<String> v;
		
		for(int i = 0; i < strData.length; i++) {
			String str = strData[i];
			v[i] = str.reverse();
		}
		
		return v;
	}
	
	//main
	public static void main(String[] args) {
		
		Prob02 st = new Prob02();
		String[] strData = {"Java Progrmming", "JDBC", "Oracle 10g", "Jsp/Servlet"};
		Vector<String> v = st.dataChange(strData);
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.elementAt(i));
		}//end of for
	}//end of main

}//end of class
