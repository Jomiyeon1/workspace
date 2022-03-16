package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//Servlet / JDBC / DataSource(Connection Pool) / Session 이용 Login 처리

@WebServlet("/loginBeanDataSourceSession")
public class loginBeanDataSourceSession extends HttpServlet {


	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text:thml;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Client Form Data처리
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		//session 유무 확인 :: 새로운 HttpSession 생성 OR 기존 HttpSession Get
		HttpSession session = req.getSession(true);
		
		// 기 login한 회원 :: session에 저장된 UserVo Get
		// 미 login한 회원 :: session에 저장된 UserVo 없으므로 null Get
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		System.out.println("session에 저장된 UserVO유무 확인 : " + userVO);
		
		//아래의 두 경우를 고려
		//==> 고려할 사항 1
		// :: loginBeanPoolSession.html 을 거쳐서 오는 경우
		// 1. id를 입력하지 않은 경우 :: req.getParameter("id")의 값 ==> ""(NullString)
		
		//==> 고려할 사항 2
		// Browser 주소창에 직접 URL
		// http://127.0.0.1:8080/edu/LoginBeanDataSourceSession 입력한 경우
		// 2. req.getParameter("id")의 값 ==> null
		
		//==> 
		
	}

}
