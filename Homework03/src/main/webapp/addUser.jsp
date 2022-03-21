<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@page import="jw.common.user.dao.UserDao" %>
<%@page import="jw.common.user.vo.UserVO" %>


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
		bean.addUser(userVO);

		%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		
		<h2>ȸ������</h2>
        
       
		<% if( userVO.isActive() ){ %>
            <%= userVO.getName()%>�� ȯ���մϴ�.<br/>
            <% request.getSession(true).setAttribute("userVO", userVO);%>
            
        <% }else{%>
           �ٽð����� �ּ���.<br/>
       <% } %>

		<p><p><a href='/Homework03/findUser.html'>����������(id �Է�)</a>
		<p><p><a href='/Homework03/findUser.jsp'>����������(session ���)</a>


</body>
</html>