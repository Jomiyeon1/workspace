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
	
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client���� �Ѿ�� ���� ����.
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String year = req.getParameter("year");
		String month = req.getParameter("month");
		String day = req.getParameter("day");
		String num = req.getParameter("num");
		String addr = req.getParameter("addr");
			
		//Client�� ���� data�� UserVO instance ���� �� Value set
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setYear(year);
		userVO.setMonth(month);
		userVO.setDay(day);
		userVO.setNum(num);
		userVO.setAddr(addr);
		
		//DB�� �����ϴ� UserDAO�� �̿� ȸ������ Insert
		UserDAO bean = new UserDAO();
		bean.addUser(userVO);

		out.println("<html>");
		out.println("<body>");
		
		out.println("<h2>ȸ������</h2>");
        
        // insert ������ ����...
		if( userVO.isActive() ){
            out.println(userVO.getName()+"�� ȯ���մϴ�.<br/>");
        }else{
            out.println("�ٽð����� �ּ���.<br/>");
        }

		out.println("<p><p><a href='/Homework01/findUser.html'>����������(id �Է�)</a>");

		out.println("</boyd>");
		out.println("</html>");
	}
}//end of class