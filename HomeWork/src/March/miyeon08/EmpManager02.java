package March.miyeon08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager02 {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String jobs[]) throws SQLException{
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = DriverManager.getConnection(dburl,"hr","hr");
		Statement stmt = conn.createStatement();
		
	
		ResultSet rs = stmt.executeQuery("select\r\n"
											+ "e.employee_id, e.first_name, e.salary\r\n"
											+ "from employees e, jobs j\r\n"
											+ "where e.job_id = j.job_id AND\r\n"
											+ "j.job_title IN ('"+jobs[0] +","+ jobs[1] + "')");
		
		
		
		while(rs.next()) {
			System.out.println(rs.getString("employee_id") +"\t"+ rs.getString("first_name") +"\t"+ rs.getInt("salary")	);
		}
		
	}
	
	public static void main(String[] args) throws SQLException{
		String[] jobs = {"Accountant", "Stock Clerk"};
		new EmpManager02().printEmployee(jobs);

	}

}
