package jw.services.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jw.common.pool.OracleConnectionPool;
import jw.services.user.vo.UserVO;
/* 
 * FileName : UserDAO.java
 * �� AbstarctDAO�����ϸ� ȸ������ Service�� ����ϴ� DAO
*/
public class  UserDAO{
	///Field 
	
	///constructor
	public UserDAO(){
	}

	//DB���� Data�� insert �ϴ�method
	public void addUser(UserVO userVO){
		//JDBC�� �̿��ϱ� ���� ��ü ����
		Connection con = null;
		PreparedStatement pStmt = null;
		try{		
			//1�ܰ� connetion�ϱ�(login����)
			con = OracleConnectionPool.getInstance().getConnection();
			//2�ܰ� insert query ���� �����ϴ´ܰ� 
			pStmt = con.prepareStatement(	"insert " +
																"into users ( no, id, pwd) " +
																"values( ? , ? , ? )" );
			pStmt.setInt(1,userVO.getNo());
			pStmt.setString(2,userVO.getId());
			pStmt.setString(3,userVO.getPwd());

			//3�ܰ� ����� Ȯ���ϱ� => DB�� data insert ����Ȯ�� ...
			if( 1 == pStmt.executeUpdate()){    
				userVO.setActive(true);
			}
		}catch(Exception e){		
			e.printStackTrace();
		}finally{
			//������ DB�� ���õ� ��ü close
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
	
	//ȸ������(ȸ�����)�� select �Ͽ� UserVO �� return �ϴ� method
	public UserVO findUser(String id){
		//JDBC�� �̿��ϱ� ���� ��ü ����
		UserVO userVO = new UserVO();
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try{		
			//1�ܰ� connetion�ϱ�(login����)
			con = OracleConnectionPool.getInstance().getConnection();

			//2�ܰ� query(select id,pwd from users)���� �����ϴ´ܰ� 
			pStmt = con.prepareStatement("select no,id,pwd from users where id=?");
			pStmt.setString(1, id);
			rs = pStmt.executeQuery();
			//3�ܰ� ����� Ȯ���ϱ�
			//==> 1. select�� ��� UserVO��üȭ
			//==> 2. ȸ�������� ���� UserVO ��ü ArrayList������
			if(rs.next()){    
				userVO.setNo( rs.getInt("no") );
				userVO.setPwd( rs.getString("pwd") );
				userVO.setId( rs.getString("id") );
				//==> userVO�� ������ Ȯ���ϸ�...(console Ȯ�ο��...)
				System.out.println(userVO);
				//==> arrayList�� UserVO��ü add
			}
		}catch(Exception e){		
			e.printStackTrace();
		}finally{
			//������ DB�� ���õ� ��ü close
			if(rs != null){
				try{	
					rs.close();	
				}catch(Exception e1){  }
			}
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
		//==> ȸ����� ������ ���� ArrayList��ü return 
		return userVO;
	}//end of getUser()


}//end of class	