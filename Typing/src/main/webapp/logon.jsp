<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@page import="spring.model1.service.user.vo.UserVO" %>

<!-- 
	1. 로그인 유무확인 : Work Flow Control(방어적 코딩)
	- 비로그인 : 로그인화면 display
	-  로그인 : 이미 로그인한 회원임을 display
	2. 로그인 확인은..
	- 로그인한 회원은 session ObjectScope에 UserVO객체를 갖고, active는 true
	- UserVO 객체의 유무 및 UserVO의 active 값 true/false 판단
 -->
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>
<% if(userVO == null || userVO.isActive() != true) { %>

	<form id = "logon" method = "post" acaction="/011model/user/logonAction.jsp">
		아이디  : <input id="userID" type="text" name="userId" value=""> <br/><br/>
		패스워드 : <input id="userID" type="text" name="userPassword" value=""> <br/><br/>
		<input id = "submit" type ="submit" name="submint" value="Enter"/>
	</form>
	<% }else {%>
		<%= userVO.getUserId() %>님은 이미 로그인하셨습니다.
	<% } %>

</body>
</html>