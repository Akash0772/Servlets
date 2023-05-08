package com.akash;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet1
 */
public class RegServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String skill = request.getParameter("skill");
		String education = request.getParameter("education");

		out.println("First Name:" + firstName + "<br/>");
		out.println("Last Name:" + lastName + "<br/>");
		out.println("Age:" + age + "<br/>");
		out.println("Address:" + address + "<br/>");
		out.println("Gender:" + gender + "<br/>");
		out.println("Skill:" + skill + "<br/>");
		out.println("Education:" + education + "<br/>");
	
	}

}


/*
 
 
 http://localhost:8080/app3/reg1.html?
 firstName=a&
 lastName=s&
 age=23&
 address=hsr&
 gender=m&
 skill=c&skill=cpp&skill=j&skill=a&skill=sb&skill=n&skill=s&skill=jsp&skill=jdbc&
 education=bca&education=be&education=mca&education=mba
 
 request
-------
public String getParameter(String name)
public String[] getParameterValues(String name)
public String getQueryString()
public Map getParameterMap()
public Enumeration getParameterNames()
 
 */











