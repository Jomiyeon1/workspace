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
 *  :: JSP StandardAction Tag : <jspLfoward page = "~~.jsp"> 와 비교
 *  :: Servlet 에서 각각의 ObjectScope에 저장한 Bean을 JSP로 Forward시 저장된 Bean 공유 유무확인
 * */

//@WebServlet("/ServletSendRedirect")
public class ServletSendRedirect extends HttpServlet {
	//service()
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[ServletSendRedirect.service() start!!]");
		
		//==> Request ObjectScope 저장
		request.setAttribute("uesr1", new User("홍길동","1111"));
		
		//==> Session ObjectScope저장
		HttpSession session = request.getSession(true);
		session.setAttribute("user02", new User("이순신", "2222"));
		
		//==> Application ObjectScope 저장
		ServletContext application = this.getServletContext();
		application.setAttribute("user03", new User("장보고","3333"));
		
		//==> Request 다시 생성 Request하는 sendRedirect 이해
		response.sendRedirect("/003edu/02Navigation/view.jsp");
		
		System.out.println("[ServletSendRedirect.service() end.....]");
		
	}

}

/*
 * 실행방법 : http://127.0.0.1:8080/003edu/02Navigation
 * 1. web.xml mapping 확인
 * 2. URL 확인 / Browser 화면은 Servlet인가? JSP인가?
 * 3. 각각의 ObjectScope 다시확인
 * 4. forward 와 sendRedrect 차이점?
 * */
