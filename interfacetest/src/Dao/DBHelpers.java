package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHelpers {	

	public static final String url = "jdbc:mysql://localhost:3306/northwind1"; 
	//public static final String name = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  com.mysql.jdbc.Driver
	public static final String name = "com.mysql.jdbc.Driver"; 
    public static final String user = "root";    
    public static final String password = "root";  
    
    
	public Connection conn = null;
	public PreparedStatement pre = null;

	public DBHelpers(String sql) {
		try {
			Class.forName(name);//
			conn = DriverManager.getConnection(url,user,password);//
			pre = conn.prepareStatement(sql);//
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection con=null;
		try {
			Class.forName(name);
			con=DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public void close() {
		try {
			this.conn.close();
			this.pre.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
