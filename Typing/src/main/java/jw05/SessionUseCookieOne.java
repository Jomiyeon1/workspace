package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionUseCookieOne")
public class SessionUseCookieOne extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//�ΰ��� ��� ����
		//1.HttpSession ��ü�� ���� ���.
		//2.HttpSession ��ü�� ���� ���.
		HttpSession session = req.getSession(true);
		//==>1�� ��� ���ο� HttpSession ��ü ���� (APIȮ��)
		//==>2�� ��� ���� HttpSession ��ü GET (APIȮ��)
		
		//==>���� ������� HttpSession ��ü���..
		if(session.isNew()) {
			//name = value ���� :: �̸� ȫ�浿 ����
			session.setAttribute("name", new String("ȫ�浿"));
		}
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text:thml;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<center><h2>SessionUseCookieOne</h2></center>");
		
		//HttpSession�� ����, Get�Ҽ��ִ� unique�� id�� Ȯ��
		System.out.println("\nUNIQUE�� JSESSIONID�� : " + session.getId());
		
		//==> ���� ������� Session ��ü���..
		if(session.isNew()) {
			out.println("������ ���� ������<br>");
		}else {
			out.println("\nUNIQUE�� JSESSIONID�� : " + session.getId() + " ��� ��");
		}
		out.println("<hr>");
		out.println("<a href = 'eud/SessionUseCookieTwo'>��ũ</a>");
		out.println("</body></html>");
	}

}