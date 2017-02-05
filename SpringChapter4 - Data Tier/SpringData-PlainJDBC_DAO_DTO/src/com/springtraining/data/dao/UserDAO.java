package com.springtraining.data.dao;

import java.sql.SQLException;

import com.springtraining.data.dto.User;

public interface UserDAO {

	public void insertData(User user) throws SQLException;

	public void deleteData(User user) throws SQLException;

	public void updateData(User user) throws SQLException;

	public void findUser(String ID) throws SQLException;

	public void displayAllUsers() throws SQLException;
}
