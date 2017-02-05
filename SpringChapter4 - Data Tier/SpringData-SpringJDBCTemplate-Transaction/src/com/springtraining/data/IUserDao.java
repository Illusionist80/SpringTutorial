package com.springtraining.data;

public interface IUserDao {

	int insertUser(User user);

	int updateUser(User user) throws Exception;

	void deleteUser(int uid);

	User selectUser(int uid);
}
