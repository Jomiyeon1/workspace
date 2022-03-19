<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@page import="spring.model1.service.user.vo.UserVO" %>
<%@page import="spring.model1.service.user.dao.UserDao" %>
<!-- 
 1. �α��� ���� Ȯ�� :: Work Flow Control(����� �ڵ�)
 - ��α��� : �α���ȭ�� display
 - �α���  : �̹� �α����� ȸ������ dispaly
 2. �α��� Ȯ����..
 - �α����� ȸ���� session ObjectScope�� UserVO��ü�� ����, active�� true
 - UserVO ��ü ���� �� UserVO�� avtive�� true/false �Ǵ�
 -->
<%
	UserVo userVO = (UserVO)session.getAttribute("userVO");
	if(userVO == null){
		userVO = new UserVO();
	}
%>

<!--  #. �α����� ȸ�� -->

<% 
// �ѱ�ó��
request.setCharacterEncoding("euc-kr");

// Client Form Data ó��
String userId = request.getParameter("userId");
String userPasswd = request.getParameter("userPasswd");

// Navigation ����Ʈ ����������
String targetAction = "/user/logon.jsp";

// Client Form Data Value Object Binding
userVO.serUserId(userId);
userVO.serUserPasswd(userPasswd);

// DAO�̿� DBȮ��
UserDao userDAO = new UserDao();
userDAO.getUser(userVO);

//�α������� Ȯ��
if(userVO.isActive()){
	session.setAttribute("userVO", userVO);
	targetAction = "/user/home.jsp";
}
%>

<!-- Navigation -->
<jsp:forward page='<%=targetAction %>' />