<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%
/*	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = DriverManager.getConnection(url,"scott","tiger");*/
	
	InitialContext ic = new InitialContext();
	DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
	Connection conn = ds.getConnection();
	
	String strSql = "SELECT * FROM DEPT ORDER BY DEPT_ID DESC";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	ResultSet rs =stmt.executeQuery();
%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DEPT LIST</title>
</head>
<body>
	<a href="insert.jsp">추가</a>
	<table border="1">
		<tr>
			<td>부서번호</td>
			<td>부서명</td>
			<td>부서위치</td>
			<td>삭제</td>
		<tr>
	<%
		while(rs.next()){
	%>
		<tr>
			<td><%=rs.getInt("dept_id")%></td>
			<td><a href="view.jsp?dept_id=<%=rs.getInt("DEPT_ID")%>"><%=rs.getString("dept_name") %></a></td>
			<td><%=rs.getString("loc_id")%></td>
			<td><a href="delete.jsp?dept_id=<%=rs.getInt("DEPT_ID")%>">삭제</a></td>
		</tr>
		<%} %>
	</table>


</body>
</html>