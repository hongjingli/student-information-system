package javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconntion {
private static Connection con = null;
	
	public static Connection getConnection(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/managedb?useUnicode=true&characterEncoding=utf8";
			con = DriverManager.getConnection(url,"root","root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close() {
		
		try {
			if(con != null && !con.isClosed()){
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
