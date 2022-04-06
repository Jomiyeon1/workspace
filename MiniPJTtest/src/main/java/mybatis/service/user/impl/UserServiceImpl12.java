package mybatis.service.user.impl;

import java.util.List;

import mybatis.service.domain.Search;
import mybatis.service.domain.User;
import mybatis.service.user.UserDao;
import mybatis.service.user.UserService;

// ȸ������ ���� �����Ͻ������� �߻�ȭȯ �������̽� ����
//component : �������̽��� ĸ��ȭ�� ���밡���� ���̹��� 
public class UserServiceImpl12 implements UserService{
	
	//field
	UserDao userDao; 
	
	public void setUserDao(UserDao userDao) {
		System.out.println("::"+getClass()+".setUserDao Call.....");
		this.userDao = userDao;
	}

	//constructor
	public UserServiceImpl12() {
		System.out.println("::"+getClass()+"defalut Constructor Call...");
	}
	
	//method
	//ȸ������ :: insert(ȸ������)
	public int addUser(User user)throws Exception{
		return userDao.addUser(user);
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
