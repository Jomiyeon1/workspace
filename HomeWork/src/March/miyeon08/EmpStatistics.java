package March.miyeon08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class EmpStatistics {
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String driver = "oracle.jdbc.driver.OracleDriver";
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//method
	public void printStatistice(int maxSalary) throws SQLException{
		
		
		System.out.println("==============================");
		System.out.println("MaxSalary : " + maxSalary);
		System.out.println("==============================");
		
		Connection con = DriverManager.getConnection(url,"hr","hr");
		
		
		
		
	}//end of method
	
	//main
	public static void main(String[] args) throws SQLException{
		
		
		int maxSalary = 10000;
		new EmpStatistics().printStatistice(maxSalary);
		
		maxSalary = 15000;
		new EmpStatistics().printStatistice(maxSalary);
		

	}//end of main

}//end of class
