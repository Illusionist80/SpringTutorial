package com.springtraining.data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.springtraining.data.db.DbUtil;
import com.springtraining.data.db.JDBCConnectionFactory;
import com.springtraining.data.dto.User;

public class MySQLUserDAO implements UserDAO {

	private Connection conn;
	private PreparedStatement ps;
	ResultSet result;

	public MySQLUserDAO() {
		super();
		this.conn = JDBCConnectionFactory.getConnection();
	}

	public void insertData(User user) throws SQLException {

		String INSERT_SQL = "INSERT INTO test.users "
				+ "  (USER_ID, USERNAME, PASSWORD, ACTIVE, USER_ROLE_ID)  "
				+ "VALUES  (?,  ?,  ?, ?, ?)";
		ps = conn.prepareStatement(INSERT_SQL);
		ps.setInt(1, user.getUserId());
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getPassword());
		ps.setInt(4, user.getActive());
		ps.setString(5, user.getUserRoleId());
		ps.executeUpdate();

		System.out.println("Insert SQL executed successfully ");
	}

	public void deleteData(User user) throws SQLException {

		String INSERT_SQL = "DELETE FROM test.users WHERE USER_ID = ?";

		ps = conn.prepareStatement(INSERT_SQL);
		ps.setInt(1, user.getUserId());
		ps.executeUpdate();

		System.out.println("Delete SQL executed successfully ");
	}

	public void updateData(User user) throws SQLException {

		String INSERT_SQL = "UPDATE test.users SET USERNAME = ?, PASSWORD = ? WHERE USER_ID =?";

		ps = conn.prepareStatement(INSERT_SQL);
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getPassword());
		ps.setInt(3, user.getUserId());
		ps.executeUpdate();

		System.out.println("Update SQL executed successfully ");
	}

	public void findUser(String ID) throws SQLException {

		ps = conn
				.prepareStatement("select * from test.users where  USER_ID ="
						+ ID);
		result = ps.executeQuery();

		while (result.next()) {
			System.out.println("Record Found -> " + result.getString(1) + " "
					+ result.getString(2) + " " + result.getString(3));
		}

		System.out.println("Select SQL executed successfully ");
	}

	public void displayAllUsers() throws SQLException {

		ResultSet result = null;

		ps = conn
				.prepareStatement("select * from test.users");
		result = ps.executeQuery();

		int i = 0;
		while (result.next()) {
			System.out.println(++i + " -> " + result.getString(1) + " "
					+ result.getString(2) + " " + result.getString(3));
		}

		System.out.println("Select SQL executed successfully ");
	}

	public void closeAll()	
	{
		//Housekeeping
		DbUtil.close(result);
		DbUtil.close(ps);
		DbUtil.close(conn);
		
	}
	
}
