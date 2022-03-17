package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/CookieReaderToServer")
public class CookieReaderToServer extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/thml;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		// Client�κ��� ���۵� Cookieó��
		Cookie[] cookies = req.getCookies();
		// Cookie�� name=value ó�� ����
		String userName = null;

		// Cookie�� �������� �� name = value ó��
		if (cookies != null) {
			out.println("Client���� ���۵� Cookie�ֽ��ϴ�. <br/>");
			// Array�� return :: Array ������ŭ ó��
			for (int i = 0; i < cookies.length; i++) {
				// name = value ������ ���尪 �� name ����
				String name = cookies[i].getName();
				String value = URLDecoder.decode(cookies[i].getValue());
				System.out.println("client�κ��� ���۵� cookie : " + name + " = " + value);

				if (name.equalsIgnoreCase("name")) {
					userName = value;
				}

			}
		} else {
			out.println("Client���� ���۵� cookie�� �����ϴ�.<br/>");
		}
		
		out.println("<html><body>");
		//userName�� null �ǹ� :: cookie�� id�� ������� �ʾ��� => ó���湮
		if(userName == null) {
			out.println("ó���Դϴ�.");
		}else {
			out.println(userName + "�� ȯ���մϴ�.");
		}
		 out.println("</body></html>");
	}

}
