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
		

		// client���� �Ѿ�� ���� ����.
		String name = req.getParameter("name");
		
		if(name == null){
			//==>  Session�� ����� userVO instance �� id ���
			HttpSession session = req.getSession(true);
			name =  ( (UserVO)session.getAttribute("userVO")).getName();
		}

		UserDao bean = new UserDao();
		bean.findUser(name);

		//session�� �ִٸ�? ���� �ҷ�����
		
		
//		if(session != null) {
//		userVO = (UserVO) session.getAttribute("UserVO");
//		}
		
		// DB�� �����ϴ� UserDAO�� �̿� ȸ������ select
		UserVO userVO = new UserVO();
		userVO = bean.findUser(name);
		
		out.println("<html>");
		out.println("<body>");

		out.println("<h2>ȸ������</h2>");
		
		
	//	if( userVO.isActive()){
			
		if(userVO != null) {
		out.println("�̸� : " + userVO.getName());
		out.println("���� : " + userVO.getGender());
		out.println("������� : " + userVO.getYear() + "/" + userVO.getMonth() + "/" + userVO.getDay() );
		out.println("��ȭ��ȣ : " + userVO.getNum() );
		out.println("�ּ� : " + userVO.getAddr());
		}else {
			out.println(name+"�� �ش��ϴ� ������ �����ϴ�.<br/>");
		}
		
				
	//	}else {
			
	//		out.println("ȸ���ƴմϴ�.");
	//	}
		// Ȯ���ϱ�

		out.println("</body>");
		out.println("</html>");
	}

}
