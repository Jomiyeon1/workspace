package March.miyeon08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prob5_1 {

	public static void printEmployeeList(String cityName, String deptName) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url,"hr","hr");
	    Statement stmt = con.createStatement();
		
		 ResultSet rs = stmt.executeQuery("select\r\n"
		 		+ "l.city, d.department_name, e.first_name, e.salary\r\n"
		 		+ "from employees e, departments d, locations l\r\n"
		 		+ "where e.department_id = d.department_id AND\r\n"
		 		+ "         d.location_id = l.location_id AND\r\n"
		 		+ "         lower(city) like '%"+ cityName +"%' AND lower(d.department_name) like '%"+deptName+"%'");
		while(rs.next()) {
			System.out.println(rs.getString(1) +"\t"+ rs.getString(2) +"\t"+ rs.getString(3) + "\t" + rs.getInt(4) );
		
		}
		rs.close();
		stmt.close();
		con.close();
	}
	public static void main(String[] args) throws Exception{
		//printEmployeeList("lon", "resource");
		printEmployeeList("south", "it");
	}

}
