<%@ page contentType="text/html;charset=EUC-KR" %>
<%-- res시 사라진다. -> 평생 1번째 request만 출력됨! --%>

<%
Integer count = (Integer)request.getAttribute("count");

if(count==null){
	out.println("::1번째 Request::");
	session.setAttribute("count", new Integer(1));
}
else {
	int changeCount = count.intValue()+1;
	out.println("::"+changeCount+" 번째 Request::");
	
	session.setAttribute("count", new Integer(changeCount));
}


%>