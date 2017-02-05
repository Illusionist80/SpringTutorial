package com.springtraining.data.dao;

import com.springtraining.data.dto.User;

public interface UserDAO {

	public void insertData(User user);

	public void deleteData(User user);

	public void updateData(User user);

	public void findUser(String ID);
	
	public void findUserName(String ID);

	public void displayAllUsers();
	
	public void findUserCount() ;
}
