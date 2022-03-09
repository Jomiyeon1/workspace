package jdbc;

import java.sql.*;
/*
 * :: PreparedStatement
 * 1. 반복적 같은 SQL 수행 시 효율적
 * 2. 가독성, 사용편의성(?) 유용
 * 3. Binary Data 입력시 유용 
 * */
public class PreparedStmtTest{
	//main
	public static void main(String[] args)  throws Exception{
		
		//입력 Data Validation check
		if(args.length != 3) {
			System.out.println("실행 방법 java Example02 [no값] [id값] [pwd값]");
			System.exit(0);
		}
		
		int no = Integer.parseInt(args[0]);
		String id = args[1];
		String pwd = args[2];
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		//1단계 : Connection
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection con = DriverManager.getConnection(url,"scott","tiger");

		//////////////////////////////////////////////////////////////
		// Statement / PreparedState 비교 이해
		
		// =============== Statement  ==================//
		//Statement stmt = con.createStatement();
		//String createSql = "insert into member values("+no+",'''+id+''','''+ pwd +''')";
		//int confiem = stmt.executeUpdate(createSql);
		
		//============= PreparedStatement 사용 ============//
		//PreparedStatement 인스턴스 생성시 SQL 구성
		PreparedStatement pstmt = con.prepareStatement("insert into member values(?,?,?)");
		
		//PreparedStatement method 사용 data set (''불필요)
		pstmt.setInt(1, no);
		pstmt.setString(2, id);
		pstmt.setString(3, pwd);
		int confirm = pstmt.executeUpdate();
		///////////////////////////////////////////
		
		if(confirm == 1) {
			System.out.println("number table data insert 완료");
		}else {
			System.out.println("number table data insert 실패");
		}
		
		if(pstmt != null) pstmt.close();
		if(con != null) con.close();
		
		
	}//end of main

}//end of class
