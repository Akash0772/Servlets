package com.akash;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.*;

public class Servlet1 extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String s1 = request.getParameter("firstName");
		String s2 = request.getParameter("lastName");
		int status = DbUtil.save(s1, s2);
		PrintWriter out = response.getWriter();
		if(status == 1)
		{
			out.println("saved in the db successfully");	
		}
		else
		{
			out.println("some error");	
		}
	}
}

// compile from src