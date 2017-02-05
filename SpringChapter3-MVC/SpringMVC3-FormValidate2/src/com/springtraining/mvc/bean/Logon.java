package com.springtraining.mvc.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class Logon {
	@NotEmpty(message = "UserID should not be blank(JSR303).")
	private String userId;
	@NotEmpty
	private String password;
	
	private String userRole;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Logon [userId=").append(userId).append(", password=")
				.append(password).append(", userRole=").append(userRole)
				.append("]");
		return builder.toString();
	}
}
