<%@ page contentType="text/html; charset=EUC-KR" %>

<!-- ///////////////////////// 변경된 부분 ///////////////////////////
	- Model2 Web Arch. 적용 시 :: JSP는 View 역할
	- Work Flow Control은 Controller 담당
	- 아래의 주석 : Controller 담당하는 ControlServlet 에서 처리
	////////////////////////////////////////////////////////////////-->

<%
	//UserVO userVO = (UserVO)session.getAttribute("userVO");
%>

<html>
	<head></head>	
	<body>
	
		<% //if(userVO == null || userVO.isActive() != true) {%>
		
		<!-- ///////////////////////////////변경된 부분/////////////////////////////// -->
		<!--  <form id="login" method="post	action="/012model2/logonAction.do"> -->
		<!--  //////////////////////////////////////////////////////////////////////// -->
	   <form id="login" method="post" action="/014model2/user/logonAction.do">
				
				아 이 디 : <input id="userId" type="text" name="userId" value""><br/><br/>
				패스워드 : <input id="userId" type="text" name="userPasswd" value""><br/><br/>
				<input id="submit" type="submit" name="submit" value="Enter"/>
				
			</form>

		<%//else{ %>
			<%-- <%= userVO.getUserId() 님은 이미 로그인 하셨습니다.--%>
		<%//} %>

			<br/><br/>
			<hr/>
			::info <%=request.getAttribute("info")%>
			<hr/>
	
	</body>
</html>