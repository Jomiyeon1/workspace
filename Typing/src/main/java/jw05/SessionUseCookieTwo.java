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

// 서버에 필요한 정보 HttpSession 이용 저장
@WebServlet("/SessionUseCookieTwo")
public class SessionUseCookieTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text:thml;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//==>아래의 Cookie 정보 확인 의미
		//==> HttpSession이 Cookie를 사용유무를 확인
		//==> Cookie에 HttpSession을 구분, Get할 수 있는
		//==> unique한 JSESSIONID 존재 유무 확인
		Cookie[] cookies = req.getCookies();
		if(cookies != null){
			for(int i = 0; i < cookies.length; i++) {
				System.out.println("\n Cookie에 저장된 정보 :");
				System.out.println(cookies[i].getName() + " : " + cookies[i].getValue());
			}
		}
		//두가지 경우 이해
		//1.HttpSession 객체가 없을 경우.
		//2.HttpSession 객체가 있을 경우.
		HttpSession session = req.getSession(false);
		//==> 1의 경우 새로운 HttpSession객체 없이 진행 API확인
		//==> 2의 경우 기존 HttpSession 객체 GET API확인
		
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<center><h2>SessionUseCookieTwo</h2></center>");
		
		//session이 null 의미 : 기존에 생성, 사용 중인 HttpSession 객체가 없다.
		//session이 null이 아니라는 의미는 기존에 생성된 HttpSession 객체가 있다.
		if(session != null) {
			System.out.println("<hr> JSESSIONID : " + session.getId() + "<hr>");
			String name = (String)session.getAttribute("name");
		}else {
			out.println("처음입니다.");
		}
		out.println("</body></html>");
	}

}
