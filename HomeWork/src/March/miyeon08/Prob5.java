package March.miyeon08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prob5 {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("부서의 아이디를 입력하세요.");
			System.exit(1);
		}
		String dept_id = args[0];
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			con = DriverManager.getConnection(url,"hr","hr");
		    stmt = con.createStatement();
			
			 rs = stmt.executeQuery("select\r\n"
					+ "e.employee_id, d.department_name, e.salary, vt.avg_salary\r\n"
					+ "from employees e,(select\r\n"
					+ "	department_id, avg(salary) avg_salary\r\n"
					+ "	from employees\r\n"
					+ "	where department_id = " + dept_id + "group by department_id) vt, departments d\r\n"
					+ "where e.department_id = d.department_id AND\r\n"
					+ "e.department_id = vt.department_id");
			while(rs.next()) {
				System.out.println(rs.getString(1) +"\t"+ rs.getString(2) +"\t"+ rs.getInt(3) + "\t" + rs.getInt(4) );
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
