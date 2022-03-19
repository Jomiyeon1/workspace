package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Client�� �ʿ������� �����ϴ� Cookie ���

//@WebServlet("/CookeWriterToClient")
public class CookeWriterToClient extends HttpServlet {
	

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/thml;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Cookie����(name=value) :: �ѱ� ���ڵ� �� ����
		Cookie cookie = new Cookie("name", URLEncoder.encode("ȫ�浿"));
		
		cookie.setMaxAge(60*60); // cookie ��ȿ�Ⱓ(��)
		//cookie.setMaxAge(-1); // cookie memory ����? -> APIȮ��
		//cookie.setMaxAge(0); // cookie 0�ʵ��� ��ȿ ? -? APIȮ��
		 res.addCookie(cookie); // Client�� response �ν��Ͻ��� ��� cookie ����
		 
		 out.println("<html><body>");
		 out.println("Cookie ���� �Ϸ�!");
		 out.println("</body></html>");
	}

}