package com.springtraining.data.dto;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;
 
public class UserRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUserId(rs.getInt("USER_ID"));
		user.setUserName(rs.getString("USERNAME"));
		user.setPassword(rs.getString("PASSWORD"));
		user.setActive(rs.getInt("ACTIVE"));
		user.setUserRoleId(rs.getString("USER_ROLE_ID"));
		return user;
	}
 
}