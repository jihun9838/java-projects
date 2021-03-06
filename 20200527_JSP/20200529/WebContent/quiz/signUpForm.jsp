<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String title = "sign Up";
	String btnName = "회원 가입";
	String readOnly = "";
	String state = request.getParameter("state");
	
	//state.isBlank()
	if(state == null) 	state ="sign Up";
	if(name == null) 	name = "";
	if(id == null) 		id = "";
	
	if("modify".contentEquals(state)){
		title = "정보수정";
		btnName = "수정";
		readOnly = "readonly";
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Sign Up</title>
</head>
<body>

	<h1 align="center"><%=title %></h1>
	<hr>
	<form action="signUpProc.jsp" method="post">
		<table align="center">
			<tr>
				<td align="right">이름</td>
				<td colspan="2"><input type="text" name="name" value="<%=name %>" <%=readOnly %>></td>
			</tr>
			<tr>
				<td align="right">아이디</td>
				<td colspan="2"><input type="text" name="id" value="<%=id %>"></td>
			</tr>
			<tr>
				<td align="right">패스워드</td>
				<td colspan="2"><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td align="right">패스워드 확인</td>
				<td colspan="2"><input type="password" name="pwCheck"></td>
			</tr>
			<tr>
				<td><input type="submit" value="<%= btnName %>" /></td>
				<td><input type="reset" value="취소" /></td>
				<td><button formaction="loginForm.jsp">로그인</button></td>
			</tr>
		</table>
	</form>
</body>
</html>