package com.training;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class validatelogon
 */
public class ValidateLogon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userid = request.getParameter("userid");
		String password = request.getParameter("password");

		System.out.println(userid);
		System.out.println(password);

		if ("usera".equals(userid) && "passa".equals(password)) {

			response.sendRedirect("/ServletSample/UserAccounts");
		} else {

			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>ValidateLogon</title></head><h3>Invalid Logon Details</h3>");
			out.println("<body>");
			out.println("<a href=\"/ServletSample/BankHomePage\">Click here to go back to homepage</a>");
			out.println("</body></html>");

		}

	}

}
