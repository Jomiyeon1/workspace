package jdbc;

import java.sql.*;
/*
 * 1. JDBC Programming ����
 * 2. ������ JDBC Programming �������� �߻��ϴ� Exception����
 * 3. executeQuery(SQL), executeUpdate(SQL) Method����
 * */

public class CreateJDBC {
	//main
	public static void main(String[] args) {
		//JDBC ������ �ʿ��ν��Ͻ� �� ���� ����
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		//1.connection :: login ������ �߻�ȭ�� interface
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. driver loading OK");
		}catch(ClassNotFoundException e){
			System.out.println("\n ==> Driver Loading�� Exception �߻� \n");
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("2. connection �ν��Ͻ� ���� �Ϸ�");
		}catch(SQLException e) {
			System.out.println("\n ==> JDBC���� �� Exception �߻�" + e.getErrorCode());
			e.printStackTrace();
		}
		
		//2. Statement :: Query ������ �߻�ȭ�� interface
		try {
			stmt = con.createStatement();
			System.out.println("3.statement ��ü ���� �Ϸ�");
		}catch (SQLException e) {
			System.out.println("\n ==> JDBC���� �� Exception �߻�" + e.getErrorCode());
			e.printStackTrace();
		}
		
		//Create Query �����
		String createSql =
				"CREATE TABLE firstJDBC"+
				"(no		NUMBER(3)," +
				"name 		VARCHAR2(20),"+
				"email		VARCHAR2(30),"+
				"address 	VARCHAR2(50) )";
		
		try { 
			System.out.println(":: Query ���۰�� " + stmt.executeUpdate(createSql));
			System.out.println("4.query ���ۿϷ�");
		}catch (SQLException e) {
			System.out.println("\n ==> JDBC���� �� Exception �߻�" + e.getErrorCode());
			e.printStackTrace();
		}
		try {
			if (stmt != null){
				stmt.close();
				}
			if (con != null) {
				con.close();
			}
		}catch (SQLException e) {
			System.out.println("\n ==> JDBC���� �� Exception �߻�" + e.getErrorCode());
			e.printStackTrace();
		}
	}//end of main
}// end of class
