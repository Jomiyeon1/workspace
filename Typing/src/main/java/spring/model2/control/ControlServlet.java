package spring.model2.control;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.service.user.dao.UserDao;
import spring.madel2.service.user.vo.UserVO;

/*
 * - ����������(Single Point of Entry)
 * - Client �䱸���� �Ǵ�(?)
 * - ��ó�� / ����ó��
 *   > Work Flow Control :: ����, ���� ��
 *   > Client Form Data �ѱ�ó��
 * - Business logic ����(Bean Method Call)
 * - Model �� View ����
 *   > Business Logic ó�� ��� JSP ���� (Object Scope / VO ���)
 * - ó���� ����� ����, JSP �� forward/sendRedirect : Navigation
 * */

//@WebServlet("/ControlServlet")
public class ControlServlet extends HttpServlet {
	//init()
	public void init(ServletConfig config) throws ServletException {
		super.init(sc);
		//==>web.xml ���� :: <load-on-startup>1<load-on-startup> Ȯ��
		System.out.println("\n\n=============================");
		System.out.println("ControlServlet�� init() Method");
		System.out.println("================================\n");
		
	}

	//service()
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("\n[ControlServlet.service() start.....]");
		
		//==> CONTROLLER :: Client �䱸���� �Ǵ� :: URL/RUI �̿�
		String actionPage = this.getURI(req.getRequestURI());
		System.out.println("::URI ? => "+ req.getRequestURI());
		System.out.println("::client�� �䱸������?? => " + actionPage);
		
		//==> CONTROLLER :: ��ó�� / ����ó�� ������ �ִٸ�..
		// ==> �� ���� : �ѱ�ó��/ session ����,ó�� / ��,����ó��
		req.setCharacterEncoding("euc-kr");
		HttpSession session = req.getSession(true);
		
		//==> CONTROLLER :: Navagation (forward/sendRedirect view page ����)
		// Navigation ����Ʈ ������ ����
		String requsetPage ="user/logon.jsp";
		
		//==> CONTROLLER ���� / ����ó��
		//==> session ObjectScope ����� UserVO ��ü �̿� ����
		//==> ��� 1. session ObjectScope �� userVO �ν��Ͻ� ���� �� ����
		if(session.isNew() || session.getAttribute("userVO") ==null) {
			session.setAttribute("userVO", new UserVO());
			
		}
		
		//==> ��� 2. session ObjectScope userVO ����
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		
		//==> UserVO.active �̿� �α��� �����Ǵ�
		if(userVO != null && uesrVO.isActive()) {
			requestPage = "user/home.jsp";
		}
		
		//==> CONTROLLER :: Client �䱸���� ó�� Business layer ����
		
		// 1. logon.do ��� :: Business Logic ó���� �� ���� : default page�� forward
		else if(actionPage.equals("logon")) {
			
		}
		
		// 2. logonAction.do ���
		//==> CONTROLLER :: Client �䱸���� ó�� �� Business logic ó��
		//==> - Client Form Data ó��
		//==> - Client Form data �� Business Layer �� �����ϱ� ���� VO Binding
		//==> - Business Layer Method ȣ�� �� ����� �޾� View(JSP)���� ����� �� �ֵ���
		//      ObjectScope�� ���� :: Mosel / View ����
		
		else if (actionPage.equals("logonAction")) {
			
			//==> Client Form Dataó��
			String userId = req.getParameter("userId");
			String userPasswd = req.getParameter("userPasswd");
			
			//==> CONTROLLER :: Model�� View �� ���� : Binding
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
			
			//==> CONTROLLER :: Business logic ó��
			UserDao userDao = new UserDao();
			userDao.getUser(userVO);
			
			//==> CONTROLLER  :: Navigation (forward/sendRedirect viewpage ����)
			if(userVO.isActive()) {
				requsetPage = "user/home.jsp";
			}
			
			// 3. home.do�� ���
			//==> �� �α��� ȸ���� home.do Request : default request page�� forward
			else if (actionPage.equals("home")) {
				
			}
			
			System.out.println("[ ControlServlet.service() end..... ]");
		}
		
		//client�� �䱸���� �Ǵ� ==> requserURL = "/~~.do" �����̹Ƿ�...
		private String getURI(String requestURI) {
			int start = requestURI.lastIndexOf('/')+1;
			int end = requestURI.lastIndexOf(".do");
			String actionPage = requestURI.substring(start, end);
			return acionPage;
			
		}
	}

}
