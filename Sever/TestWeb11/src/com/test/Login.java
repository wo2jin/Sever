package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws IOException,ServletException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();

		Cookie[] c = req.getCookies();
		if(c != null) {
			//out.print(c[0].getName() +","+c[0].getValue());
			if(c[0].getValue().equals("Y")) {
				out.print("logined");
			}else {
				out.println("<html><body>");
				out.println("<form action ='LoginProcess3' method='get'>");
				out.println("아이디 :<input type ='text' name='userId'><br>");
				out.println("비밀번호 :<input type='password' name='userPwd'><br>");
				out.println("<input type='checkbox' name='state' value ='yes'>로그인 상태유지<br>");
				out.println("<input type='submit' value='로그인'><br>");
				out.println("</form>");
				out.println("</body></html>");
				out.close();
			}
		}else {
			out.println("<html><body>");
			out.println("<form action ='LoginProcess3' method='get'>");
			out.println("아이디 :<input type ='text' name='userId'><br>");
			out.println("비밀번호 :<input type='password' name='userPwd'><br>");
			out.println("<input type='checkbox' name='state' value ='yes'>로그인 상태유지<br>");
			out.println("<input type='submit' value='로그인'><br>");
			out.println("</form>");
			out.println("</body></html>");
			out.close();
		}
		
	}
}
