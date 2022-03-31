package spring.model2.control;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.service.user.dao.UserDao;
import spring.model2.service.user.vo.UserVO;

/*
 * FileName:ControlServlet
 * �� ����������(Single Point of Entry)
 * �� Client�䱸���� �Ǵ�(?)
 * �� ��ó��/����ó��
 * -Work Flow Control::����, ���� ��
 * -Client Form Data�ѱ� ó��
 * ��Business logic����(Bean Method Call)
 * �� Model�� View����
 * -Business Logic ó�� ��� JSP����
 * ��ó���� ����� ����,JSP�� forward/sendRedirect:Navigation
 */

public class ControlServlet__ extends HttpServlet {

	public void init(ServletConfig sc) throws ServletException {
		super.init(sc);
		// ==> web.xml����::<load-on-startup>1<load-on-startup>Ȯ��
		System.out.println("\n\n================");
		System.out.println("ControlServlet�� init() Method");
		System.out.println("=====================\n");
	}

	// Service() Method
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("\n[ControlServlet.service() start....]");
		
		//==>CONTROLLER:Client�䱸���� �Ǵ�::URL/URI �̿�
		String actionPage =this.getURI(req.getRequestURI());
		System.out.println("::URI?=>:"+req.getRequestURI());
		System.out.println("::client�� �䱸������?=>:"+actionPage);
		
		//==> CONTROLLER:��ó��/����ó�� ������ �ִٸ�
		//==> �� ����:�ѱ�ó��/session ����,ó��/��/����ó��
		req.setCharacterEncoding("euc_kr");
		HttpSession session = req.getSession(true);
	
		//==>CONTROLLER:Navigation(forward/sendRedirect view page����)
		//Navigation ����Ʈ ������ ������
		String requestPage="/user/logon.jsp";
		
		//==>CONTROLLER::����/����ó��
		//==>session ObjectScope ����� UserVO ��ü �̿� ����
		//==>���1:session ObjectScope �� userVO�ν��Ͻ� ���� �� ����
		if(session.isNew()|| session.getAttribute("userVO") == null) {
			session.setAttribute("userVO",new UserVO());
		}
		//==>���2:session ObjectScope userVO����
		UserVO userVO=(UserVO)session.getAttribute("userVO");
		
		//==>UserVO.active�̿� �α��� ���� �Ǵ�
		if(userVO!=null&&userVO.isActive()) {
			requestPage="/user/home.jsp";
		}
		
		//==>CONTROLLER:Client�䱸�ϻ� ó��Business layer����
		//1.logon do���::Business Logicó�� �� �� ����: defaultpage�� forward
		else if(actionPage.equals("logon")) {
			
		}
		//2.logonAction.do ���
		//==> CONTROLLER::Client�䱸���� ó�� �� Business logicó��
		//==>�� Client Form dataó��
		//==> o Client form data�� Business Layer�� �����ϱ� ���� VO Binding
		//==>o Business Layer Method ȣ�� �� ��� �� �޾� View(JSP)���� ��� �� �� �ֵ���
		//==>ObjectScope�� ����::Model/View����
		else if(actionPage.equals("logonAction")) {
			
			//==>Client form Dataó��
			String userId = req.getParameter("userId");
			String userPasswd = req.getParameter("userPasswd");
			
			//==>CONTROLLER:model�� View�� ����
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
			
			UserDao userDao = new UserDao();
			userDao.getUser(userVO);
			
			if(userVO.isActive()) {
				requestPage="/user/home.jsp";
			}
		}
		//3.home.do�� ���
		//==>�� �α��� ȸ���� home.jdo Request:default request page �� forward
		else if(actionPage.equals("home")) {
			
		}
		System.out.println("::���� ������  View page��:[["+requestPage+".jsp]]"+userVO.isActive());
		
		//==>Controller:Naviagation(���� ������page forward)
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(requestPage);
		rd.forward(req,res);
		
		System.out.println("[ControlServlet.service() end....]");
	}
	
	//client�� �䱸���� �Ǵ�
	private String getURI(String requestURI) {
		int start = requestURI.lastIndexOf('/')+1;
		int end=requestURI.lastIndexOf(".do");
		String actionPage = requestURI.substring(start,end);
		return actionPage;
	}

}