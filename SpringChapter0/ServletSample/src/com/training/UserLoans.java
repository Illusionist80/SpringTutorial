package com.training;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userloans
 */
public class UserLoans extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><meta http-equiv=Content-Type content=text/html; charset=ISO-8859-1>");
		out.println("<title>Your Loans</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Your Loans</h3>");
		out.println("<h3>Loan A(Balance -888.00)</h3>");
		out.println("<h3>Loan B(Balance -60.00)</h3>");
		out.println("<br><a href=\"/ServletSample/UserAccounts\"> My Account</a>");
		out.println("<br><a href=\"/ServletSample/BankHomePage\">Click here to go back to homepage</a>");
		out.println("</body></html>");

	}

}
