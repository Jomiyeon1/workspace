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

//Client에 필요정보를 저장하는 Cookie 사용

@WebServlet("/CookeWriterToClient")
public class CookeWriterToClient extends HttpServlet {
	

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text:thml;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Cookie생성(name=value) :: 한글 인코딩 후 저장
		Cookie cookie = new Cookie("name", URLEncoder.encode("홍길동"));
		
		cookie.setMaxAge(60*60); // cookie 유효기간(초)
		//cookie.setMaxAge(-1); // cookie memory 저장? -> API확인
		//cookie.setMaxAge(0); // cookie 0초동안 유효 ? -? API확인
		 res.addCookie(cookie); // Client로 response 인스턴스를 사용 cookie 전송
		 
		 out.println("<html><body>");
		 out.println("Cookie 저장 완료!");
		 out.println("</body></html>");
	}

}
