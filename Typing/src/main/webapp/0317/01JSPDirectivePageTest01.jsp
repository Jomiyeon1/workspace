
<!--  JSP page directive Element ���� -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.util.*" %>

<%@ page language="java" %>
<%@ page info = "ó�� �ۼ��ϴ� JSP" %>

<%@ page session = "true"%>
<%@ page isThreadSafe="true" %>

<%--
	JSP �ּ� : JSP Container�� java File ��ȯ�� �ּ��ν�
	<%@ page extends = "java.util.Vector" %>
 --%>
 
 <%
 	String value = "��������";
 	System.out.println("::" + value);
 	
 	Calendar calender = Calendar.getInstance();
 	int year = calender.get(Calendar.YEAR);
 	System.out.println("::" + year + "��");
 	
 	String info = getServletInfo();
 	System.out.println("::information" + info );
 %>

<html>
<head></head>
	<body>
	�ȳ��ϼ��� html ����<br/>
	<hr/>
	<%="::" + value %><br/>
	<%="::" + year + "��" %><br/>
	<%=":: information : " + info %>
	<hr/>
	�ȳ��ϼ��� html ��!<br/>
	</body>
</html>