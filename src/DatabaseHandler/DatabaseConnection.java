package DatabaseHandler;

import java.sql.*;

public class DatabaseConnection {

	private Connection con;
	
	public DatabaseConnection() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net/sql6159440", "sql6159440", "PNBTvdYQ4m");
		//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root", "");				
	}
	
	public Connection getConnection() {				
		return con;				
	}
	
	

}
