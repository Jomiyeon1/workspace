<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<%
	String userId = "아이디입력";
	String password = "패스워드입력";
	//User user = (User)session.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Logon Page</title>
</head>

<body>
	<!-- /////추가된 부분-->
	[♥info♥] :: ${requestScope.message}<br/><br/>
	<!-- /////////////////////////////////////////// -->
	 
	 
	 <% //if(user == null || user.isActive() != true) %>

		<form method="post" action="logonAction.do">
			
			아이디: <input type="text" name="userId"	value="<%=userId %>"> <br/><br/>
			패스워드: <input type="text" name="password" value="<%=password %>"><br/><br/>
			<input type="submit"	name="submit"	value="Enter"/>
			
			
		</form>
	<% //}else { %>
		<%--<%=user.getUserId()%> 님은 이미 로그인 하셨습니다.--%>
	<% //} %>

</body>
</html>