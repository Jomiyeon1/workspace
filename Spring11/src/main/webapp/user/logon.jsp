<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<%
	String userId = "���̵��Է�";
	String password = "�н������Է�";
	//User user = (User)session.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Logon Page</title>
</head>

<body>
	<!-- /////�߰��� �κ�-->
	[��info��] :: ${requestScope.message}<br/><br/>
	<!-- /////////////////////////////////////////// -->
	 
	 
	 <% //if(user == null || user.isActive() != true) %>

		<form method="post" action="logonAction.do">
			
			���̵�: <input type="text" name="userId"	value="<%=userId %>"> <br/><br/>
			�н�����: <input type="text" name="password" value="<%=password %>"><br/><br/>
			<input type="submit"	name="submit"	value="Enter"/>
			
			
		</form>
	<% //}else { %>
		<%--<%=user.getUserId()%> ���� �̹� �α��� �ϼ̽��ϴ�.--%>
	<% //} %>

</body>
</html>