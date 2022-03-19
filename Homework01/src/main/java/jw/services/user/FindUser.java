package jw.services.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jw.services.user.dao.UserDAO;
import jw.services.user.vo.UserVO;

//@WebServlet("/FindUser")
public class FindUser extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		// client에서 넘어온 값을 받자.
		String name = req.getParameter("name");
//		String gender = req.getParameter("gender");
//		String year = req.getParameter("year");
//		String month = req.getParameter("month");
//		String day = req.getParameter("day");
//		String num = req.getParameter("num");
//		String addr = req.getParameter("addr");
		UserDAO bean = new UserDAO();
		bean.findUser(name);

		// Client에 받은 data로 UserVO instance 생성 및 Value set
//		UserVO userVO = new UserVO();
//		userVO.setName(name);
//		userVO.setGender(gender);
//		userVO.setYear(year);
//		userVO.setMonth(month);
//		userVO.setDay(day);
//		userVO.setNum(num);
//		userVO.setAddr(addr);

		// DB에 접근하는 UserDAO를 이용 회원정보 select
		UserVO userVO = new UserVO();
		userVO = bean.findUser(name);

		out.println("<html>");
		out.println("<body>");

		out.println("<h2>회원정보</h2>");

		out.println("이름 : " + userVO.getName());
		out.println("성별 : " + userVO.getGender());
		out.println("생년월일 : " + userVO.getYear() + "/" + userVO.getMonth() + "/" + userVO.getDay() );
		out.println("전화번호 : " + userVO.getNum());
		out.println("주소 : " + userVO.getAddr());

		out.println("</body>");
		out.println("</html>");
	}

}
