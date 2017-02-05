package com.springtraining.data;

import java.sql.SQLException;

import com.springtraining.data.dao.MySQLUserDAO;
import com.springtraining.data.dto.User;

public class DAOTest {

	public static void main(String[] args) {

		MySQLUserDAO mySQLUserDAO = new MySQLUserDAO();
		User usera = new User();
		usera.setUserId(5);
		usera.setUserName("Rohit");
		usera.setPassword("r123");
		usera.setActive(1);
		usera.setUserRoleId("2");

		try {
			// CRUD - Create
			mySQLUserDAO.insertData(usera);

			System.out.println("\n**************insertData*****************\n");

			// CRUD - Read(find)
			mySQLUserDAO.findUser("1");
			System.out.println("\n**************findUser*****************\n");

			// CRUD - Read(All)
			mySQLUserDAO.displayAllUsers();
			System.out
					.println("\n*************displayAllUsers******************\n");
			// CRUD - Update
			User userb = new User();
			usera.setUserId(5);
			usera.setUserName("Akbar");
			usera.setPassword("qazwsx");
			mySQLUserDAO.updateData(userb);

			System.out.println("\n*************updateData******************\n");
			// CRUD - Delete
			mySQLUserDAO.deleteData(usera);
			System.out.println("\n*************deleteData******************\n");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Housekeeping
			mySQLUserDAO.closeAll();
		}
	}
}
