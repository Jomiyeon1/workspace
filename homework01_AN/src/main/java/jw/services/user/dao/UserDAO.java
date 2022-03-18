package jw.services.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jw.common.pool.OracleConnectionPool;
import jw.services.user.vo.UserVO;
/* 
 * FileName : UserDAO.java
 * ㅇ AbstarctDAO공유하면 회원관리 Service를 담당하는 DAO
*/
public class  UserDAO{
	///Field 
	
	///constructor
	public UserDAO(){
	}
		
	//DB에서 Data를 insert 하는method
	public void addUser(UserVO userVO){
		//JDBC을 이용하기 위한 객체 생성
		Connection con = null;
		PreparedStatement pStmt = null;
		try{		
			//1단계 connetion하기(login과정)
			con = OracleConnectionPool.getInstance().getConnection();
			//2단계 insert query 문을 전송하는단계 
			pStmt = con.prepareStatement(	"insert " +
																"into users ( no, id, pwd) " +
																"values( ? , ? , ? )" );
			pStmt.setInt(1,userVO.getNo());
			pStmt.setString(2,userVO.getId());
			pStmt.setString(3,userVO.getPwd());

			//3단계 결과값 확인하기 => DB에 data insert 유무확인 ...
			if( 1 == pStmt.executeUpdate()){    
				userVO.setActive(true);
			}
		}catch(Exception e){		
			e.printStackTrace();
		}finally{
			//각각의 DB와 관련된 객체 close
			if(pStmt != null){
				try{	
					pStmt.close();	
				}catch(Exception e2){  }
			}
			if(con != null){
				try{	
					con.close();	
				}catch(Exception e3){  }
			}
		}
	}//end of addUser()
	
}//end of class	