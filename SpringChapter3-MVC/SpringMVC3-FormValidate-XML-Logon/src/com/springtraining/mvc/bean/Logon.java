package com.springtraining.mvc.bean;

public class Logon {

	private String userId;
	private String password;
	private String userRole;
	
	private boolean rememberMe;
	private String daysCount;
	
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
	
	public boolean isRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	public String getDaysCount() {
		return daysCount;
	}
	public void setDaysCount(String daysCount) {
		this.daysCount = daysCount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Logon [userId=").append(userId).append(", password=")
				.append(password).append(", userRole=").append(userRole)
				.append(", rememberMe=").append(rememberMe)
				.append(", daysCount=").append(daysCount).append("]");
		return builder.toString();
	}
}
