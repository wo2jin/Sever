<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.Date"
    errorPage="myerrorpage.jsp"%>
    <!-- 페이지 서언 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Date d = new Date();
%>
<%= new Date() %> <!-- =는 출력 -->
<%= 10/0 %>
</body>
</html>