package com.training;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BankHomePage extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=Content-Type content=text/html; charset=ISO-8859-1>");
		out.println("<title>Bank Home Page</title>");
		out.println("</head><body>");
		out.println("<h1>Welcome to Spring Bank</h1>");
		out.println("<Table border=1 width=100%>");
		out.println("<tr><td>");
		out.println("<a href=\"/ServletSample/Logon\">Existing Users...Click here to logon</a><br/>");
		out.println("</td><td>");
		out.println("<a href=\"/ServletSample/Accounts\">Click here to jump to the find the account types being offered by bank</a><br/>");
		out.println("<a href=\"/ServletSample/Loans\">Click here to jump to the Loans offer Page</a><br/>");
		out.println("<a href=\"/ServletSample/Cards\">Click here to jump to the Cards offer Page</a>");
		out.println("</td></tr></Table>");
		out.println("</body>");
		out.println("</html>");

	}

}
