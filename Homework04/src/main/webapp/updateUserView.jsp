<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@page import="jw.common.user.dao.UserDao"%>
<%@page import="jw.common.user.vo.UserVO"%>

<%
	String name = request.getParameter("name");
	System.out.println("::"+name);

	if(name == null){
		
		name =  ( (UserVO)session.getAttribute("userVO")).getName();

	}

	// DB�� �����ϴ� UserDAO�� �̿� ȸ������ select
	UserDao bean = new UserDao();
	UserVO userVO = bean.findUser(name);
%>


<html>
<head>
</head>
<body>
	<form method='Post' action='/Homework04/updateUser.jsp'>
		�� ��������
		<align= "rigth"> ���� </align>
		<hr align="left" width=1000 />
		<table border "1" width=1000 cellspacing=0>
			<tr>
				<td>* �̸� (�ѱ۽Ǹ�)</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>*��������</td>
				<td>�� <input type="radio" name="gender" value="male" checked />
					�� <input type="radio" name="gender" value="female" /> <br>
				</td>
			</tr>

			<tr>
				<td>* �������</td>
				<td>
					<div>
						������� <span class="box"> <input type="text" name="year">
							��
						</span> <span class="box"> <select name="month">
								<option>����</option>

								<%
								for (int i = 1; i < 13; i++) {
								%>
								<option value="<%=i%>">
									<%=i%>��
								</option>
								<%
								}
								%>
						</select>
						</span> <span class="box"> <select name="day">
								<option>����</option>
								<%
								for (int j = 1; j < 32; j++) {
								%>
								<option value="<%=j%>">
									<%=j%></option>
								<%
								}
								%>
						</select>
						</span>
				</td>
			</tr>


			<tr>
				<td>* ����ó</td>
				<td>��ȭ��ȣ <input type="text" name="num">
				</td>
			</tr>

			<tr>
				<td>* ������ �ּ�</td>
				<td><input type="button" value="����" /> <input type="button"
					value="����" /> <input type="text" name="addr" width=300; /></td>
			</tr>

			<tr>
				<td><input type='submit' value='�����ϱ�'> </input type='reset' value='���'></td>
			</tr>
		</table>

	</form>
</body>
</html>