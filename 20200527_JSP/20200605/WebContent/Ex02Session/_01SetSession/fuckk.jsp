<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
date : <%=date %><br>
formatter : <%=formatter.format(date)%><br>

<hr>
技记 ID : <%=session.getId() %> <br>
<% 
	date.setTime(session.getCreationTime());
	out.print("技记 积己 矫埃 : " + formatter.format(date));
	
	date.setTime(session.getLastAccessedTime());
	out.print("<br>弥辟 立加 矫埃 : " + formatter.format(date));
%>
</body>
</html>