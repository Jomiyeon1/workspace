<%@ page language="java" contentType="text/html; charset=EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="num1" value="100" scope="page" />
<c:set var="num2" />

num1 : ${pageScope.num1} <br/>
num2 : _${pageScope.num2}_ <br/>

num1 + num2 = ${num1 + pageScope.num2} <br/>

<c:set var="num1" value="${num1+100}" />
num1 + 100 :  ${num1} <br/>
<hr/>
empty num1 => ${empty num1}_ <br/>
empty num2 => ${empty num2}_ <br/> <hr/>
<c:remove var="num1" scope="page" />

num1 c:remave ÈÄ °ª = _${pageScope.num1}_ <br/>
num2 = _${pageScope.num2}_ <br/>
empty num1 => ${empty num1}_ <br/>
empty num2 => ${empty num2}_ <br/>