package Example;

import java.sql.*;

public class Example04 {

	public static void main(String[] args) throws Exception {

		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);		
		Connection con = DriverManager.getConnection(url,"scott","tiger");
/*		
		Statement stmt = con.createStatement();
*/		
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM member");
//		ResultSet rs = stmt.executeQuery("SELECT * FROM member"); 
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
		
		String no = rs.getString("no");
		String id = rs.getString("id");
		String pwd = rs.getString("pwd");
		
		System.out.println("회원정보 => 번호 : " + no + ", id : " + id + ", pwd : " + pwd);
		}
		
		//rs.close();
		pstmt.close();
		con.close();


		
	}


}
