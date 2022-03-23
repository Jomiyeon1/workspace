<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@page import="jw.common.user.dao.UserDao"%>
<%@page import="jw.common.user.vo.UserVO"%>

<%
	request.setCharacterEncoding("EUC_KR");
	response.setContentType("text/html;charset=EUC_KR");

	//client���� �Ѿ�� ���� ����.
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String year = request.getParameter("year");
	String month = request.getParameter("month");
	String day = request.getParameter("day");
	String num = request.getParameter("num");
	String addr = request.getParameter("addr");

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
	UserDao bean = new UserDao();
	bean.updateUser(userVO);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

		<h2>��û�Ͻ� ȸ������</h2>
		<% if(userVO.isActive() ){  %>
		    �����Ϸ� <br/>
		<% }else{  %>
			  ���� error<br/>
		<% }  %>
</body>
</html>