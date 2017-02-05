package com.springtraining.data;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class JDBCCode {
	public static void main(String[] args) throws InterruptedException {

		String dburl = "jdbc:mysql://localhost:3306/test";
		String name = "sqlroot";
		String pass = "springpass";
		Connection conn = null;
		//DataSource ds = null;

		try {
			Driver driver = new com.mysql.jdbc.Driver();
			conn = DriverManager.getConnection(dburl, name, pass);

			//ds = new SimpleDriverDataSource(driver, dburl, name, pass);
			//conn = ds.getConnection();

			// CRUD - Create
			insertData(conn);
			// Thread.sleep(5000);
			System.out.println("\n**************insertData*****************\n");
			// CRUD - Read(find)
			findUser(conn, "1");
			System.out.println("\n**************findUser*****************\n");
			// CRUD - Read(All)
			displayAllUsers(conn);
			System.out.println("\n*************displayAllUsers******************\n");
			// CRUD - Update
			updateData(conn);
			// Thread.sleep(5000);
			System.out.println("\n*************updateData******************\n");
			// CRUD - Delete
			deleteData(conn);
			System.out.println("\n*************deleteData******************\n");
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}

	}

	private static void insertData(Connection conn) throws SQLException {

		String INSERT_SQL = "INSERT INTO test.users "
				+ "  (USER_ID, USERNAME, PASSWORD, ACTIVE, USER_ROLE_ID)  "
				+ "VALUES  (?,  ?,  ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(INSERT_SQL);
		ps.setInt(1, 5);
		ps.setString(2, "Rohit");
		ps.setString(3, "r123");
		ps.setInt(4, 1);
		ps.setString(5, "2");
		ps.executeUpdate();
		ps.close();
		System.out.println("Insert SQL executed successfully ");
	}

	private static void deleteData(Connection conn) throws SQLException {

		String INSERT_SQL = "DELETE FROM test.users WHERE USER_ID = ?";
		;
		PreparedStatement ps = conn.prepareStatement(INSERT_SQL);
		ps.setInt(1, 5);
		ps.executeUpdate();
		ps.close();
		System.out.println("Delete SQL executed successfully ");
	}

	private static void updateData(Connection conn) throws SQLException {

		String INSERT_SQL = "UPDATE test.users SET USERNAME = ?, PASSWORD = ? WHERE USER_ID =?";
		;
		PreparedStatement ps = conn.prepareStatement(INSERT_SQL);
		ps.setString(1, "Akbar");
		ps.setString(2, "qazwsx");
		ps.setInt(3, 5);
		ps.executeUpdate();
		ps.close();
		System.out.println("Update SQL executed successfully ");
	}

	private static void findUser(Connection conn, String ID)
			throws SQLException {

		PreparedStatement statement = conn
				.prepareStatement("select * from test.users where  USER_ID ="
						+ ID);
		ResultSet result = statement.executeQuery();

		while (result.next()) {
			System.out.println("Record Found -> " + result.getString(1)
					+ " " + result.getString(2) + " " + result.getString(3));
		}

		result.close();
		statement.close();
		System.out.println("Select SQL executed successfully ");
	}

	private static void displayAllUsers(Connection conn) throws SQLException {

		ResultSet result =null;
		//PreparedStatement
//		PreparedStatement statement = conn
//				.prepareStatement("select * from test.users");
//		ResultSet result = statement.executeQuery();

		//Plain Statement
		Statement statement=conn.createStatement();
		result=statement.executeQuery("select * from test.users");
		
		int i = 0;
		while (result.next()) {
			System.out.println(++i + " -> " + result.getString(1) + " "
					+ result.getString(2) + " " + result.getString(3));
		}

		result.close();
		statement.close();
		System.out.println("Select SQL executed successfully ");
	}
}
