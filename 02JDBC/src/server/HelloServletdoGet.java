package server;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletdoGet extends HttpServlet{
	
		
		//init() => �ݹ� ���� method overriding no need
		//server() method Overrading ����
		//doGet() Overraing
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
			System.out.println(":: servlet doGet() ����");
			System.out.println("Requset Client IP : " + req.getRemoteAddr());
			
			//�ѱ�ó��
			res.setContentType("text/html;charset=EUC_KR");
			
			//1. PrintWriter �ν��Ͻ� ������ Encapsulation�� API ��� Stream����
			PrintWriter out = res.getWriter();
			
			out.println("<html>");
			out.println("<head><title>hello Servlet</title></head>");
			out.println("<body>");
			out.println("English : HelloServlet");
			out.println("<p>");
			out.println("Korea : �ȳ� ������!");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
			
			System.out.println(":: servlet doGet() ����\n");
			
	
		
		}
		//destory() ==> �ݹ����� method overriding no need
}