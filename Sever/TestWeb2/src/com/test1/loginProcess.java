package com.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginProcess
 */
@WebServlet("/loginProcess")
public class loginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		
		out.println("<html><body>");
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String gender = request.getParameter("gender");
		out.print("로그인을 하였습니다"+"<br>");
		out.print("당신의 아이디는 : "+userId+"<br>");
		out.print("당신의 비밀번호는 :"+userPwd+"<br>");
		out.print("당신의 성별은:"+gender+"<br>");
		out.print("수고 많으셨습니다.");
		out.println("</body></html>");
		
	}

}
