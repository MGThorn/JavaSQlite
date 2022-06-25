import java.sql.*;
import java.sql.Connection;



public class Dbquery {
	
	public static ResultSet select(String sql) {
		  Connection con = Dbconnection.connect();
		  Statement st = null; 
		  ResultSet rs = null;
		  try {

			  if(sql.substring(0, 6).equalsIgnoreCase("select")) {
				st=con.createStatement();
			    rs= st.executeQuery(sql);
			    
			    /*
			     *  for reading the complete ResultSet use:
			     *   while(rs.next()){
		         *		int maxColumns = rs.getMetaData().getColumnCount();
		         *		for(int i = 1;i<maxColumns;i++) {
		         *			
		         *				YOUR ACTION
		         *	
		         *	}
		         * }
		         */
			  }else {
				  System.out.println("!!! only for select");
			  }
			  return rs;
		    
		  } catch(SQLException e) {
			  System.err.println(e+" query failed!");
			  return null;
		  } 
		}

}
