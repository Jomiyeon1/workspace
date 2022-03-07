package february.miyeon28;
import java.util.Vector;

public class Prob02 {
	
	//method
	public Vector<String> dataChange(String[] strData){
		Vector<String> v =new Vector<String>();
		
		for(int i = strData.length-1 ; i >= 00 ; i--) {
			StringBuffer sb = new StringBuffer(strData[i]);
			sb.reverse();
			v.addElement(sb.toString());
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
