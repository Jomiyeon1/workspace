package mybatis.service.user.test;

import mybatis.service.domain.User;
import mybatis.service.user.UserDao;
import mybatis.service.user.UserService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/commonservice14.xml"})
public class UserServiceTest {

	//==>@RunWith,@ContextConfiguration 로 지정된 구현체가 Meta-data를 이용 Wiring
	//==> 한 각 객체를 Injection함
	@Autowired
	@Qualifier("userServiceImpl14")
	private UserService userService;
	
	@Autowired
	@Qualifier("userDaoImpl14")
	private UserDao userDAO;
	
	//==>Test한 코드 작성
	@Test
	public void testAddUser() throws Exception{
		System.out.println("\n=================");
		User user = new User("user04", "주몽","user04",null,0);
		System.out.println("insert결과:"+userService.addUser(user));
		System.out.println("delete결과:"+userDAO.removeUser(user.getUserId()));
		
		
		//==>API확인::주석을 풀고 확인하면..
		//==>아래의 1을 0으로 변경 해보면...
		Assert.assertEquals(1, userService.addUser(user));
		Assert.assertEquals(1, userDAO.removeUser(user.getUserId()));
		System.out.println("======================\n");
	}
	
	//==>@test를 주서ㄱ처리하고 실행하면...
	//==>
	@Test
	public void testGetUser() throws Exception{
		System.out.println("\n===============");
		User user = userService.getUser("user01");
		System.out.println(user);
		
		//==>API확인:: 주석을 풀고 확인하면..
		Assert.assertEquals("user01",user.getUserId());
		//Assert.assertEquals("user01",user.getUserId());
		Assert.assertNotNull(userService.getUser("user02"));
		//Assert.assertNoNull(userService.getUser("user05"));
		System.out.println("==========================\n");
	}
	
	//==> 주석을 풀고 실행하면..
	//@Test
	public void testGetUserList() throws Exception{
		//===> Test code작성
	}
	
	//===> 주석을 풀고 실행하면
	//@Test
	public void testUpdateUser() throws Exception{
		//==>Test code작성
	}
}
