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

		//CREATE TABLE
		userDao.createTable();
		System.out.println("\n**************createTable*****************\n");

		// RUN STORED PROCEDURE
		userDao.runStoredProcUpdatePassword(1, "999999");
		System.out.println("\n**************runStoredProcUpdatePassword*****************\n");

	}

}
