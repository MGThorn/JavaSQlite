


public class mainClass {
	static SQL s = new SQL();
	public static void main(String [] args) {
		s.deletDatabases();
		s.createDatabases();
		
		//s.insert();
		s.insertTier("lon","1982","m�nlich", "1984", "1988", "", "");
		s.insertTier("luis","1982","m�nlich", "1984", "1988", "", "");
		System.out.println(s.selectTiere());
		System.out.println("blablabla   \n     blabla");
		
	}
	
	

}
