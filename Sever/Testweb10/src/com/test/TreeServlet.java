package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TreeServlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service started");
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		out.print("<html><body>Three Servlet");
		out.print("</body></html>");
		
	}

}
