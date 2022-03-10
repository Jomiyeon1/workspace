package Example;

import java.sql.*;
import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,"scott","tiger");
		
		//Statement stmt = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("no �Է� : ");
		int no = sc.nextInt();
		
		System.out.println("id �Է� : ");
		String id = sc.next();
		
		System.out.println("pwd �Է� : ");
		String pwd = sc.next();
/*		
		
		String sql1 = "INSERT INTO member VALUES(" + no + ", '" + id +"', '"+ pw + "'  )";
		
		int i = stmt.executeUpdate(sql1);
		System.out.println("insert ���� : " + i + "���� ���� ����������ϴ�.");
*/
		PreparedStatement pstmt = con.prepareStatement("insert into member values(?,?,?)");
		pstmt.setInt(1, no);
		pstmt.setString(2, id);
		pstmt.setString(3, pwd);
		int confirm = pstmt.executeUpdate();
		
		if(confirm == 1) {
			System.out.println("number table data insert �Ϸ�");
		}else {
			System.out.println("number table data insert ����");
		}
		
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
		
	}

}
