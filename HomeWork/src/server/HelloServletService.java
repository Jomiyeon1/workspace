package server;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/*
 * - Servlet Life Cycle의 이해
 * - Servlet Hierarchy / Servlet API 이해
 * */

public class HelloServletService extends HttpServlet{
	//init() => 금번 예제 method overriding no need
	//server() method Overrading
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		System.out.println(":: servlet service() 시작");
		System.out.println("Requset Client IP : " + req.getRemoteAddr());
		
		//한글처리
		res.setContentType("text/html");
		//res.setContentType("text/html;charset=EUC_KR");
		
		//1. PrintWriter 인스턴스 생성을 Encapsulation한 API 사용 Stream생성
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("client에서 요청하신");
		out.println("/examples/FirstServlet입니다.<br/>");
		out.println("저는 java class 입니다<br/>");
		out.println("물론 Java web programming 기술입니다.<br/>");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
		System.out.println(":: servlet service() 종료\n");
		
		
	}

		//destory() ==> 금번예제 method overriding no need
}
