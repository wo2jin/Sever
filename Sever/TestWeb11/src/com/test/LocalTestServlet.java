package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/LocalTestServlet")

public class LocalTestServlet extends HttpServlet{
	int number = 0; //메소드 밖에 있을경우 값을 공유한다.
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		while(number++<10000) {
			out.println("<html><body>");
			out.print(number+"<br>");
			out.println("</body></html>");
			out.flush(); //나오는 족족 출력해라
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
