package spring.base.navigation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.service.domain.User;

/*
 *  :: Servlet Navigation :: Forward
 *  :: JSP StandardAction Tag : <jspLfoward page = "~~.jsp"> �� ��
 *  :: Servlet ���� ������ ObjectScope�� ������ Bean�� JSP�� Forward�� ����� Bean ���� ����Ȯ��
 * */

//@WebServlet("/ServletSendRedirect")
public class ServletSendRedirect extends HttpServlet {
	//service()
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[ServletSendRedirect.service() start!!]");
		
		//==> Request ObjectScope ����
		request.setAttribute("uesr1", new User("ȫ�浿","1111"));
		
		//==> Session ObjectScope����
		HttpSession session = request.getSession(true);
		session.setAttribute("user02", new User("�̼���", "2222"));
		
		//==> Application ObjectScope ����
		ServletContext application = this.getServletContext();
		application.setAttribute("user03", new User("�庸��","3333"));
		
		//==> Request �ٽ� ���� Request�ϴ� sendRedirect ����
		response.sendRedirect("/003edu/02Navigation/view.jsp");
		
		System.out.println("[ServletSendRedirect.service() end.....]");
		
	}

}

/*
 * ������ : http://127.0.0.1:8080/003edu/02Navigation
 * 1. web.xml mapping Ȯ��
 * 2. URL Ȯ�� / Browser ȭ���� Servlet�ΰ�? JSP�ΰ�?
 * 3. ������ ObjectScope �ٽ�Ȯ��
 * 4. forward �� sendRedrect ������?
 * */
