import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	public static Connection connect() {
		Connection con =null;
		
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:Zoo.db");
			//System.out.println("Connected Database");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e+"");
		}
		
		return con;
		
	}

}
