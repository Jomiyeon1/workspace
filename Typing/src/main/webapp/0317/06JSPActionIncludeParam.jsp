<%@ page contentType="text/html;charset=EUC-KR" %>
<html>
<body>

::06JSPActionIncludeParam.jsp ���� <br/>

<% 

request.setAttribute("aaa", new String("request ObjectScope ����� ���ڿ�"));
session.setAttribute("bbb", new String("session ObjectScope ����� ���ڿ�"));
application.setAttribute("ccc", new String("application ObjectScope ����� ���ڿ�"));
%>

<jsp:include page="07JSPActionIncludeParam.jsp">
	<jsp:param value="srt" name="<%= value %>"/>
</jsp:include>

::06JSPActionIncludeParam.jsp �� <br/>

</body>
</html>