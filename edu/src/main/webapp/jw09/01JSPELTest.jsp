<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<%@page isELIgnored="false" %> <%-- ==> �����尪 false --%>
    
${"ȫ�浿"}
${1+2}
${"1"+2}

${10 == 10} <br/>
${10 > 100? "10�� 100���� ũ�� true" : "10�� 100���� �۴� false"}

<%-- ${"ȫ"*3} <= NumberFormatException 
���������� "ȫ"�� Inter.parseInt�� �����ϱ� ����.
--%>