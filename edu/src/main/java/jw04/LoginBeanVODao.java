package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginBeanVODao extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC-KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		// client form dataó��
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");

		// UserVO instance ���� �� Client Form Data ���� (Binding)
		UserVO userVO = new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);

		// DB���� Data �˻� �� UserVO.active true / false ����
		UserDao useDao = new UserDao();
		useDao.getUser(userVO);

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");

		out.println("<h2>Login ȭ��</h2>");

		if (userVO.isActive()) {
			out.println(id + "�� ȯ���մϴ�.");
		} else {
			out.println("Login ����! id, pwd�� Ȯ���ϼ���.");
		}

		out.println("<p><p><a href='/edu/jw04/loginBeanVODao.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");

	}

}