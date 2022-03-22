package jw.services.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jw.common.user.dao.UserDao;
import jw.common.user.vo.UserVO;

public class AddUser extends HttpServlet {
	
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client에서 넘어온 값을 받자.
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String year = req.getParameter("year");
		String month = req.getParameter("month");
		String day = req.getParameter("day");
		String num = req.getParameter("num");
		String addr = req.getParameter("addr");
			
		//Client에 받은 data로 UserVO instance 생성 및 Value set
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setYear(year);
		userVO.setMonth(month);
		userVO.setDay(day);
		userVO.setNum(num);
		userVO.setAddr(addr);
		
		//DB에 접근하는 UserDAO를 이용 회원정보 Insert
		UserDao bean = new UserDao();
		bean.addUser(userVO);

		out.println("<html>");
		out.println("<body>");
		
		out.println("<h2>회원가입</h2>");
        
        // insert 유무에 따라...
		if( userVO.isActive() ){
            out.println(userVO.getName()+"님 환영합니다.<br/>");
            //////////////////Session 사용위해 추가된 부분/////////////////////////////////
            //==> 회원가입완료되면... userVO instance session 에 저장
            req.getSession(true).setAttribute("userVO", userVO);
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////
            
        }else{
            out.println("다시가입해 주세요.<br/>");
        }

		out.println("<p><p><a href='/Homework03/findUser.html'>내정보보기(id 입력)</a>");
		out.println("<p><p><a href='/Homework03/FindUser'>내정보보기(session 사용)</a>");

		out.println("</boyd>");
		out.println("</html>");
	}
}//end of class