package com.akash;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet4
 */
public class RegServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegServlet4() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String queryString = request.getQueryString();
		String[] params = queryString.split("&");
		String name, value;
		int index;
		for(String param : params) {
			index = param.indexOf('=');
			name = param.substring(0, index);
			value = param.substring(index + 1, param.length());
			out.println(name + ":" + value + "</br>");
		}
	}

}
