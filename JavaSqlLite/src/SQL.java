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

		Dbmanipulation.create("create table Pfleger (PNummer integer PRIMARY KEY, TName string, Name string, Geburtsdatum integer, Anschrift string, Tel integer, Eintrittsdatum integer, Gehalt integer)");
		Dbmanipulation.create("create table Gehege (GName string PRIMARY KEY, Fläche integer, Bahjahr integer,PNummer integer, FOREIGN KEY(PNummer) REFERENCES Pfleger(PNummer))");
		Dbmanipulation.create("create table Art (Bezeichnung string PRIMARY KEY, LBezeichnung string, Lebensraum string)");
		Dbmanipulation.create("create table Tier (TName string PRIMARY KEY, GebDatum integer, Geschlecht char, Zugangsdatum integer, Abgangsdatum integer,GName string, Bezeichnung string, FOREIGN KEY(Bezeichnung) REFERENCES Art(Bezeichnung), FOREIGN KEY(GName) REFERENCES Gehege(GName))");
		Dbmanipulation.create("create table Futter (Bezeichnung string PRIMARY KEY)");
		
		//TODO 
		//Dbmanipulation.create("create table pflegt ()");
		// need to implement PRIMARY and FOREIGN keys 
		//Dbmanipulation.create("create table wird_gefüttert_mit ()");
		// need to implement PRIMARY and FOREIGN keys 
		
	}
	public void insert/*name*/() {
		Dbmanipulation.insert("insert into Pfleger values(1, 'leo der Löw', 'luis der Pfleger',205025,'Anschriftjiwqjd',74565464564,11042000,4500)");
		Dbmanipulation.insert("insert into Pfleger values(2, 'peper der Pinguin', 'Paul der Pfleger',205025,'Anschriftjiwqjd',74565464564,11042000,4500)");
		
	}
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
	

}
