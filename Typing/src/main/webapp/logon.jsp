<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@page import="spring.model1.service.user.vo.UserVO" %>

<!-- 
	1. �α��� ����Ȯ�� : Work Flow Control(����� �ڵ�)
	- ��α��� : �α���ȭ�� display
	-  �α��� : �̹� �α����� ȸ������ display
	2. �α��� Ȯ����..
	- �α����� ȸ���� session ObjectScope�� UserVO��ü�� ����, active�� true
	- UserVO ��ü�� ���� �� UserVO�� active �� true/false �Ǵ�
 -->
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>
<% if(userVO == null || userVO.isActive() != true) { %>

	<form id = "logon" method = "post" acaction="/011model/user/logonAction.jsp">
		���̵�  : <input id="userID" type="text" name="userId" value=""> <br/><br/>
		�н����� : <input id="userID" type="text" name="userPassword" value=""> <br/><br/>
		<input id = "submit" type ="submit" name="submint" value="Enter"/>
	</form>
	<% }else {%>
		<%= userVO.getUserId() %>���� �̹� �α����ϼ̽��ϴ�.
	<% } %>

</body>
</html>