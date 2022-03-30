<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("euc-kr"); %>

1. c:forEach�̿� Array ���۵Ǵ� ParamValues ���(begin=0, step=1�� ���)<br/>
<!-- paramValues�� EL ���尴ü�� [�Ķ�����̸�, ���� �迭]�� ������ Map��ü -->
<c:forEach var="i" items="${paramValues.sw}" begin="0"  step="1">
 o �����Ͻ� SW�� ${i}<br/>
</c:forEach><br/>

2. c:forEach�̿� Array���۵Ǵ� ParamValues ���(begin, step���� ���)<br/>
<!-- begin / step��� ������ defult��? -->
<c:forEach var="i" items="${paramValues.sw }">
 o �����Ͻ� SW�� ${i}<br/>
</c:forEach><br/>

3. c:forEach�̿� Map���� ���۵Ǿ� ���� Param���<br/>
<!-- Param�� EL���尴ü�� [�Ķ�����̸�, ���� �迭]�� ������ Map��ü -->
<c:forEach var="i" items="${param}">
 o ${i.key } : ${i.value}<br/>
</c:forEach><br/>

4. c:forEach�̿� Map���� ���۵Ǿ���� Param��� <br/>
<c:forEach var="i" items="${param}">
	<c:if test="${!empty param.name}">
 		o ${param.name}���� ���̴� ${param.age} �Դϴ�.<br/>
 	</c:if>
 </c:forEach><br/>
 
 
 5. c:forEach�̿� Map���� ���۵Ǿ� ���� Param ��� <br/>
 <c:forEach var="i" items="${param}">
	<c:if test="${i.key == 'name' }">
 		o ${param.name}���� ���̴� ${param.age} �Դϴ�.<br/>
 	</c:if>
 </c:forEach><br/>