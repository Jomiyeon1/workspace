<%@ page language="java" contentType="text/html; charset=EUC-KR"%>

<html>
<head>
    <meta charset="EUC-KR">
    <title>회원가입</title>
</head>
<%-- 수정 시작 --%>
<body>
<form method='Post' action ='/Homework04/addUser.jsp'>
⊙ 개인정보
<align = "rigth"> 도움말 </align>
<hr align="left" width = 1000/>
<table border "1" width = 1000  cellspacing = 0 >
<tr>
<td> * 이름 (한글실명) </td>
<td> <input type="text" name="name"> </td>
</tr>

<tr>
<td> *성별선택 </td>
<td> 
남 <input type="radio" name="gender" value="male" checked />
여 <input type="radio" name="gender" value="female"/> <br>
</td>
</tr>

<tr>
<td> * 생년월일  </td>
<td> <div>
        생년월일
            <span class="box">
                <input  type="text" name="year" > 년
            </span>

            <span class="box">
                <select name="month">
                    <option>선택</option>
                    
                    <%for(int i = 1; i < 13; i++){ %>
                    <option value="<%=i%>"> <%=i %>월</option>
                    <%} %>
                </select>
            </span>
			
            <span class="box">
                <select name="day">
                    <option>선택</option>
                    <%for(int j = 1; j < 32; j++){ %>
                    <option value="<%=j%>"> <%=j %></option>
                    <%} %>
                 </select>
            </span>

</td>
</tr>


<tr>
<td> * 연락처 </td>
<td> 전화번호 
<input type="text" name="num">
</td>
</tr>

<tr>
<td>* 거주지 주소 </td>
<td>
<input type="button" value="국내"/>
<input type="button" value="국외"/>
<input type="text"  name="addr" width = 300; /> 
</td>
</tr>

<tr>
<td> <input type='submit' value='가입하기'> 
<input type='reset' value='취소'> </td>
</tr>
</table> 

</form>
</body>
	
<html>