package com.training;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class useraccounts
 */
public class UserAccounts extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><meta http-equiv=Content-Type content=text/html; charset=ISO-8859-1>");
		out.println("<title>Your Accounts</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Your Accounts </h3>");

		out.println("<h3>Accounts A(Balance 1234.00)</h3>");
		out.println("<h3>Accounts B(Balance 56789.00)</h3>");

		out.println("<br>");
		out.println("<a href=\"/ServletSample/UserCards\">Your Cards..</a>");
		out.println("<br>");
		out.println("<a href=\"/ServletSample/UserLoans\">Your loans..</a>");

		out.println("<br><a href=\"/ServletSample/BankHomePage\">Click here to go back to homepage</a>");
		out.println("</body></html>");
	}

}
