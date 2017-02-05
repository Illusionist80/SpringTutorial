package model;

public class BankDBHelper {
	

	public boolean validateLogon(String userName, String password) {
		
	  	System.out.println("userName:"+userName);
	  	System.out.println("password:"+password);

		//Can talk to DB
		if ("usera".equalsIgnoreCase(userName)
				&& "passa".equalsIgnoreCase(password)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void getAccountDatafromDB() {

		//TODO talk to DB
	}

	public void getLoanDatafromDB() {

		//TODO talk to DB
	}

	public void getCardDatafromDB() {

		//TODO talk to DB
	}

}
