package com.training;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logon
 */
public class Logon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Logon</title></head>");
		out.println("<body><form action=\"/ServletSample/ValidateLogon\">");
		out.println(" Login Name <input type=\"text\" name=\"userid\"></input><br>");
		out.println(" Password    <input type=\"password\" name=\"password\"></input> <br><br>");
		out.println(" <input type=\"submit\" value=\"Submit\" ></input></form><br>");
		out.println("<a href=\"/ServletSample/BankHomePage\">Click here to go back to homepage</a>");
		out.println("</body></html>");
	}

}
