package com.hospitalmanagment.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static final String url=
			"jdbc:mysql://localhost:3306/hospitalmanagment";
	
	private static final String USER= 
			"root";
	
	private static final String PASSWORD=
			"9730";
	
	public static Connection getConnection() {
		Connection connection =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(
					url,USER,PASSWORD);
		}catch(Exception ex) {
			
			ex.printStackTrace();
		}
		return connection;
		
		
	}

}
