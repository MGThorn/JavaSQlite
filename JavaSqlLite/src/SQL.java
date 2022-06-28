import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL {
	public void deletDatabases() {
		Dbmanipulation.create("drop table if exists Pfleger");
		Dbmanipulation.create("drop table if exists Gehege");
		Dbmanipulation.create("drop table if exists Tier");
		Dbmanipulation.create("drop table if exists Art");
		Dbmanipulation.create("drop table if exists Futter");
		Dbmanipulation.create("drop table if exists pflegt");
		Dbmanipulation.create("drop table if exists wird_gefuettert_mit");
		
	}
	public void createDatabases() {

		Dbmanipulation.create("create table Pfleger (PNummer integer PRIMARY KEY, Nachname string, Vorname string, Geburtsdatum integer, PLZ integer, Ort string, StraßeNr string, Tel integer, Eintrittsdatum integer, Gehalt integer)");
		Dbmanipulation.create("create table Gehege (GName string PRIMARY KEY, Fläche integer, Baujahr integer,PNummer integer, FOREIGN KEY(PNummer) REFERENCES Pfleger(PNummer))");
		Dbmanipulation.create("create table Art (ABezeichnung string PRIMARY KEY, LatBezeichnung string, Lebensraum string)");
		Dbmanipulation.create("create table Tier (TName string PRIMARY KEY, GebDatum integer, Geschlecht char, Zugangsdatum integer, Abgangsdatum integer,GName string, ABezeichnung string, FOREIGN KEY(ABezeichnung) REFERENCES Art(ABezeichnung), FOREIGN KEY(GName) REFERENCES Gehege(GName))");
		Dbmanipulation.create("create table Futter (FBezeichnung string PRIMARY KEY)");
		
		Dbmanipulation.create("create table pflegt (PNummer string, TName string)");
		Dbmanipulation.create("create table wird_gefuettert_mit (TName string, FBezeichnung string, Menge integer, Uhrzeit integer)");
		// need to implement PRIMARY and FOREIGN keys 
		
	}
	//This is an example
	public void insert/*name*/() {
		Dbmanipulation.insert("insert into Pfleger values(1, 'leo der Löw', 'luis der Pfleger',205025,'Anschriftjiwqjd',74565464564,11042000,4500)");
		Dbmanipulation.insert("insert into Pfleger values(2, 'peper der Pinguin', 'Paul der Pfleger',205025,'Anschriftjiwqjd',74565464564,11042000,4500)");
		
	}
	//This is an example
	public void select/*name*/() {

		ResultSet rs = Dbquery.select("select * from "/*TableName*/);
		    try {
				while(rs.next()){
				 		int maxColumns = rs.getMetaData().getColumnCount();
				 		for(int i = 1;i<maxColumns;i++) {
				 			System.out.println(rs.getMetaData().getColumnName(i));
				 			System.out.println(rs.getString(i));
	
				 	
				 	}
				  }
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	
	//insert for all Tables
	public void insertTier(String TName, String GebDatum, String Geschlecht, String Zugangsdatum, String Abgangsdatum, String GName, String ABezeichnung) {
		
		int GDatum = Integer.parseInt(GebDatum);
		int ZDatum = Integer.parseInt(Zugangsdatum);
		int ADatum = Integer.parseInt(Abgangsdatum);
		System.out.println(ABezeichnung); // prints nothing varible is empty
		char g = Geschlecht.charAt(0);
		Dbmanipulation.insert("insert into Tier values('"+TName+"', "+GDatum+", '"+g+"',"+ZDatum+","+ADatum+",'"+GName+"','"+ABezeichnung+"')");
		
	}
	public void insertPfleger(String PNummer, String Nachname, String Vorname, String Geburtsdatum, String PLZ, String Ort, String StraßeNr, String Tel, String Eintrittsdatum, String Gehalt) {
		int GDatum = Integer.parseInt(Geburtsdatum);
		int plz = Integer.parseInt(PLZ);
		int tel = Integer.parseInt(Tel);
		int EDatum = Integer.parseInt(Eintrittsdatum);
		int gehalt = Integer.parseInt(Gehalt);
		
		
		
		Dbmanipulation.insert("insert into Pfleger values('"+PNummer+"', '"+Nachname+"', '"+Vorname+"',"+GDatum+","+plz+",'"+Ort+"','"+StraßeNr+"',"+tel+","+EDatum+","+gehalt+")");
		
	}
	public void insertGehege(String GName, String Fläche, String Baujahr, String PNummer) {

		int fläche = Integer.parseInt(Fläche);
		int baujahr = Integer.parseInt(Baujahr);

		Dbmanipulation.insert("insert into Gehege values('"+GName+"', "+fläche+", '"+baujahr+"', '"+PNummer+"')");
		
	}
	public void insertArt(String Bezeichnung, String LatBezeichnung, String Lebensraum) {		
		Dbmanipulation.insert("insert into Art values('"+Bezeichnung+"', '"+LatBezeichnung+"', '"+Lebensraum+"')");
	}
	public void insertFutter(String Bezeichnung) {
		
		Dbmanipulation.insert("insert into Futter values('"+Bezeichnung+"')");
		
	}
	
	//select for all Tables
	public String selectTiere() {

		ResultSet rs = null;
		String ret = "";
		    try {
		    	rs =Dbquery.select("select * from Tier");
		    	int maxColumns = rs.getMetaData().getColumnCount();
		    	/*for(int i = 1;i<maxColumns;i++) {
		 			ret += rs.getMetaData().getColumnName(i);
		 			ret += " ";
		    	}
		    	*/
				while(rs.next()){
					ret += " \n ";
				 		for(int i = 1;i<=maxColumns;i++) {
				 			ret += rs.getString(i);
				 			ret +=", ";
				 			//System.out.print(rs.getMetaData().getColumnName(i));
				 			//System.out.println(" : "+rs.getString(i));
				 		}
				 		
				  }
				rs.close();
				return ret;
			} catch (SQLException e) {
				e.printStackTrace();
				return "";
			}
	}
	public String selectPfleger() {

		ResultSet rs = null;
		String ret = "";
		    try {
		    	rs =Dbquery.select("select * from Pfleger");
		    	int maxColumns = rs.getMetaData().getColumnCount();
				while(rs.next()){
					ret += " \n ";
				 		for(int i = 1;i<maxColumns;i++) {
				 			ret += rs.getString(i);
				 			ret +=", ";
				 			
				 		}
				 		
				  }
				return ret;
			} catch (SQLException e) {
				e.printStackTrace();
				return "";
			}
	}
	public String selectGehege() {

		ResultSet rs = null;
		String ret = "";
		    try {
		    	rs =Dbquery.select("select * from Gehege");
		    	int maxColumns = rs.getMetaData().getColumnCount();
				while(rs.next()){
					ret += " \n ";
				 		for(int i = 1;i<maxColumns;i++) {
				 			ret += rs.getString(i);
				 			ret +=", ";
				 		}
				 		
				  }
				return ret;
			} catch (SQLException e) {
				e.printStackTrace();
				return "";
			}
	}
	public String selectArt() {

		ResultSet rs = null;
		String ret = "";
		    try {
		    	rs =Dbquery.select("select * from Art");
		    	int maxColumns = rs.getMetaData().getColumnCount();
				while(rs.next()){
					ret += " \n ";
				 		for(int i = 1;i<maxColumns;i++) {
				 			ret += rs.getString(i);
				 			ret +=", ";
				 		}
				 		
				  }
				return ret;
			} catch (SQLException e) {
				e.printStackTrace();
				return "";
			}
	}
	public String selectFutter() {

		ResultSet rs = null;
		String ret = "";
		    try {
		    	rs =Dbquery.select("select * from Futter");
		    	int maxColumns = rs.getMetaData().getColumnCount();
				while(rs.next()){
					ret += " \n ";
				 		for(int i = 1;i<maxColumns;i++) {
				 			ret += rs.getString(i);
				 			ret +=", ";
				 		}
				 		
				  }
				return ret;
			} catch (SQLException e) {
				e.printStackTrace();
				return "";
			}
	}
	//Selects for Primary keys
	public String[] selectArt_Bezeichnung() {

		ResultSet rs = null;
		String ret [];
		    try {
		    	rs =Dbquery.select("select ABezeichnung from Art");
		    	
		    	ResultSet length = Dbquery.select("select COUNT(*) from Art");
		    	
		    	ret = new String[length.getInt(1)];
		    	
		    	int i =0;
				while(rs.next()){
					ret[i] = rs.getString(1);
					i++;
				 		
				  }
				rs.close();
				length.close();
				return ret;
			} catch (SQLException e) {
				e.printStackTrace();
	    		return null;
			}
	}
	public String[] selectGehege_Name() {

		ResultSet rs = null;
		String ret [];
		    try {
		    	rs =Dbquery.select("select GName from Gehege");
		    	
		    	ResultSet length = Dbquery.select("select COUNT(*) from Gehege");
		    	
		    	ret = new String[length.getInt(1)];
		    	
		    	int i =0;
				while(rs.next()){
					ret[i] = rs.getString(1);
					i++;
				 		
				  }
				rs.close();
				length.close();
				return ret;
			} catch (SQLException e) {
				e.printStackTrace();
	    		return null;
			}
	}
	
	public boolean deletTier(String TName) {
		
		try{
			Dbmanipulation.delete("DELETE FROM Tier WHERE TName ='"+TName+"'");
			return true;
		}catch(Exception ex) {
			System.err.println(ex);
			return false;
		}
		
	}
	public boolean deletPfleger(String NTier) {
		
		Dbmanipulation.delete(""/*TODO SQL befühl für löschen einfügen*/);
		return false;
	}
	public boolean deletGehege(String NTier) {
		
		Dbmanipulation.delete(""/*TODO SQL befühl für löschen einfügen*/);
		return false;
	}	
	public boolean deletArt(String NTier) {

		
		Dbmanipulation.delete(""/*TODO SQL befühl für löschen einfügen*/);
		return false;
	}
	
	public void changeTier(String TName, String GebDatum, String Geschlecht, String Zugangsdatum, String Abgangsdatum, String GName, String ABezeichnung) {
		
		
		int GDatum = Integer.parseInt(GebDatum);
		int ZDatum = Integer.parseInt(Zugangsdatum);
		int ADatum = Integer.parseInt(Abgangsdatum);
		
		char g = Geschlecht.charAt(0);
		Dbmanipulation.insert("UPDATE Tier SET GebDatum = "+GDatum+", Geschlecht = '"+g+"', Zugangsdatum = "+ZDatum+", Abgangsdatum = "+ADatum+", GName = '"+GName+"', ABezeichnung = '"+ABezeichnung+"' WHERE TName = '"+TName+"'" );
		
	}
	public void changePfleger(String TName, String GebDatum, String Geschlecht, String Zugangsdatum, String Abgangsdatum, String GName, String ABezeichnung) {
		//TODO auf Pfleger anpassen 
		int GDatum = Integer.parseInt(GebDatum);
		int ZDatum = Integer.parseInt(Zugangsdatum);
		int ADatum = Integer.parseInt(Abgangsdatum);
		
		char g = Geschlecht.charAt(0);
		
		Dbmanipulation.insert("insert into Tier values('"+TName+"', "+GDatum+", '"+g+"',"+ZDatum+","+ADatum+",'"+GName+"','"+ABezeichnung+"')");
		
	}
	public void changeGehege(String TName, String GebDatum, String Geschlecht, String Zugangsdatum, String Abgangsdatum, String GName, String ABezeichnung) {
		//TODO auf Gehege anpasssen
		int GDatum = Integer.parseInt(GebDatum);
		int ZDatum = Integer.parseInt(Zugangsdatum);
		int ADatum = Integer.parseInt(Abgangsdatum);
		
		char g = Geschlecht.charAt(0);
		
		Dbmanipulation.insert("insert into Tier values('"+TName+"', "+GDatum+", '"+g+"',"+ZDatum+","+ADatum+",'"+GName+"','"+ABezeichnung+"')");
		
	}
	public void changeArt(String TName, String GebDatum, String Geschlecht, String Zugangsdatum, String Abgangsdatum, String GName, String ABezeichnung) {
		//TODO auf Art anpassen
		int GDatum = Integer.parseInt(GebDatum);
		int ZDatum = Integer.parseInt(Zugangsdatum);
		int ADatum = Integer.parseInt(Abgangsdatum);
		
		char g = Geschlecht.charAt(0);
		
		Dbmanipulation.insert("insert into Tier values('"+TName+"', "+GDatum+", '"+g+"',"+ZDatum+","+ADatum+",'"+GName+"','"+ABezeichnung+"')");
		
	}
	public void changeFutter(String TName, String GebDatum, String Geschlecht, String Zugangsdatum, String Abgangsdatum, String GName, String ABezeichnung) {
		//TODO auf Futter anpassen
		int GDatum = Integer.parseInt(GebDatum);
		int ZDatum = Integer.parseInt(Zugangsdatum);
		int ADatum = Integer.parseInt(Abgangsdatum);
		
		char g = Geschlecht.charAt(0);
		
		Dbmanipulation.insert("insert into Tier values('"+TName+"', "+GDatum+", '"+g+"',"+ZDatum+","+ADatum+",'"+GName+"','"+ABezeichnung+"')");
		
	}
}
