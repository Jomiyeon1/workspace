package jw.services.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jw.services.user.dao.UserDAO;
import jw.services.user.vo.UserVO;

public class AddUser extends HttpServlet {
	
	//doGet() Overriding
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	
	//doPost() Overriding
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client에서 넘어온 값을 받자.
		String id = req.getParameter("id11");
		String pwd = req.getParameter("pwd");
		int no = Integer.parseInt(req.getParameter("no"));
		
		//Client에 받은 data로 UserVO instance 생성 및 Value set
		UserVO userVO = new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		userVO.setNo(no);
		
		//DB에 접근하는 UserDAO를 이용 회원정보 Insert
		UserDAO bean = new UserDAO();
		bean.addUser(userVO);

		out.println("<html>");
		out.println("<body>");
		
		out.println("<h2>회원가입</h2>");
        
        // insert 유무에 따라...
		if( userVO.isActive() ){
            out.println(userVO.getId()+"님 환영합니다.<br/>");
        }else{
            out.println("다시가입해 주세요.<br/>");
        }

		out.println("<p><p><a href='/homework01/servlet/findUser.html'>내정보보기(id 입력)</a>");

		out.println("</boyd>");
		out.println("</html>");
	}
}//end of class