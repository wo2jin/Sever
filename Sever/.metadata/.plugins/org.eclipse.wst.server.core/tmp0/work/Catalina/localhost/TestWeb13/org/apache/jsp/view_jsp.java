/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2020-05-20 00:51:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");

	String dept_id = request.getParameter("dept_id");

	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = DriverManager.getConnection(url,"scott","tiger");
	String strSql = "SELECT * FROM DEPT WHERE DEPT_ID = ?";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	stmt.setString(1,dept_id);
	ResultSet rs= stmt.executeQuery();
	//response.sendRedirect("list.jsp");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

   while(rs.next()){
      
      out.write("\r\n");
      out.write("      <table border=\"1\">\r\n");
      out.write("      <th>부서번호</th>\r\n");
      out.write("      <th>부서이름</th>\r\n");
      out.write("      <th>위치코드</th>\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td>\r\n");
      out.write("         ");
      out.print(rs.getInt("DEPT_ID") );
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("      <td>\r\n");
      out.write("         ");
      out.print(rs.getString("DEPT_NAME") );
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("      <td>\r\n");
      out.write("         ");
      out.print(rs.getInt("LOC_ID") );
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
	
		}
	
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<a href=\"list.jsp\">목록</a>&nbsp;\r\n");
      out.write("\t<a href=\"update.jsp?dept_id=");
      out.print(dept_id);
      out.write("\">수정</a>&nbsp;<a href=\"delete.jsp?dept_id=");
      out.print(dept_id);
      out.write("\">삭제</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}