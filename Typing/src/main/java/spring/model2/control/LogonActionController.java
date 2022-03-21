package day0318;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.control.Controller;
import spring.model2.service.user.dao.UserDao;
import spring.model2.service.user.vo.UserVO;

import jspJava.UserDao;
import jspJava.UserVO;

public class LogonActionController implements Controller{
	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("[LogonActionController.execute() start....]");
		
		HttpSession session = req.getSession(true);
		
		//==>Controller :����/���� ó��
		//==>session ObjectScope����� UserVO��ü �̿� ����
		//==>���1: session ObjectScope�� userVO�ν��Ͻ� ���� �� ����
		if(session.isNew()||session.getAttribute("userVO")==null) {
			session.getAttribute("userVO",new UserVO());
		}
		
		//==> ��� 2: session ObjectScope userVO����
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		
		//==>controller: Navigation(forward/sendRedirect view page����)
		//navigation ����Ʈ ������ ����
		String requestPage = "/user/logon.jsp";
		
		//==>UserVO.active �̿� �α��� ���� �Ǵ�
		if(userVO.isActive()) {
			requestPage ="/user/home.jsp";
		}
		//==> �α����� ȸ���� �ƴ϶��
		else {
			//client form dataó��
			String userId = req.getParameter("userId");
			String userPasswd = req.getParameter("userPasswd");
			
			//controller: model�� view�� ���� binding
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
		}
		
		//controller: business logicó��
		UserDao userDao = new UserDao();
		userDao.getUser(userVO);
		
		//controller navigation
		if(userVO.isActive()) {
			requestPage="/user/home.jsp";
		}
	}
	
	RequestDispatcher rd = req.getRequestDispatcher(requestPage);
	rd.forward(req,res);
	
	System.out.println("[LogonActionController.execute(0 end....]");

}