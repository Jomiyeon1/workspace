package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/SessionUseCookieTwo")
public class SessionUseCookieTwo extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(int i = 0; i<cookies.length;i++) {
				System.out.println("\nCookie �� ����� ���� : ");
				System.out.println(cookies[i].getName()+" : "+cookies[i].getValue());
				System.out.println("\n");
		
			}
		}
		
		HttpSession session = req.getSession(false);
		
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<center><h2>SessionUseCookieTwo</h2></center>");
		
		if (session != null) {
			out.println("<hr>JSESSIONID = "+session.getId()+"<hr>");
			String name = (String)session.getAttribute("name");
			out.println("�̸� : "+name);
		}else {
			out.println("ó���Դϴ�.");
		}
		out.println("</body></html>");
		
	}
	
	

	

}
