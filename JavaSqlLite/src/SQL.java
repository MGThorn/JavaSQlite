import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL {
	public void deletDatabases() {
		Dbmanipulation.create("drop table if exists Pfleger");
		Dbmanipulation.create("drop table if exists Gehege");
		Dbmanipulation.create("drop table if exists Tier");
		Dbmanipulation.create("drop table if exists Art");
		Dbmanipulation.create("drop table if exists Futter");
		
	}
	public void createDatabases() {

		Dbmanipulation.create("create table Pfleger (PNummer integer PRIMARY KEY, Nachname string, Vorname string, Geburtsdatum integer, PLZ integer, Ort string, StraßeNr string, Tel integer, Eintrittsdatum integer, Gehalt integer)");
		Dbmanipulation.create("create table Gehege (GName string PRIMARY KEY, Fläche integer, Baujahr integer,PNummer integer, FOREIGN KEY(PNummer) REFERENCES Pfleger(PNummer))");
		Dbmanipulation.create("create table Art (Bezeichnung string PRIMARY KEY, LatBezeichnung string, Lebensraum string)");
		Dbmanipulation.create("create table Tier (TName string PRIMARY KEY, GebDatum integer, Geschlecht char, Zugangsdatum integer, Abgangsdatum integer,GName string, Bezeichnung string, FOREIGN KEY(Bezeichnung) REFERENCES Art(Bezeichnung), FOREIGN KEY(GName) REFERENCES Gehege(GName))");
		Dbmanipulation.create("create table Futter (Bezeichnung string PRIMARY KEY)");
		
		//TODO 
		//Dbmanipulation.create("create table pflegt ()");
		// need to implement PRIMARY and FOREIGN keys 
		//Dbmanipulation.create("create table wird_gefüttert_mit ()");
		// need to implement PRIMARY and FOREIGN keys 
		
	}
	//This is an example
	public void insert/*name*/() {
		Dbmanipulation.insert("insert into Pfleger values(1, 'leo der Löw', 'luis der Pfleger',205025,'Anschriftjiwqjd',74565464564,11042000,4500)");
		Dbmanipulation.insert("insert into Pfleger values(2, 'peper der Pinguin', 'Paul der Pfleger',205025,'Anschriftjiwqjd',74565464564,11042000,4500)");
		
	}
	//This is an example
	public void select/*name*/() {

		ResultSet rs = Dbquery.select("select * from Pfleger");
		    try {
				while(rs.next()){
				 		int maxColumns = rs.getMetaData().getColumnCount();
				 		for(int i = 1;i<maxColumns;i++) {
				 			System.out.println(rs.getMetaData().getColumnName(i));
				 			System.out.println(rs.getString(i));
	
				 	
				 	}
				  }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void insertTier(String TName, String GebDatum, String Geschlecht, String Zugangsdatum, String Abgangsdatum, String GName, String ABezeichnung) {
		
		int GDatum = Integer.parseInt(GebDatum);
		int ZDatum = Integer.parseInt(Zugangsdatum);
		int ADatum = Integer.parseInt(Abgangsdatum);
		
		char g = Geschlecht.charAt(0);
		
		Dbmanipulation.insert("insert into Tier values('"+TName+"', "+GDatum+", '"+g+"',"+ZDatum+","+ADatum+",'"+GName+"','"+ABezeichnung+"')");
		
	}
	public String selectTiere() {

		ResultSet rs = null;
		String ret = "";
		    try {
		    	rs =Dbquery.select("select * from Tier");
		    	int maxColumns = rs.getMetaData().getColumnCount();
		    	for(int i = 1;i<maxColumns;i++) {
		 			ret += rs.getMetaData().getColumnName(i);
		 			ret += " ";
		    	}
				while(rs.next()){
					ret += " \n ";
				 		for(int i = 1;i<maxColumns;i++) {
				 			ret += rs.getString(i);
				 			ret +=" ";
				 			System.out.print(rs.getMetaData().getColumnName(i));
				 			System.out.println(" : "+rs.getString(i));
				 		}
				 		
				  }
				return ret;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "";
			}
	}

}
