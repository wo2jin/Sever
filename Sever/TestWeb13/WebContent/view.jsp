<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.sql.*" %>
<%
	String dept_id = request.getParameter("dept_id");

	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = DriverManager.getConnection(url,"scott","tiger");
	String strSql = "SELECT * FROM DEPT WHERE DEPT_ID = ?";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	stmt.setString(1,dept_id);
	ResultSet rs= stmt.executeQuery();
	//response.sendRedirect("list.jsp");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   while(rs.next()){
      %>
      <table border="1">
      <th>부서번호</th>
      <th>부서이름</th>
      <th>위치코드</th>
   <tr>
      <td>
         <%=rs.getInt("DEPT_ID") %>
      </td>
      <td>
         <%=rs.getString("DEPT_NAME") %>
      </td>
      <td>
         <%=rs.getInt("LOC_ID") %>
      </td>
   </tr>
   
</table>

	
	<%	
		}
	%>
	<br>
	<a href="list.jsp">목록</a>&nbsp;
	<a href="update.jsp?dept_id=<%=dept_id%>">수정</a>&nbsp;<a href="delete.jsp?dept_id=<%=dept_id%>">삭제</a>
</body>
</html>