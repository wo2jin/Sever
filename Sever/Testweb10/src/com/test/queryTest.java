package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest")
public class queryTest extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		String name = req.getParameter("name");
		String[] hobbies = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String religion = req.getParameter("rdligion");
		String intro = req.getParameter("introduction");
		
		out.print("ID:"+userId+"<br>");
		out.print("��й�ȣ:"+userPwd+"<br>");
		out.print("�̸�:"+name+"<br>");
		out.print("���:");
		for(int i=0; i<hobbies.length; i++) {
			out.print(hobbies[i]+" ");
		}out.print("<br>");
		out.print("����:"+gender+"<br>");
		out.print("���� :"+religion+"<br>");
		out.print("�Ұ�:"+intro+"<br>");
		out.print("��ü ���� ���ڿ�:"+req.getQueryString());
		out.print("</body></html>");
		out.close();

		
		
	}

}
