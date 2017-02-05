package com.springtraining.data.simpledbconnectivity;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtraining.data.IUserDao;
import com.springtraining.data.User;
/**
 * 
 * @author Apurav
 *
 */
public class TestJdbc {
	public static void main(String[] args) throws ClassNotFoundException {
		/**
		 * To connect with a database we can either adopt one of the two
		 * techniques i.e. Datasource or the DriverManager. Here we are using
		 * datasource way to communicate with database. The DriverManager is
		 * older facility, DataSource is newer. It is recommended to use the new
		 * DataSource facility to connect to databases and other resources.
		 * DataSource facility has several advantages over DriverManager
		 * facility. Using DataSource increases portability.The DataSource
		 * enables connection pooling and distributed transactions, the
		 * DriverManager does not allow such techniques
		 */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"springjdbc/simpledbconnectivity/jdbcContext.xml");
		IUserDao dao = applicationContext.getBean("userDao", IUserDao.class);
		int userId = generateId();
		User user = new User(userId, "apurav", "12345", false);
		dao.insertUser(user);
		System.out.println("User inserted with id= " + userId);
		dao.deleteUser(984);
	}

	private static int generateId() {
		return new Random().nextInt(999);
	}
}
