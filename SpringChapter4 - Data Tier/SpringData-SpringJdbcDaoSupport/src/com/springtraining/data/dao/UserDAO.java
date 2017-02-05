package com.springtraining.data.dao;


public interface UserDAO {

	public void runStoredProcUpdatePassword(int ID, String newPass) ;

	public void createTable();
}
