<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@page import="spring.model2.service.user.vo.UserVO" %>

<!-- 
 1. �α��� ���� Ȯ�� :: Work Flow Control(����� �ڵ�)
 - ��α��� : �α���ȭ�� display
 - �α���  : �̹� �α����� ȸ������ dispaly
 2. �α��� Ȯ����..
 - �α����� ȸ���� session ObjectScope�� UserVO��ü�� ����, active�� true
 - UserVO ��ü ���� �� UserVO�� avtive�� true/false �Ǵ�
 -->
 
 <%  UserVO userVO=(UserVO)session.getAttribute("userVO"); %>
 <!-- #.�̷α����� ȸ�� -->
<%// if(userVO == null || !userVO.isActive()){ %>
	<%-- <jsp:forward page = "logon.jsp" />--%>
<% //} %>

<!--  �α����� ȸ��  -->

<html>
<head> <meta charset="EUC-KR"> </head>
<body>
<p> Simple Model2 Examples</p>
<p> ȯ���մϴ�. : <%= userVO.getUserId() %> �� </p>
</body>
</html>