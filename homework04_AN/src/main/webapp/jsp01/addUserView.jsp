<%@ page contentType="text/html; charset=EUC-KR" %>

<html>
<body>

회원가입을 위한 회원정보 입력화면.....<br/>

	<form method="post" action="/homework04/jsp01/addUser.jsp">
		
		<table border="1" width="80%">
			<tr>
				<td>이이디</td>
				<td><input type="text" name="id"/></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="pwd"/></td>
			</tr>
			<tr>
				<td>행운번호</td>
				<td><input type="text" name="no"/></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" value=" 입력완료"/></center></td>
			</tr>
		</table>
		
	</form>	
	
</body>
</html>