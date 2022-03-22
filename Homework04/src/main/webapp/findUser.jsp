<%@ page language="java" contentType="text/html; charset=EUC-KR"%>

<%@page import="jw.common.user.dao.UserDao" %>
<%@page import="jw.common.user.vo.UserVO" %>

<%
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=EUC_KR");
		
		// client에서 넘어온 값을 받자.
		String name = request.getParameter("name");
		 UserVO userVO = new UserVO();
		if(name == null){
			
			session = request.getSession();
			name =  ( (UserVO)session.getAttribute("userVO")).getName();
		}

		// DB에 접근하는 UserDAO를 이용 회원정보 select
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
<h2>회원정보</h2>
		
		<% if(userVO != null) { %>
		이름 : <%=userVO.getName() %>
		성별 : <%=userVO.getGender() %>
		생년월일 : <%= userVO.getYear()%>/<%=userVO.getMonth() %>/<%=userVO.getDay()%>
		전화번호 :<%=userVO.getNum()%>
		주소 : <%=userVO.getAddr()%>
		<%}else { %>
			<%=name %>에 해당하는 정보는 없습니다.<br/>
		<%} %>
		

</body>
</html>