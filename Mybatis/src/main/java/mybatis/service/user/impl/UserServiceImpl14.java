package mybatis.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import mybatis.service.domain.Search;
import mybatis.service.domain.User;
import mybatis.service.user.UserDao;
import mybatis.service.user.UserService;

@Service("userServiceImpl14")
public class UserServiceImpl14 implements UserService{
	
	//Field
	@Autowired
	@Qualifier("userDaoImpl14")
	UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		System.out.println("::"+getClass()+".setUserDao Call....");
		this.userDao = userDao;
	}
	
	//Constructor
	public UserServiceImpl14() {
		System.out.println("::"+getClass()+"default Constructor Call...");
	}
	
	//method
		//회원정보 :: insert(회원가입)
		public int addUser(User user)throws Exception{
			int result = 0;
			System.out.println(">>>>>>>>>>>>>>> 1번째 insert ===================");
			result = userDao.addUser(user);
			System.out.println(">>>>>>>>>>>>>>> 1번째 insert 결과 : "+result);
			System.out.println(">>>>>>>>>>>>>>> 2번째 insert ===================");
			result = userDao.addUser(user);
			System.out.println(">>>>>>>>>>>>>>> 2번째 insert 결과 : "+result);
			System.out.println(">>>>>>>>>>>>>>> 결과는 ???? =====================");
			return 0;
//			return userDao.addUser(user);
		}
		
		//회원정보 :: select (회원정보를 검색)
		public User getUser(String userId)throws Exception{
			return userDao.getUser(userId);
		}
		
		//회원정보 :: update (회원정보를 변경)
		public int updateUser(User user)throws Exception{
			return userDao.updateUser(user);
		}
		
		//회원정보 :: delete (회원정보를 삭제)
		public int removeUser(String userId)throws Exception{
			return userDao.removeUser(userId);
		}
		
		//회원정보 :: select (모든 회원정보 검색)
		public List<User>getUserList(Search search)throws Exception{
			return userDao.getUserList(search);
		}
}
