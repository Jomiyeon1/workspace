<%@ page contentType="text/html;charset=euc-kr"%>
<%@ page import="jw.service.user.vo.UserVO"%>
<%@ page import="jw.service.user.dao.UserDao"%>

<%
	if (request.getMethod().euals("GET")) {
		response.sendRedirect("addUser.html");
		return;
	}

	request.setCharacterEncoding("euc-kr");

	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	int no = Integer.parseInt(request.getParameter("no"));

	UserVO userVO = new UserVO();
	userVO.setId(id);
	userVO.setPwd(pwd);
	userVo.setNo(no);

	UserDao userDao = new UserDao();
%>

<%if (userDao.addUser(userVO)) {%>
	<%=userVO.getId()%>ȸ�� ���� �����մϴ�.
<%} else {%>
	�ٽ� ���Կ��<br/><hr/>
	<jsp:include page="/jw04/addUser.html" />
<%}%>