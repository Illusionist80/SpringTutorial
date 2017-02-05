package com.springtraining.data;
/**
 * 
 */
public class User {

	private Integer id;
	private String userName;
	private String password;
	private boolean enabled;
	
	public User(Integer id, String userName, String password, boolean enabled) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
