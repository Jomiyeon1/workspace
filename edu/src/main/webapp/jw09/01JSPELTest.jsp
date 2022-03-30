<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<%@page isELIgnored="false" %> <%-- ==> 디폴드값 false --%>
    
${"홍길동"}
${1+2}
${"1"+2}

${10 == 10} <br/>
${10 > 100? "10이 100보다 크다 true" : "10이 100보다 작다 false"}

<%-- ${"홍"*3} <= NumberFormatException 
내부적으로 "홍"을 Inter.parseInt를 실행하기 때문.
--%>