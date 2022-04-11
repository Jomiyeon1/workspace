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
		//ȸ������ :: insert(ȸ������)
		public int addUser(User user)throws Exception{
			int result = 0;
			System.out.println(">>>>>>>>>>>>>>> 1��° insert ===================");
			result = userDao.addUser(user);
			System.out.println(">>>>>>>>>>>>>>> 1��° insert ��� : "+result);
			System.out.println(">>>>>>>>>>>>>>> 2��° insert ===================");
			result = userDao.addUser(user);
			System.out.println(">>>>>>>>>>>>>>> 2��° insert ��� : "+result);
			System.out.println(">>>>>>>>>>>>>>> ����� ???? =====================");
			return 0;
//			return userDao.addUser(user);
		}
		
		//ȸ������ :: select (ȸ�������� �˻�)
		public User getUser(String userId)throws Exception{
			return userDao.getUser(userId);
		}
		
		//ȸ������ :: update (ȸ�������� ����)
		public int updateUser(User user)throws Exception{
			return userDao.updateUser(user);
		}
		
		//ȸ������ :: delete (ȸ�������� ����)
		public int removeUser(String userId)throws Exception{
			return userDao.removeUser(userId);
		}
		
		//ȸ������ :: select (��� ȸ������ �˻�)
		public List<User>getUserList(Search search)throws Exception{
			return userDao.getUserList(search);
		}
}
