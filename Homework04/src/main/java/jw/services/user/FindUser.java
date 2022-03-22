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

import jw.common.user.dao.UserDao;
import jw.common.user.vo.UserVO;

//@WebServlet("/FindUser")
public class FindUser extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		

		// client에서 넘어온 값을 받자.
		String name = req.getParameter("name");
		
		if(name == null){
			//==>  Session에 저장된 userVO instance 의 id 사용
			HttpSession session = req.getSession(true);
			name =  ( (UserVO)session.getAttribute("userVO")).getName();
		}

		UserDao bean = new UserDao();
		bean.findUser(name);

		//session이 있다면? 값을 불러오자
		
		
//		if(session != null) {
//		userVO = (UserVO) session.getAttribute("UserVO");
//		}
		
		// DB에 접근하는 UserDAO를 이용 회원정보 select
		UserVO userVO = new UserVO();
		userVO = bean.findUser(name);
		
		out.println("<html>");
		out.println("<body>");

		out.println("<h2>회원정보</h2>");
		
		
	//	if( userVO.isActive()){
			
		if(userVO != null) {
		out.println("이름 : " + userVO.getName());
		out.println("성별 : " + userVO.getGender());
		out.println("생년월일 : " + userVO.getYear() + "/" + userVO.getMonth() + "/" + userVO.getDay() );
		out.println("전화번호 : " + userVO.getNum() );
		out.println("주소 : " + userVO.getAddr());
		}else {
			out.println(name+"에 해당하는 정보는 없습니다.<br/>");
		}
		
				
	//	}else {
			
	//		out.println("회원아닙니다.");
	//	}
		// 확인하기

		out.println("</body>");
		out.println("</html>");
	}

}
