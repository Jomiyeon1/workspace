package jw.services.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jw.services.user.dao.UserDAO;
import jw.services.user.vo.UserVO;

//@WebServlet("/FindUser")
public class FindUser extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		//Session 생성===========================================
		HttpSession session = req.getSession(true);
		System.out.println("==============Session 생성 완료");

		// client에서 넘어온 값을 받자.
		String name = req.getParameter("name");

		UserDAO bean = new UserDAO();
		bean.findUser(name);

		//Session 저장하기
	
//		Cookie[] cookies = req.getCookies();
//		if (cookies != null) {
//			for(int i = 0; i < cookies.length; i++)
//			System.out.println("\n cookie에 저장된 정보 :");
//			System.out.println(cookies[i].getName() + " : " + cookies[i].getValue());
//			
//		}

		//session이 있다면? 값을 불러오자
		
		
		// DB에 접근하는 UserDAO를 이용 회원정보 select
		UserVO userVO = new UserVO();
		userVO = bean.findUser(name);
//		if(session != null) {
//		userVO = (UserVO) session.getAttribute("UserVO");
//		}
		if(session.isNew()) {
			session.setAttribute("FindUser", userVO);
			System.out.println("============session 저장완료");
			
			
		}
		
		out.println("<html>");
		out.println("<body>");

		out.println("<h2>회원정보</h2>");
		
		
	//	if( userVO.isActive()){
			
		
		out.println("이름 : " + userVO.getName());
		out.println("성별 : " + userVO.getGender());
		out.println("생년월일 : " + userVO.getYear() + "/" + userVO.getMonth() + "/" + userVO.getDay() );
		out.println("전화번호 : " + userVO.getNum() );
		out.println("주소 : " + userVO.getAddr());
		out.println("JSESSIONID = " + session.getId());

		
				
	//	}else {
			
	//		out.println("회원아닙니다.");
	//	}
		// 확인하기
		

		
		
		
		

		out.println("</body>");
		out.println("</html>");
	}

}
