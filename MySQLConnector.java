package com.dankook.Study_JAVA.myTest;

import java.sql.Connection;
import java.sql.SQLException;


public class MySQLConnector {
	private Connection conn;
	
	public MySQLConnector() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		this.conn = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/recommend_tour?autoReconnect=true&useSSL=false", 
													"root", 
													"99189918");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn(){
		return this.conn;
	}
	
	public void closeConn() throws SQLException{
		this.conn.close();
		return;
	}
	
}
