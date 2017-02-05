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

	public void createTable() {
		
		this.jdbcTemplate.execute("DROP TABLE IF EXISTS test.Test_Table");
		this.jdbcTemplate.execute("CREATE TABLE Test_Table (id integer, name varchar(100));");
		System.out.println("DDL call executed successfully ");
	}

	public void runStoredProcUpdatePassword(int id, String newPass) {

		this.jdbcTemplate.update(
		        "call test.updatePassword(?,?)", 
		        new Object[]{id, newPass});

		System.out.println("Stored procedure executed successfully ");
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
