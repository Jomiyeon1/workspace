package jw.common.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jw.common.dao.AbstractDao;
import jw.common.pool.OracleConnectionPool;
import jw.common.user.vo.UserVO;

// DAO ( Data Access Object Pattern) :: data ó�� ��ü
public class UserDao extends AbstractDao {

	// Constructor
	public UserDao() {

	}

	// Method
	public void getUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;

		try {
			// 1�ܰ� Connection
			con = this.connect();

			// 2�ܰ� Statement
			pStmt = con.prepareStatement("insert " + "into users1 ( name, gender, year, month, day, num, addr) "
					+ "values ( ? , ? , ?, ?, ?, ?, ? )");
			pStmt.setString(1, userVO.getName());
			pStmt.setString(2, userVO.getGender());
			pStmt.setString(3, userVO.getYear());
			pStmt.setString(4, userVO.getMonth());
			pStmt.setString(5, userVO.getDay());
			pStmt.setString(6, userVO.getNum());
			pStmt.setString(7, userVO.getAddr());

			// 3�ܰ� ResultSet
			rs = pStmt.executeQuery();

			if (rs.next()) {
				System.out.println("db���� Ȯ���� id, pwd ==> " + userVO.getName());
				// ==> Data�� �����Ѵٸ�..
				userVO.setActive(true);
			} else {
				System.out.println("db�� < " + userVO.getName() + " > �� �ش��ϴ� �ڷᰡ �����ϴ�. ");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pStmt, rs);
		}

	}

	public void addUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {

			con = OracleConnectionPool.getInstance().getConnection();
			System.out.println("Connection �Ϸ�");
			// 2�ܰ� Statement
			pStmt = con.prepareStatement("insert " + "into users1 ( name, gender, year, month, day, num, addr) "
					+ "values ( ? , ? , ?, ?, ?, ?, ? )");
			pStmt.setString(1, userVO.getName());
			pStmt.setString(2, userVO.getGender());
			pStmt.setString(3, userVO.getYear());
			pStmt.setString(4, userVO.getMonth());
			pStmt.setString(5, userVO.getDay());
			pStmt.setString(6, userVO.getNum());
			pStmt.setString(7, userVO.getAddr());

			// 3�ܰ� ResultSet
			rs = pStmt.executeQuery();
			System.out.println("insert �Ϸ�");

			if (rs.next()) {
				System.out.println("db���� Ȯ���� �̸� ==> " + userVO.getName());
				// ==> Data�� �����Ѵٸ�..
				userVO.setActive(true);
			} else {
				System.out.println("db�� < " + userVO.getName() + " > �� �ش��ϴ� �ڷᰡ �����ϴ�. ");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pStmt, rs);

		}
	}
		
		public UserVO findUser(String name) {
			UserVO vo = new UserVO();
			
			Connection con = null;
			PreparedStatement pStmt = null;
			ResultSet rs = null;
			
			try {
				
				con = OracleConnectionPool.getInstance().getConnection();
				System.out.println("Connection �Ϸ�");
				// 2�ܰ� Statement
				pStmt = con.prepareStatement("select * from users1 where name IN ?");
				pStmt.setString(1, name);
			
				// 3�ܰ� ResultSet
				rs = pStmt.executeQuery();

				
				if (rs.next()) {
					String dbname = rs.getString("name");
					String dbgender = rs.getString("gender");
					String dbyear = rs.getString("year");
					String dbmonth = rs.getString("month");
					String dbday = rs.getString("day");
					String dbnum = rs.getString("num");
					String dbaddr = rs.getString("addr");
					
					
					vo.setName(dbname);
					vo.setGender(dbgender);
					vo.setYear(dbyear);
					vo.setMonth(dbmonth);
					vo.setDay(dbday);
					vo.setNum(dbnum);
					vo.setAddr(dbaddr);
					vo.setActive(true);
					
					System.out.println(dbname);
					
				} else {
					System.out.println("db�� < " + vo.getName() + " > �� �ش��ϴ� �ڷᰡ �����ϴ�. ");

				}

			} catch (Exception e) {
				e.printStackTrace();
			}  finally {
				this.close(con, pStmt, rs);

			}
			return vo;
	}
		
		public void updateUser(UserVO userVO) {
			UserVO vo = new UserVO();
			
			Connection con = null;
			PreparedStatement pStmt = null;
			ResultSet rs = null;
			
			try {
				
				con = OracleConnectionPool.getInstance().getConnection();
				System.out.println("Connection �Ϸ�");
				// 2�ܰ� Statement
				pStmt = con.prepareStatement("update users1 set name = ?, gender = ?, year = ?, month = ?, day = ?, num = ?, addr = ? "
											+ "where name = ?");
				pStmt.setString(1, userVO.getName());
				pStmt.setString(2, userVO.getGender());
				pStmt.setString(3, userVO.getYear());
				pStmt.setString(4, userVO.getMonth());
				pStmt.setString(5, userVO.getDay());
				pStmt.setString(6, userVO.getNum());
				pStmt.setString(7, userVO.getAddr());
				pStmt.setString(8, userVO.getName());
			
				// 3�ܰ� ResultSet
				rs = pStmt.executeQuery();

			} catch (Exception e) {
				e.printStackTrace();
			}  finally {
				this.close(con, pStmt, rs);

			}
			
			
			
		}
}
