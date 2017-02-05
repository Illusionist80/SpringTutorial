package com.springtraining.data.transactions.declarative.xml;

import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springtraining.data.IUserDao;
import com.springtraining.data.User;


public class UserDao implements IUserDao {
/*For reference visit:
*	http://monstersandwich.blogspot.com/2010/04/spring-transactions-sample-applications.html
**/
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private ApplicationContext applicationContext;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void deleteUser(int uid) {
	String delQuery = "delete from users where id = ?";
	jdbcTemplate.update(delQuery, new Object[]{uid});

	}

	public int insertUser(User user) {
		String inserQuery = "insert into users (username, password, enabled , id) values (?, ?, ?, ?) ";
		Object[] params = new Object[]{user.getUserName(), user.getPassword(),user.isEnabled(),user.getId()};
		int[] types = new int[]{Types.VARCHAR,Types.VARCHAR,Types.BIT,Types.INTEGER};
		int number =  jdbcTemplate.update(inserQuery,params,types);
		IUserDao dao = applicationContext.getBean("userDao", IUserDao.class);
		
		//!!!!!!!!!!!!!!! IMPORTANT !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		/*To test the transaction propagation behaviour call another transacted method.
		 * So in this case when you call selectUser, transaction behaviour as described 
		 * in xml can be practically seen*/ 
		dao.selectUser(3);
		/////////////////// IMPORTANT/////////////////////////////
		
		return number;
	}

	public User selectUser(int uid) {
		// for all the RuntimeExceptions the transactions will be automatically
		// rolled back
		throw new RuntimeException("An intentional runtime exception");

	}

	public int updateUser(User user) throws Exception {
		/*
		 * for checked exceptions, transactions are not rolled back by default.
		 * The rolled back behaviour can be controlled by mentioning properties
		 * in xml file. Please chk
		 */
		throw new Exception("An intentional checked exception");
	}

}
