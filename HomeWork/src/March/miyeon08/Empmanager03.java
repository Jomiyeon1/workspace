package March.miyeon08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Empmanager03 {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//method
	public void printEmployee(String city, int lo, int hi) throws SQLException {
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = DriverManager.getConnection(dburl,"hr","hr");
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select\r\n"
				+ "e.last_name, d.department_name\r\n"
				+ "from employees e, departments d, locations l\r\n"
				+ "where e.department_id = d.department_id AND\r\n"
				+ "         d.location_id = l.location_id AND\r\n"
				+ "         e.salary between " +lo+ " and "+hi+" AND\r\n"
				+ "         l.city IN '"+city+"'");
		
		while(rs.next()) {
			System.out.println(rs.getString(1) +"\t"+ rs.getString(2) );
		
		}
	}
	public static void main(String[] args) throws SQLException {
		new Empmanager03().printEmployee("South San Francisco", 7000, 10000);

	}

}
