<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("euc-kr"); %>

<h3> :: JSTL c:if을 사용</h3>
<c:if test="true">
if문 내부 1
</c:if>

<c:if test="false">
if문 내부 2
</c:if>

<hr/>
<h3>:: Client Form Data 처리</h3>
1. 이름 : <%=request.getParameter("name")  %><br/>
1. 이름 : ${param.name} <br/>

<c:if test = "${param.name == '홍길동' }">
3. 홍길동님 환영 <br/>
</c:if>

<c:if test = "${!empty param.name}">
3. ${param.name}님 환영 <br/>
</c:if>

<c:set var="level" value="성인" scope="session" />
<c:if test = "${param.age<19}">
<c:set var="level" value="청소년"/>
</c:if>

5. ${param.name}님은 ${param.age}로 ${level}입니다. <br/>
확인 1 : ${sessionScope.level} <br/>
확인 2 : ${pageScope.level} <br/>
<hr/>

<c:if test="${!empty paramValues.sw[0]}" >
6. 선택한 S/W : ${paramValues.sw[0] }<br/>
</c:if>
<c:if test="${!empty paramValues.sw[1]}" >
6. 선택한 S/W : ${paramValues.sw[1] }<br/>
</c:if>
<c:if test="${!empty paramValues.sw[2]}" >
6. 선택한 S/W : ${paramValues.sw[2] }<br/>
</c:if>

<c:choose>
<c:when test="${param.age>19}">
7.${param.name}님은 성인, 나이 : ${param.age} <br/>
</c:when>
<c:when test="${param.age<18}">
7.${param.name}님은 청소년, 나이 : ${param.age} <br/>
</c:when>
<c:otherwise>
7. 7.${param.name}님은 청소년? 성인? 구분 불가, 나이 : ${param.age} <br/>
</c:otherwise>
</c:choose>

<c:if test="${!empty param.name && !empty param.age}">
<c:choose>
<c:when test="${param.age>19}">
7.${param.name}님은 성인, 나이 : ${param.age} <br/>
</c:when>
<c:when test="${param.age<18}">
7.${param.name}님은 청소년, 나이 : ${param.age} <br/>
</c:when>
<c:otherwise>
7. 7.${param.name}님은 청소년? 성인? 구분 불가, 나이 : ${param.age} <br/>
</c:otherwise>
</c:choose>
</c:if>

