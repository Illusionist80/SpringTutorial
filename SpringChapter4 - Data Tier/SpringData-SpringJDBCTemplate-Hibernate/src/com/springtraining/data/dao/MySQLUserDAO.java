package com.springtraining.data.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springtraining.data.dto.User;
import com.springtraining.data.dto.UserRowMapper;

public class MySQLUserDAO implements UserDAO {

	private JdbcTemplate jdbcTemplate;

	public MySQLUserDAO() {
	}

	public void insertData(User user) {

		String sql = "INSERT INTO test.users "
				+ "  (USER_ID, USERNAME, PASSWORD, ACTIVE, USER_ROLE_ID)  "
				+ "VALUES  (?,  ?,  ?, ?, ?)";

		jdbcTemplate.update(
				sql,
				new Object[] { user.getUserId(), user.getUserName(),
						user.getPassword(), user.getActive(),
						user.getUserRoleId() });

		System.out.println("Insert SQL executed successfully ");
	}

	public void deleteData(User user) {

		String sql = "DELETE FROM test.users WHERE USER_ID = ?";

		jdbcTemplate.update(sql, new Object[] { user.getUserId() });

		System.out.println("Delete SQL executed successfully ");
	}

	public void updateData(User user) {

		String sql = "UPDATE test.users SET USERNAME = ?, PASSWORD = ? WHERE USER_ID =?";

		jdbcTemplate.update(
				sql,
				new Object[] { user.getUserName(), user.getPassword(),
						user.getUserId() });

		System.out.println("Update SQL executed successfully ");
	}

	public void findUserName(String ID) {

		String sql = "select USERNAME from test.users where  USER_ID = ?";

		String userName = jdbcTemplate.queryForObject(sql, new Object[] { ID },
				String.class);

		System.out.println(userName);

		System.out.println("Select SQL executed successfully ");
	}

	public void findUser(String ID) {

		String sql = "select * from test.users where  USER_ID =" + ID;

		List<User> users = new ArrayList<User>();

		User user = jdbcTemplate.queryForObject(sql, new UserRowMapper());

		System.out.println(user);

		System.out.println("Select SQL executed successfully ");
	}

	public void displayAllUsers() {

		List<User> users = new ArrayList<User>();
		String sql = "select * from test.users";
		

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

//		users  = getJdbcTemplate().query(sql,
//				new BeanPropertyRowMapper(User.class));
//		System.out.println(users);
		
		for (Iterator iterator = rows.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);

		}
//		for (Iterator iterator = rows.iterator(); iterator.hasNext();) {
//			Map row = (Map) iterator.next();
//			User user = new User();
//			user.setUserId(((Long) row.get("USER_ID")).intValue());
//			user.setUserName((String) row.get("USERNAME"));
//			user.setPassword((String) row.get("PASSWORD"));
//			user.setActive(((Boolean) row.get("ACTIVE")).compareTo(Boolean.FALSE));
//			user.setUserRoleId((String) row.get("USER_ROLE_ID"));
//			System.out.println("ROW USER : "+user);
//		}

		System.out.println("Select SQL executed successfully ");
	}

	public void findUserCount() {

		String sql = "SELECT COUNT(*) FROM test.users";

		int total = getJdbcTemplate().queryForInt(sql);

		System.out.println("total : " + total);
		System.out.println("Select SQL executed successfully ");
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
