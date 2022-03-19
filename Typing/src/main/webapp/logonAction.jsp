<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@page import="spring.model1.service.user.vo.UserVO" %>
<%@page import="spring.model1.service.user.dao.UserDao" %>
<!-- 
 1. 로그인 유무 확인 :: Work Flow Control(방어적 코딩)
 - 비로그인 : 로그인화면 display
 - 로그인  : 이미 로그인한 회원임을 dispaly
 2. 로그인 확인은..
 - 로그인한 회원은 session ObjectScope에 UserVO객체를 갖고, active는 true
 - UserVO 객체 유무 및 UserVO의 avtive값 true/false 판단
 -->
<%
	UserVo userVO = (UserVO)session.getAttribute("userVO");
	if(userVO == null){
		userVO = new UserVO();
	}
%>

<!--  #. 로그인한 회원 -->

<% 
// 한글처리
request.setCharacterEncoding("euc-kr");

// Client Form Data 처리
String userId = request.getParameter("userId");
String userPasswd = request.getParameter("userPasswd");

// Navigation 디폴트 페이지지정
String targetAction = "/user/logon.jsp";

// Client Form Data Value Object Binding
userVO.serUserId(userId);
userVO.serUserPasswd(userPasswd);

// DAO이용 DB확인
UserDao userDAO = new UserDao();
userDAO.getUser(userVO);

//로그인유무 확인
if(userVO.isActive()){
	session.setAttribute("userVO", userVO);
	targetAction = "/user/home.jsp";
}
%>

<!-- Navigation -->
<jsp:forward page='<%=targetAction %>' />