package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginProcess
 */

@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		String userId = request.getParameter("userId");
		String userPwd= request.getParameter("userPwd");
		HttpSession session = request.getSession();
		session.setAttribute("userId", userId);
		session.setAttribute("userPwd",userPwd);
		out.print("set session values");
		out.print("<a href='LoginProcess2'>Session view</a>");
		
		out.close();
	}

}
