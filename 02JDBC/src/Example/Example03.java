package Example;

import java.sql.*;
import java.util.Scanner;


public class Example03 {

	public static void main(String[] args) throws Exception {

		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);		
		Connection con = DriverManager.getConnection(url,"scott","tiger");
		
		//Statement stmt = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ id �Է� : ");
		String id = sc.next();
		
		
		String sql = "DELETE FROM member WHERE id = '" + id +"'";
		
		//int i = stmt.executeUpdate(sql);
		//System.out.println("delete�� record ���� :" + i +"���� �����Ǿ����ϴ�.");
		PreparedStatement pstmt = con.prepareStatement("delete member where id = ?");
//		pstmt.setString(1, no);
//		pstmt.setInt(1, no);
		pstmt.setString(1, id);
//		pstmt.setString(3, pwd);
		
		int confirm = pstmt.executeUpdate();	
		
		
		if(confirm == 1) {
			System.out.println("number table data delete �Ϸ�");
		}else {
			System.out.println("number table data delete ����");
		}
		
		
		
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
		
	}

}
