package March.miyeon02;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Stack;

public class FileController {
	public void reverseLine(String oldf, String newf) throws Exception {
		BufferedReader fis = new BufferedReader(new FileReader(oldf));
		//FileInputStream fis = new FileInputStream(new File("C:\\workspace\\01PJT\\oldf.txt"));
		Stack<String> stack = new Stack<String>();
		PrintWriter bw = new PrintWriter(new FileOutputStream(newf));
		
		String str = "";
		while((str = fis.readLine()) != null ) {
			stack.push(str);
			
		}
		while(!stack.isEmpty()) {
			bw.println(stack.pop());
		}
		fis.close();
		
		
		
//		for(int i = 0; i < stack.size();i++) {
			
//		}
		bw.flush();
		bw.close();
		
	}
	public static void main(String[] args) throws Exception{
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf = "files/newf.txt";
		c.reverseLine(oldf, newf);

	}

}
