package model;

public class LoginService {

	UserBean user = new UserBean();

	public LoginService() {
	}

	public boolean isValidUser(String userName, String password) {

		//Can talk to BankDBservice
		if (userName.equalsIgnoreCase("usera")
				&& password.equalsIgnoreCase("passa")) {
			return true;
		}
		return false;
	}

	public UserBean getUser() {
		return user;
	}
}
