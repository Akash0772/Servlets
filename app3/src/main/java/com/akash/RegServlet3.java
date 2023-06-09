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
 * Servlet implementation class RegServlet3
 */
public class RegServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegServlet3() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		Map<String, String[]> params = request.getParameterMap();
		
		String[] firstName = (String[]) params.get("firstName");
		String[] lastName = (String[]) params.get("lastName");
		String[] age = (String[]) params.get("age");
		String[] address = (String[]) params.get("address");
		String[] gender = (String[]) params.get("gender");
		String[] skill = (String[]) params.get("skill");
		String[] education = (String[]) params.get("education");
		
		out.println("First Name: " + Arrays.toString(firstName) + "<br/>");
		out.println("Last Name: " + Arrays.toString(lastName) + "<br/>");
		out.println("Age: " + Arrays.toString(age) + "<br/>");
		out.println("Address: " + Arrays.toString(address) + "<br/>");
		out.println("Gender: " + Arrays.toString(gender) + "<br/>");
		out.println("Skills: " + Arrays.toString(skill) + "<br/>");
		out.println("Education: " + Arrays.toString(education) + "<br/>");
	}

}
