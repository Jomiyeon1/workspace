<%@ page language="java" contentType="text/html; charset=EUC-KR"%>

<%@page import="jw.common.user.dao.UserDao" %>
<%@page import="jw.common.user.vo.UserVO" %>

<%
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=EUC_KR");
		
		// client���� �Ѿ�� ���� ����.
		String name = request.getParameter("name");
		 UserVO userVO = new UserVO();
		if(name == null){
			
			session = request.getSession();
			name =  ( (UserVO)session.getAttribute("userVO")).getName();
		}

		// DB�� �����ϴ� UserDAO�� �̿� ȸ������ select
		UserDao bean = new UserDao();
		userVO = bean.findUser(name);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>ȸ������</h2>
		
		<% if(userVO != null) { %>
		�̸� : <%=userVO.getName() %>
		���� : <%=userVO.getGender() %>
		������� : <%= userVO.getYear()%>/<%=userVO.getMonth() %>/<%=userVO.getDay()%>
		��ȭ��ȣ :<%=userVO.getNum()%>
		�ּ� : <%=userVO.getAddr()%>
		<%}else { %>
			<%=name %>�� �ش��ϴ� ������ �����ϴ�.<br/>
		<%} %>
		

</body>
</html>