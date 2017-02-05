package com.training;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class accounts
 */
public class Accounts extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<meta http-equiv=Content-Type content=text/html; charset=ISO-8859-1>");
		out.println("<title>Accounts Public Page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h5><img src=\"images/accounts_image.jpg\"></h5>");
		out.println("<a href=\"/ServletSample/BankHomePage\">Click here to go back to homepage</a>");
		out.println("</body></html>");
	}
}
