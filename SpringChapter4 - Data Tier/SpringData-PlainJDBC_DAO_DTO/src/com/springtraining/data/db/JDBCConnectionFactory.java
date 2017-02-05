package com.springtraining.data.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class JDBCConnectionFactory {
    //would ideally be in some externalised property file
    private static JDBCConnectionFactory instance = new JDBCConnectionFactory();
    public static final String URL = "jdbc:mysql://localhost:3306/test";
    public static final String USER = "sqlroot";
    public static final String PASSWORD = "springpass";
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
 
    //private constructor
    private JDBCConnectionFactory() {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
 
    private Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }   
 
    public static Connection getConnection() {
        return instance.createConnection();
    }
}