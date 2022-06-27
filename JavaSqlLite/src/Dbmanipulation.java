import java.sql.*;
import java.sql.Connection;


public class Dbmanipulation {
	public static void create(String sql) {
		  Connection con = Dbconnection.connect();
		  Statement st = null; 
		  try {
			st=con.createStatement();
		    st.executeUpdate(sql);
		    System.out.println("Table has been created/droped");
		  } catch(SQLException e) {
			  System.err.println(e);
		    // always remember to close database connections
		  } finally {
		    try{
		      st.close();
		      con.close();
		    } catch(SQLException e) {
		      System.out.println(e.toString());
		    }
		    
		  }
		}
	public static void insert(String sql) {
		  Connection con = Dbconnection.connect();
		  Statement st = null; 
		  try {
			st=con.createStatement();
		    st.executeUpdate(sql);
		    System.out.println("Data has been inserted");
		  } catch(SQLException e) {
			  System.err.println(e);
		    // always remember to close database connections
		  } finally {
		    try{
		      st.close();
		      con.close();
		    } catch(SQLException e) {
		      System.out.println(e.toString());
		    }
		    
		  }
		}
	public static void delete(String sql) {
		  Connection con = Dbconnection.connect();
		  Statement st = null; 
		  try {
			st=con.createStatement();
		    st.executeUpdate(sql);
		    System.out.println("Data has been deleted");
		  } catch(SQLException e) {
			  System.err.println(e);
		    // always remember to close database connections
		  } finally {
		    try{
		      st.close();
		      con.close();
		    } catch(SQLException e) {
		      System.out.println(e.toString());
		    }
		    
		  }
		}

}
