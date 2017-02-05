package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * 
 * @author zfu
 */
public class BankDBService {
	private Connection conn = null;
	private String db_user = "root";
	private String db_password = "850326";
	private String db_url = "jdbc:mysql://localhost/yourdatabase?useUnicode=true&amp;characterEncoding=utf-8";
	private String db_driver = "org.gjt.mm.mysql.Driver";
	private Statement stmt = null;
	private ResultSet rs = null;

	public void initConnection() {
		try {
			Class.forName(db_driver);
			conn = DriverManager.getConnection(db_url, db_user, db_password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList queryStu(String stuId) {
		ArrayList stus = new ArrayList();
		// String sql =
		// "Select LNAME,FNAME,MAJOR from test_students where ID= '" + stuId +
		// "'";
		String sql = "Select LNAME,FNAME,MAJOR from test_students";
		if (stuId != null && stuId.trim().length() != 0) {
			sql += " where ID = '" + stuId + "'";
		}
		try {
			this.initConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				// Student stu = new Student();
				// stu.setStuLname(rs.getString("LNAME"));
				// stu.setStuFname(rs.getString("FNAME"));
				// stu.setStuMajor(rs.getString("MAJOR"));
				// stus.add(stu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeConn();
		}
		return stus;
	}

	public int updateStu(String stuId, String stuMajor) {
		String sql = "update test_students set MAJOR='" + stuMajor
				+ "' where ID='" + stuId + "'";
		try {
			this.initConnection();
			stmt = conn.createStatement();
			int i = stmt.executeUpdate(sql);
			if (i != 0) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeConn();
		}
		return 1;
	}

	public void closeConn() {
		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}