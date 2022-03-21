<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@page import="jw.common.user.dao.UserDao" %>
<%@page import="jw.common.user.vo.UserVO" %>


<%
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=EUC_KR");
		
		//client에서 넘어온 값을 받자.
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String num = request.getParameter("num");
		String addr = request.getParameter("addr");
			
		//Client에 받은 data로 UserVO instance 생성 및 Value set
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setYear(year);
		userVO.setMonth(month);
		userVO.setDay(day);
		userVO.setNum(num);
		userVO.setAddr(addr);
		
		//DB에 접근하는 UserDAO를 이용 회원정보 Insert
		UserDao bean = new UserDao();
		bean.addUser(userVO);

		%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		
		<h2>회원가입</h2>
        
       
		<% if( userVO.isActive() ){ %>
            <%= userVO.getName()%>님 환영합니다.<br/>
            <% request.getSession(true).setAttribute("userVO", userVO);%>
            
        <% }else{%>
           다시가입해 주세요.<br/>
       <% } %>

		<p><p><a href='/Homework03/findUser.html'>내정보보기(id 입력)</a>
		<p><p><a href='/Homework03/findUser.jsp'>내정보보기(session 사용)</a>


</body>
</html>