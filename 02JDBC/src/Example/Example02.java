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
		System.out.println("no 입력 : ");
		int no = sc.nextInt();
		
		System.out.println("id 입력 : ");
		String id = sc.next();
		
		System.out.println("pwd 입력 : ");
		String pwd = sc.next();
/*		
		
		String sql1 = "INSERT INTO member VALUES(" + no + ", '" + id +"', '"+ pw + "'  )";
		
		int i = stmt.executeUpdate(sql1);
		System.out.println("insert 유무 : " + i + "개의 행이 만들어졌습니다.");
*/
		PreparedStatement pstmt = con.prepareStatement("insert into member values(?,?,?)");
		pstmt.setInt(1, no);
		pstmt.setString(2, id);
		pstmt.setString(3, pwd);
		int confirm = pstmt.executeUpdate();
		
		if(confirm == 1) {
			System.out.println("number table data insert 완료");
		}else {
			System.out.println("number table data insert 실패");
		}
		
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
		
	}

}
