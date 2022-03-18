<%@ page language="java" contentType="text/html; charset=EUC-KR" %>
<%@ pageEncoding="EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>

1. Servelt에서 Request ObjectScope 저장한 정보를 출력. <br/>

<% User user01 = (User)request.getAttribute("user01"); %>
<% if(user01 != null){ %>
	아 이 디 : <%=user01.getUserId() %> <br/>
	비밀 번호 : <%=user01.getUserPasswd() %> <br/>
<% }else {%>
	Request ObjectScope에 저장된 정보는 없습니다.
<% } %>

2.Servlet에서 Session ObjectScope 저장한 정보 출력. <br/>
<% User user02 = (User)session.getAttribute("user02"); %>
<% if(user02 != null){ %>
	아 이 디 : <%=user02.getUserId() %> <br/>
	비밀 번호 : <%=user02.getUserPasswd() %> <br/>
<% }else {%>
	Application에 ObjectScope에 저장된 정보는 없습니다.
<% } %>


<hr/>
<hr/>

</body>
</html>