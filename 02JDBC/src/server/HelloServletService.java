package server;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/*
 * - Servlet Life Cycle�� ����
 * - Servlet Hierarchy / Servlet API ����
 * */

public class HelloServletService extends HttpServlet{
	//init() => �ݹ� ���� method overriding no need
	//server() method Overrading
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		System.out.println(":: servlet service() ����");
		System.out.println("Requset Client IP : " + req.getRemoteAddr());
		
		//�ѱ�ó��
		res.setContentType("text/html");
		//res.setContentType("text/html;charset=EUC_KR");
		
		//1. PrintWriter �ν��Ͻ� ������ Encapsulation�� API ��� Stream����
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("client���� ��û�Ͻ�");
		out.println("/examples/FirstServlet�Դϴ�.<br/>");
		out.println("���� java class �Դϴ�<br/>");
		out.println("���� Java web programming ����Դϴ�.<br/>");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
		System.out.println(":: servlet service() ����\n");
		
		
	}

		//destory() ==> �ݹ����� method overriding no need
}
