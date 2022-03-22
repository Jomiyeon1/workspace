<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

 <h2>회원정보 조회</h2><br/>
 이름을 입력하세요.
 

	<form method="post" action="/Homework04/findUser.jsp">
		
		<table border="1" width="80%" cellspacing = 0>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" value=" 입력완료"/></center></td>
			</tr>
		</table>
		
	</form>	
	
</body>
</html>