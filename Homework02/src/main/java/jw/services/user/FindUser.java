package jw.services.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jw.services.user.dao.UserDAO;
import jw.services.user.vo.UserVO;

//@WebServlet("/FindUser")
public class FindUser extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		//Session ����===========================================
		HttpSession session = req.getSession(true);
		System.out.println("==============Session ���� �Ϸ�");

		// client���� �Ѿ�� ���� ����.
		String name = req.getParameter("name");

		UserDAO bean = new UserDAO();
		bean.findUser(name);

		//Session �����ϱ�
	
//		Cookie[] cookies = req.getCookies();
//		if (cookies != null) {
//			for(int i = 0; i < cookies.length; i++)
//			System.out.println("\n cookie�� ����� ���� :");
//			System.out.println(cookies[i].getName() + " : " + cookies[i].getValue());
//			
//		}

		//session�� �ִٸ�? ���� �ҷ�����
		
		
		// DB�� �����ϴ� UserDAO�� �̿� ȸ������ select
		UserVO userVO = new UserVO();
		userVO = bean.findUser(name);
//		if(session != null) {
//		userVO = (UserVO) session.getAttribute("UserVO");
//		}
		if(session.isNew()) {
			session.setAttribute("FindUser", userVO);
			System.out.println("============session ����Ϸ�");
			
			
		}
		
		out.println("<html>");
		out.println("<body>");

		out.println("<h2>ȸ������</h2>");
		
		
	//	if( userVO.isActive()){
			
		
		out.println("�̸� : " + userVO.getName());
		out.println("���� : " + userVO.getGender());
		out.println("������� : " + userVO.getYear() + "/" + userVO.getMonth() + "/" + userVO.getDay() );
		out.println("��ȭ��ȣ : " + userVO.getNum() );
		out.println("�ּ� : " + userVO.getAddr());
		out.println("JSESSIONID = " + session.getId());

		
				
	//	}else {
			
	//		out.println("ȸ���ƴմϴ�.");
	//	}
		// Ȯ���ϱ�
		

		
		
		
		

		out.println("</body>");
		out.println("</html>");
	}

}
