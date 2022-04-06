package mybatis.service.user.impl;

import java.util.List;

import mybatis.service.domain.Search;
import mybatis.service.domain.User;
import mybatis.service.user.UserDao;
import mybatis.service.user.UserService;

// 회원관리 서비스 비지니스로직을 추상화환 인터페이스 구현
//component : 인터페이스로 캡슐화된 재사용가능한 라이버리 
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
	//회원정보 :: insert(회원가입)
	public int addUser(User user)throws Exception{
		return userDao.addUser(user);
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
