<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("euc-kr"); %>

<h3> :: JSTL c:if�� ���</h3>
<c:if test="true">
if�� ���� 1
</c:if>

<c:if test="false">
if�� ���� 2
</c:if>

<hr/>
<h3>:: Client Form Data ó��</h3>
1. �̸� : <%=request.getParameter("name")  %><br/>
1. �̸� : ${param.name} <br/>

<c:if test = "${param.name == 'ȫ�浿' }">
3. ȫ�浿�� ȯ�� <br/>
</c:if>

<c:if test = "${!empty param.name}">
3. ${param.name}�� ȯ�� <br/>
</c:if>

<c:set var="level" value="����" scope="session" />
<c:if test = "${param.age<19}">
<c:set var="level" value="û�ҳ�"/>
</c:if>

5. ${param.name}���� ${param.age}�� ${level}�Դϴ�. <br/>
Ȯ�� 1 : ${sessionScope.level} <br/>
Ȯ�� 2 : ${pageScope.level} <br/>
<hr/>

<c:if test="${!empty paramValues.sw[0]}" >
6. ������ S/W : ${paramValues.sw[0] }<br/>
</c:if>
<c:if test="${!empty paramValues.sw[1]}" >
6. ������ S/W : ${paramValues.sw[1] }<br/>
</c:if>
<c:if test="${!empty paramValues.sw[2]}" >
6. ������ S/W : ${paramValues.sw[2] }<br/>
</c:if>

<c:choose>
<c:when test="${param.age>19}">
7.${param.name}���� ����, ���� : ${param.age} <br/>
</c:when>
<c:when test="${param.age<18}">
7.${param.name}���� û�ҳ�, ���� : ${param.age} <br/>
</c:when>
<c:otherwise>
7. 7.${param.name}���� û�ҳ�? ����? ���� �Ұ�, ���� : ${param.age} <br/>
</c:otherwise>
</c:choose>

<c:if test="${!empty param.name && !empty param.age}">
<c:choose>
<c:when test="${param.age>19}">
7.${param.name}���� ����, ���� : ${param.age} <br/>
</c:when>
<c:when test="${param.age<18}">
7.${param.name}���� û�ҳ�, ���� : ${param.age} <br/>
</c:when>
<c:otherwise>
7. 7.${param.name}���� û�ҳ�? ����? ���� �Ұ�, ���� : ${param.age} <br/>
</c:otherwise>
</c:choose>
</c:if>

