package database;

import java.sql.*;

public class ConnectToDB {
	public static Connection con;

	// private static void main(String args[]) throws Exception {
	public ConnectToDB() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sid", "sid");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from produkty");
		while (rs.next()) {
			System.out.println(rs.getInt(4) + rs.getString(1) + rs.getString(2) + rs.getString(3));
		}

		rs.close();
		st.close();
		con.close();
	}
}
