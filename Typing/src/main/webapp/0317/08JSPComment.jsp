<%@ page contentType="text/html; charset=EUC-KR"%>


<html>
<head></head>
	<body>
	
	1. 주석문 연습입니다.<br/>
	
<%
String str1 = "주석1";
String str2 = "주석2";
%>
	<!-- 
		<%= str1%>
		나는 html 주석입니다.
	 -->
	
	<!-- 
		<%= str2%>
		나는 html 주석입니다.
	 -->
	 
	 <%--
	 	나는 JSP 주석입니다.
	  --%>
	  
	  <%
	  //주석처리만 했음.
	  //개행처리라 함은
	  %>

</body>
</html>

<!-- 
	::실행 후...
	- Browser 화면
	- Browser 화면에서 소스보기한 내용
	- ~~.jsp 파일
	- ~~.java 파일
	동시오픈하여
	html주석, JSP주석, java 주석 확인
 -->