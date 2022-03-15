package March.miyeon08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmpStatistics {
	
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
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url,"hr","hr");
		Statement stmt = con.createStatement();
		String sql = "SELECT j.job_title, avg(e.salary)\r"
				+ "from employees e, jobs j\r"
				+ "where e.job_id = j.job_id\r"
				+ "GROUP BY j.job_title\r"
				+ "HAVING avg(e.salary) >= \r" + maxSalary
				+ "ORDER BY avg(e.salary) desc";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		
		while(rs.next()) {
			System.out.println("[" + rs.getString("job_title") + "]" + rs.getInt("avg(e.salary)") );
			
		}
		rs.close();
		stmt.close();
		con.close();
		
	}//end of method
	
	//main
	public static void main(String[] args) throws SQLException{
		
		
		int maxSalary = 10000;
		new EmpStatistics().printStatistice(maxSalary);
		
		maxSalary = 15000;
		new EmpStatistics().printStatistice(maxSalary);
		

	}//end of main

}//end of class
