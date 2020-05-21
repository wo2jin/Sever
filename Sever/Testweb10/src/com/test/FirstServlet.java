package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {

	
	@Override
	public void service(ServletRequest req,
			ServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>Hello Servlet</b>");
		out.print("</body></html>");
	}
	

}
