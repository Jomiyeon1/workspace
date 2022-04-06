package mybatis.service.user;

import java.util.List;

import mybatis.service.domain.Search;
import mybatis.service.domain.User;


//회원관리 서비스 비지니스 로직을 추상화한 인터페이스 
//component : interface로 캡슐화된 재사용가능한 lib
	public interface UserService{
		
		public int addUser(User user)throws Exception;
		
		public User getUser(String userId)throws Exception;
		
		public int updateUser(User user)throws Exception; 
		
		public int removeUser(String userId)throws Exception;
		
		public List<User>getUserList(Search search)throws Exception; 
		
	}

