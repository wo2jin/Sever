package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/LoginProcess3")
public class LoginProcess3 extends HttpServlet {
	private boolean validateUser(String userId, 
			String userPwd) {
		if(userId.equals("홍길동") && userPwd.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		String state = req.getParameter("state");
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
	
		
		out.print("<html><body>");
		boolean loginFlag = validateUser(userId, userPwd);
		if(loginFlag) {
			if(state != null) {
				Cookie c= new Cookie("loginCheck","Y");
				c.setPath("/");
				res.addCookie(c);
				out.print("Login successful");
				out.print("<a href='Login'>Go to login</a>");
			}
			else {
				Cookie c= new Cookie("loginCheck","N");
				c.setPath("/");
				res.addCookie(c);
				out.print("Login successful");
				out.print("<a href='Login'>Go to login</a>");
			}

		}else {
			Cookie c= new Cookie("loginCheck","N");
			c.setPath("/");
			res.addCookie(c);
			out.print("Login Error");
			out.print("<a href='Login'>Go to login</a>");
		}
		
		out.print("</body></html>");
		out.close();
	}

}
