package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginService;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String command = (String) request.getParameter("command");

		// check commands
		if ("home".equals(command)) {
			handleHome(request, response);
		} else if ("publicaccounts".equals(command)) {
			handlePublicAccounts(request, response);
		} else if ("publicloans".equals(command)) {
			handlePublicLoans(request, response);
		} else if ("publiccards".equals(command)) {
			handlePublicCards(request, response);
		} else if ("logon".equals(command)) {
			handleLogon(request, response);
		} else if ("logonentry".equals(command)) {
			handleLogonEntry(request, response);
		} else if ("usercards".equals(command)) {
			handleUserCards(request, response);
		} else if ("userloans".equals(command)) {
			handleUserLoans(request, response);
		} else if ("useraccounts".equals(command)) {
			handleUserAccounts(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String command = (String) request.getParameter("command");

		// check commands
		if ("home".equals(command)) {

			handleHome(request, response);
		} else if ("publicaccounts".equals(command)) {
			handlePublicAccounts(request, response);
		} else if ("publicloans".equals(command)) {
			handlePublicLoans(request, response);
		} else if ("publiccards".equals(command)) {
			handlePublicCards(request, response);
		} else if ("logon".equals(command)) {
			handleLogon(request, response);
		} else if ("usercards".equals(command)) {
			handleUserCards(request, response);
		} else if ("userloans".equals(command)) {
			handleUserLoans(request, response);
		} else if ("useraccounts".equals(command)) {
			handleUserAccounts(request, response);
		}

	}

	private void handleLogon(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		LoginService loginService = new LoginService();

		if (loginService.isValidUser(userName, password)) {
			// UserBean user=loginService.getUser();
			// request.setAttribute("user", user);
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("useraccounts.jsp");
			requestDispatcher.forward(request, response);
		} else {
			System.out.println("Wrong Login or Password");
			response.sendRedirect("logon.jsp");
		}

	}

	private void handleHome(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("bankhomepage.jsp");
		requestDispatcher.forward(request, response);

	}

	private void handleLogonEntry(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("logon.jsp");
		requestDispatcher.forward(request, response);
	}

	private void handlePublicAccounts(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("accounts.jsp");
		requestDispatcher.forward(request, response);

	}

	private void handlePublicLoans(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("loans.jsp");
		requestDispatcher.forward(request, response);

	}

	private void handlePublicCards(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("cards.jsp");
		requestDispatcher.forward(request, response);
	}

	private void handleUserCards(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("usercards.jsp");
		requestDispatcher.forward(request, response);
	}

	private void handleUserLoans(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("userloans.jsp");
		requestDispatcher.forward(request, response);

	}

	private void handleUserAccounts(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("useraccounts.jsp");
		requestDispatcher.forward(request, response);
	}

}
