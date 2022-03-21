<%@ page contentType="text/html;charset=EUC-KR" %>

<%-- 나만 접근 가능하다. client 재실행시 reset --%>
<%

Integer count = (Integer)session.getAttribute("count");

if(count==null){
	out.println("::Browser 켜고 1번째 방문::");
	session.setAttribute("count", new Integer(1));
}
else {
	int changeCount = count.intValue()+1;
	out.println("::Browser 켜고"+changeCount+" 번째 방문::");
	
	session.setAttribute("count", new Integer(changeCount));
}

%>