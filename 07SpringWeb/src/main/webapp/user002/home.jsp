<%@ page contentType="text/html; charset=EUC-KR" %>

<%@ page import="spring.domain.User" %>

<!-- ///////////////////////// 변경된 부분 ///////////////////////////
	- Model2 Web Arch. 적용 시 :: JSP는 View 역할
	- Work Flow Control은 Controller 담당
	- 아래의 주석 : Controller 담당하는 ControlServlet 에서 처리
	////////////////////////////////////////////////////////////////-->
 
 <!-- #.비로그인한 회원이면...  -->
 <% User sessionUser = (User)session.getAttribute("sessionUser"); %>
 
 <% //if(user == null || !userVO.isActive()){ %>
 		<%--<jsp:forward page="logon.jsp"/>--%>
<%//} %>
 
<html>
	<head>Home Page</head>
	<body>
	
	<!-- ///// 추가된 부분 ///// -->
	[♥info♥] :: ${requestScope.message}<br/><br/>
	
	<!-- ////////////////////////// -->
		<p>Simple Model2 Examples</p>
		<p>환영합니다. : <%= sessionUser.getUserId() %>님</p>

		<br/><br/>
		<a href="logout.do">logout</a>
	</body>
</html>