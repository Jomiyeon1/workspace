<%@ page language="java" contentType="text/html; charset=EUC-KR" %>
<%@ pageEncoding="EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>

1. Servelt���� Request ObjectScope ������ ������ ���. <br/>

<% User user01 = (User)request.getAttribute("user01"); %>
<% if(user01 != null){ %>
	�� �� �� : <%=user01.getUserId() %> <br/>
	��� ��ȣ : <%=user01.getUserPasswd() %> <br/>
<% }else {%>
	Request ObjectScope�� ����� ������ �����ϴ�.
<% } %>

2.Servlet���� Session ObjectScope ������ ���� ���. <br/>
<% User user02 = (User)session.getAttribute("user02"); %>
<% if(user02 != null){ %>
	�� �� �� : <%=user02.getUserId() %> <br/>
	��� ��ȣ : <%=user02.getUserPasswd() %> <br/>
<% }else {%>
	Application�� ObjectScope�� ����� ������ �����ϴ�.
<% } %>


<hr/>
<hr/>

</body>
</html>