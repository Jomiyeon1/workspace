<%@ page contentType="text/html;charset=EUC-KR" %>

<%-- server 내리기 전까진 server(사이트)에 들어오는 사람은 모두 공유 :: ★동기화문제★ --%>
<%
Integer count = (Integer)application.getAttribute("count");

if(count == null){
	out.println("::해당 페이지 1번째 출력::");
	application.setAttribute("count", new Integer(1));
} else {
	int changeCount = count.intValue()+1;
	out.println("::해당 페이지"+changeCount+" 번째 출력::");
	
	application.setAttribute("count", new Integer(changeCount));
}


%>