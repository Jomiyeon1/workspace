package March.miyeon08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class EmpManager {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//method
	public void printEmployee(String name, int salary ) throws SQLException{
		
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = DriverManager.getConnection(dburl,"hr","hr");
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select\r"
										+ "employee_id, first_name, salary\r"
										+ "from employees\r"
										+ "where salary >" + salary + " AND lower(first_name) like'%"+ name + "%'");
		
		
	
		while(rs.next()) {
			System.out.println(rs.getString("employee_id") +"\t"+ rs.getString("first_name") +"\t"+ rs.getInt("salary") );
		
		}
	}
	
	
	public static void main(String[] args) throws SQLException{
		
		new EmpManager().printEmployee("al", 4000);
		

	}

}
