package com.springtraining.data;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtraining.data.dao.UserDAO;
import com.springtraining.data.dto.User;

public class SpringJDBCTeamplateTest {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springtraining/data/applicationDBServiceContext.xml");

		UserDAO userDao = (UserDAO) ctx.getBean("userdao");

		User usera = new User();
		usera.setUserId(5);
		usera.setUserName("Rohit");
		usera.setPassword("r123");
		usera.setActive(1);
		usera.setUserRoleId("2");

		// CRUD - Create
		userDao.insertData(usera);

		System.out.println("\n**************insertData*****************\n");

		// CRUD - Read(findRecord)
		userDao.findUser("1");
		System.out.println("\n**************findUser*****************\n");

		// CRUD - Read(findName)
		userDao.findUserName("1");
		System.out.println("\n**************findUser*****************\n");
		
		// CRUD - Read(findName)
		userDao.findUserCount();
		System.out.println("\n**************findUserCount*****************\n");
		// CRUD - Read(All)
		userDao.displayAllUsers();
		System.out
				.println("\n*************displayAllUsers******************\n");
		// CRUD - Update
		User userb = new User();
		usera.setUserId(5);
		usera.setUserName("Akbar");
		usera.setPassword("qazwsx");
		userDao.updateData(userb);

		System.out.println("\n*************updateData******************\n");
		// CRUD - Delete
		userDao.deleteData(usera);
		System.out.println("\n*************deleteData******************\n");

	}

}
