<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@page import="spring.model2.service.user.vo.UserVO" %>

<!-- 
 1. 로그인 유무 확인 :: Work Flow Control(방어적 코딩)
 - 비로그인 : 로그인화면 display
 - 로그인  : 이미 로그인한 회원임을 dispaly
 2. 로그인 확인은..
 - 로그인한 회원은 session ObjectScope에 UserVO객체를 갖고, active는 true
 - UserVO 객체 유무 및 UserVO의 avtive값 true/false 판단
 -->
 
 <%  UserVO userVO=(UserVO)session.getAttribute("userVO"); %>
 <!-- #.미로그인한 회원 -->
<%// if(userVO == null || !userVO.isActive()){ %>
	<%-- <jsp:forward page = "logon.jsp" />--%>
<% //} %>

<!--  로그인한 회원  -->

<html>
<head> <meta charset="EUC-KR"> </head>
<body>
<p> Simple Model2 Examples</p>
<p> 환영합니다. : <%= userVO.getUserId() %> 님 </p>
</body>
</html>