<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@page import="jw.service.user.vo.UserVO"%>
<%@page import="jw.service.user.dao.UserDao"%>

<%
if (request.getMethod().equals("GET")) {%>
<jsp:forward page="login.html" />
<%}%>
<%
	request.setCharacterEncoding("EUC_KR");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	UserVO userVO = new UserVO();
	userVO.setId(id);
	userVO.setPwd(pwd);
	
	UserDao userDAO = new UserDao();
	userDAO.getUser(userVO);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>Loginȭ��</h2>
	<%
	if (userVO.isActive()) {	%>
	<%=id%>�� ȯ���մϴ�.
	<%	session.setAttribute("userVO", userVO);	%>
	<%	} else {	%>
	id,pwd�� Ȯ���ϼ���
	<%	}	%>
</body>
</html>