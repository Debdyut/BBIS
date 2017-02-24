package DatabaseHandler;

import java.sql.*;

public class DatabaseHandler {

	Connection con;		
	
	public DatabaseHandler () {
		try {
			con = new DatabaseConnection().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

	public ResultSet read(String str) throws SQLException {		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(str);				
		return rs;
	}
	
	public void update(String str) throws SQLException {
		Statement st = con.createStatement();
		st.executeUpdate(str);		
		st.close();
	}
	
	
}
